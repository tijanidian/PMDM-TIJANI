package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local

import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModel


interface PlayerLocalSource {
    suspend fun save(playerModel: PlayerModel)
    suspend fun save(playerModel: List<PlayerModel>)
    suspend fun fetch(): List<PlayerModel>
}



