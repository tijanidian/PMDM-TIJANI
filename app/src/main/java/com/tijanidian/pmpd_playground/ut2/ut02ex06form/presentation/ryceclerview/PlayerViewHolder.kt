package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.databinding.ViewItemPlayerBinding

class PlayerViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {
    private val bind= ViewItemPlayerBinding.bind(view)


    fun render(playerViewState: PlayerViewState){
        bind.infoName.text=playerViewState.name
        bind.infoCommunity.text=playerViewState.community
        bind.infoGender.text=playerViewState.sex
        bind.infoPosition.text=playerViewState.firstPosition
        bind.infoSeconPosition.text=playerViewState.secondPosition
    }

}