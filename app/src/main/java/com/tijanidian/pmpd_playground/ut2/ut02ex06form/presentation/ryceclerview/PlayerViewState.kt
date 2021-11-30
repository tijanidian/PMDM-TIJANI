package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview

import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball

data class PlayerViewState(
    val idPlayer:Int,
    val name:String,
    val community:String,
    val sex:String,
    val firtsPosition:String,
    val secondPosition:String,
){
    companion object{
        fun fromPlayerModel(playerModelFootball: PlayerModelFootball)= PlayerViewState(
            playerModelFootball.idPlayer,
            playerModelFootball.name,
            playerModelFootball.community,
            playerModelFootball.sex,
            playerModelFootball.firtsPosition,
            playerModelFootball.secondPosition
        )
    }
}