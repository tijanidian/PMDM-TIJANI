package com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain

class SavePlayerUseCase(private val repository: PlayerRepository) {

    suspend fun execute(param: Param) {
        repository.save(param.toModel())
    }

    data class Param( val name: String, val surname: String, val comunity:String,val gender:String, val firstPosition:String, val seconPosition:String){

        fun toModel() = PlayerModel(name,surname,comunity,gender,firstPosition,seconPosition)

    }
}