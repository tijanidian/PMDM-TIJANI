package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data

import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local.file.PlayerFileLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerRepository

class PlayerDataRepository(private val playerFileLocalSource: PlayerFileLocalSource):PlayerRepository {
    override suspend fun save(playerModel: PlayerModelFootball) {
        playerFileLocalSource.save(playerModel)
    }

    override suspend fun fetch(): List<PlayerModelFootball> {
        val player=playerFileLocalSource.fetch()
        return player
    }
}