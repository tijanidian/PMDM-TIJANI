package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.R

class PlayerAdapter : RecyclerView.Adapter<PlayerViewHolder>() {

    private val dataSet: MutableList<PlayerViewState> = mutableListOf()


    fun setItems(items: List<PlayerViewState>) {
        dataSet.clear()
        addItems(items)
    }

    fun addItems(items: List<PlayerViewState>) {
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_player, parent, false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}