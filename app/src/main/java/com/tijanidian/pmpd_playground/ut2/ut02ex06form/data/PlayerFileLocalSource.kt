package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data

import android.content.Context
import com.tijanidian.pmpd_playground.commons.serializer.GsonSerializer
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball
import java.io.File

class PlayerFileLocalSource(
    private val context: Context,
    private val serializer: GsonSerializer
) {

    private val playerFile: File by lazy { buildFile() }

    fun save(player: PlayerModelFootball) {
        val players = fetch().toMutableList()
        players.add(player)
        save(players)
    }

    fun save(players: List<PlayerModelFootball>) {
        clearFile()
        players.map { playertModelFootbal ->
            playerFile.appendText(
                serializer.toJson(
                    playertModelFootbal,
                    PlayerModelFootball::class.java
                ) + System.lineSeparator()
            )
        }
    }


    fun update(player: PlayerModelFootball) {
        val players = fetch().toMutableList()
        val indexPlayer = players.indexOfFirst { item -> item.idPlayer == player.idPlayer }
        if (indexPlayer >= 0) {
            players[indexPlayer] = player
        } else {
            players.add(player)
        }
        save(players)
    }

    fun remove(playerId: Int) {
        val players = fetch().toMutableList()
        val indexPlayer = players.indexOfFirst { item -> item.idPlayer == playerId }
        if (indexPlayer >= 0) {
            players.removeAt(indexPlayer)
        }
        save(players)
    }

    fun fetch(): List<PlayerModelFootball> {
        val players: MutableList<PlayerModelFootball> = mutableListOf()
        val lines = playerFile.readLines()
        lines.map { line ->
            val alertModel = serializer.fromJson(line, PlayerModelFootball::class.java)
            players.add(alertModel)
        }
        return players
    }

    fun findById(playerId: Int): PlayerModelFootball? {
        val players = fetch()
        return players.firstOrNull { item -> item.idPlayer == playerId }
    }

    private fun clearFile() {
        playerFile.writeText("")
    }

    fun deleteFiles() {
        playerFile.delete()
    }

    private fun buildFile(): File {
        val file = File(context.filesDir, AAD_FILE_PLAYERS)
        if (!file.exists()) {
            file.createNewFile()
        }
        return file
    }

    companion object {
        const val AAD_FILE_PLAYERS: String = "file_players.txt"
    }
}