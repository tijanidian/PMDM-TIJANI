package com.tijanidian.ut02ex06form.presentation

import com.tijanidian.ut02ex06form.domain.PlayerModelFootball

data class PlayerViewState(
    val name:String,
    val community:String,
    val sex:String,
    val firtsPosition:String,
    val secondPosition:String,
){
    companion object{
        fun fromPlayerModel(playerModelFootball: PlayerModelFootball)= PlayerViewState(
            playerModelFootball.name,
            playerModelFootball.community,
            playerModelFootball.sex,
            playerModelFootball.firtsPosition,
            playerModelFootball.secondPosition
        )
    }
}