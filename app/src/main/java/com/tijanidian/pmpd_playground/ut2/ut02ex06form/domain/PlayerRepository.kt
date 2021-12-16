package com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain

interface PlayerRepository {
    suspend fun save(playerModel: PlayerModel)
    suspend fun fetch(): List<PlayerModel>

}