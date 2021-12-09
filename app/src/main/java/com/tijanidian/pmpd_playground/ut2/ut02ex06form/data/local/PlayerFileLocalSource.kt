package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local

import android.content.Context
import com.tijanidian.pmpd_playground.commons.serializer.GsonSerializer
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.PlayerLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball
import java.io.File

class PlayerFileLocalSource(
    private val context: Context,
    private val serializer: GsonSerializer
) : PlayerLocalSource {

    private val playerFile: File by lazy { buildFile() }

    private fun buildFile(): File {
        val file = File(context.filesDir, AAD_PLAYER)
        if (!file.exists()) {
            file.createNewFile()
        }
        return file
    }

    override suspend fun save(playerModelFootball: PlayerModelFootball) {
        val player = fetch().toMutableList()
        player.add(playerModelFootball)
        save(player)

    }

    override suspend fun save(playerModelFootball: List<PlayerModelFootball>) {
        deleteFile()
        playerModelFootball.map {
            playerFile.appendText(
                serializer.toJson(
                    it,
                    PlayerModelFootball::class.java
                ) + System.lineSeparator()
            )
        }
    }

    override suspend fun fetch(): List<PlayerModelFootball> {
        val players: MutableList<PlayerModelFootball> = mutableListOf()
        val lines = playerFile.readLines()
        lines.map { line ->
            val playerModel = serializer.fromJson(line, PlayerModelFootball::class.java)
            players.add(playerModel)
        }
        return players
    }

    fun deleteFile() {
        if (playerFile.exists()) {
            playerFile.delete()
        }
    }

    companion object {
        const val AAD_PLAYER: String = "player_list.txt"
    }
}



