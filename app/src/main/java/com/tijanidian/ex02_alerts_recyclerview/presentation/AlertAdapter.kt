package com.tijanidian.ex02_alerts_recyclerview.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.ex02_users_example.presentation.UserViewState
import com.tijanidian.pmpd_playground.R

class AlertAdapter:RecyclerView.Adapter<AlertViewHolder>() {
    private  val dataSet:MutableList<AlertViewState> = mutableListOf()
    fun setItems(items:List<AlertViewState>){
        dataSet.clear()
        addItems(items)
        //Visualizar en pantalla
        notifyDataSetChanged()
    }

    fun addItems(items:List<AlertViewState>){
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertViewHolder {
        val view=LayoutInflater.from((parent.context))
            .inflate(R.layout.view_item_ut02_recycler, parent,false)
        return AlertViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlertViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}