package com.tijanidian.ex02_users_example.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.databinding.ViewItemUt02Ex02Binding

//Recibe por constructor una vista y extiende de Reclycler
class UserViewHolder(view:View):RecyclerView.ViewHolder(view) {
    private val bind=ViewItemUt02Ex02Binding.bind(view)

    fun render(userViewState: UserViewState){
            bind.labelName.text=userViewState.fullName
            bind.labelAge.text=userViewState.age

            //Para interactuar con la vista
            itemView.setOnClickListener {
                //Permite cambiar de actividad

            }

    }


}