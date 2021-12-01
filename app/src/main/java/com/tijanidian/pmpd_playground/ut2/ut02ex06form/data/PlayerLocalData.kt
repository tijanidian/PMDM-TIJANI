package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data

import android.content.Context
import com.tijanidian.pmpd_playground.commons.serializer.JsonSerializer
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModel
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball
import java.io.File

class PlayerLocalData(
    private val context: Context,
    private val serializer: JsonSerializer
) {
    private lateinit var customerFile:File

    private fun buildFile() {
        customerFile = File(context.filesDir, AAD_PLAYER)
        if (!customerFile.exists()) {
            customerFile.createNewFile()
        }
    }


    fun save(playerModelFootball: PlayerModelFootball){
        val player=fetch().toMutableList()
        player.add(playerModelFootball)

    }

    fun save(playerModelFootball: List<PlayerModelFootball>){
        deleteFile()
        playerModelFootball.forEach {
            save(it)
        }
    }


    fun fetch():List<PlayerModelFootball>{
        val players:MutableList<PlayerModelFootball> = mutableListOf()
        val lines=customerFile.readLines()
        lines.map {
            val playerModel=serializer.fromJson(it,PlayerModelFootball::class.java)
            players.add(playerModel)
        }
        return players
    }

    fun deleteFile() {
        if (customerFile.exists()) {
            customerFile.delete()
        }
    }

    companion object {
        const val AAD_PLAYER: String = "player_list.txt"
    }
}