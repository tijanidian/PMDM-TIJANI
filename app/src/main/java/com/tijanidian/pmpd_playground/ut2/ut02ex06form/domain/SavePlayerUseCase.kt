package com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain

class SavePlayerUseCase(private val repository: PlayerRepository) {

    suspend fun execute(param: Param) {
        repository.save(param)
    }

    data class Param(val name: String, val surname: String)

}