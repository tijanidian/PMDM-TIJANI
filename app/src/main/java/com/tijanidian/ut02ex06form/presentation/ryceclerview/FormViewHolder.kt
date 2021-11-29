package com.tijanidian.ut02ex06form.presentation.ryceclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.databinding.ViewItemPlayerBinding
import com.tijanidian.ut02ex06form.presentation.PlayerViewState

class FormViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {
    private val bind= ViewItemPlayerBinding.bind(view)


    fun render(playerViewState: PlayerViewState){
        bind.infoName.text=playerViewState.name
        bind.infoCommunity.text=playerViewState.community
        bind.infoSex.text=playerViewState.sex
        bind.infoPosition.text=playerViewState.firtsPosition
        bind.infoSeconPosition.text=playerViewState.secondPosition
    }

}