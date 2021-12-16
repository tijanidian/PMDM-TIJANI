package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data

import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local.PlayerLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local.file.PlayerFileLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModel
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerRepository

class PlayerDataRepository(private val playerLocalSource: PlayerLocalSource):PlayerRepository {
    override suspend fun save(playerModel: PlayerModel) {
        playerLocalSource.save(playerModel)
    }

    override suspend fun fetch(): List<PlayerModel> {
        val player=playerLocalSource.fetch()
        return player
    }
}