package com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain

class GetPlayerUseCase(private val repository: PlayerRepository) {

    suspend fun execute():List<PlayerModel>{
        return repository.fetch()
    }
}