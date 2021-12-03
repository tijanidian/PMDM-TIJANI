package com.tijanidian.ex02_users_example.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.R

class UserAdapter:RecyclerView.Adapter<UserViewHolder>() {

    private  val dataSet:MutableList<UserViewState> = mutableListOf()

    fun setItems(items:List<UserViewState>){
        dataSet.clear()
        addItems(items)
        //Visualizar en pantalla
        notifyDataSetChanged()
    }

    fun addItems(items:List<UserViewState>){
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout
                .view_item_ut02_ex02,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}