package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.databinding.ViewItemPlayerBinding

class PlayerViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {
    private val bind= ViewItemPlayerBinding.bind(view)


    fun render(playerViewState: PlayerViewState){
        bind.labelName.text=playerViewState.name
        bind.labelCommunity.text=playerViewState.community
        bind.labelGender.text=playerViewState.gender
        bind.labelFirstPosition.text=playerViewState.firstPosition
        bind.labelSeconPosition.text=playerViewState.secondPosition
    }

}