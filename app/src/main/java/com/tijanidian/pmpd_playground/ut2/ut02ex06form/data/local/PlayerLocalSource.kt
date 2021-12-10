package com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local

import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball


interface PlayerLocalSource {
    suspend fun save(playerModelFootball: PlayerModelFootball)
    suspend fun save(playerModelFootball: List<PlayerModelFootball>)
    suspend fun fetch(): List<PlayerModelFootball>
}



