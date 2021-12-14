package com.tijanidian.ex02_users_example.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.tijanidian.ex02_users_example.data.UserDataRepository
import com.tijanidian.ex02_users_example.domain.GetUserUseCase
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityUt02Ex02Binding


class Ut02Ex02Activity : AppCompatActivity() {

    private val viewModel=Ut02Ex02ViewModel(GetUserUseCase(UserDataRepository()))

    private val userAdapter=UserAdapter()

    private val bind: ActivityUt02Ex02Binding by lazy {
        ActivityUt02Ex02Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        //exampleInflateView()
        exampleRecyclerView()
        setUpView()
    }

    private fun setUpView(){
        bind.listUsers.adapter=userAdapter
        bind.listUsers.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }

    private fun exampleInflateView() {
        val view:View=layoutInflater.inflate(R.layout.view_item_ut02_ex02, bind.root,false)
        bind.wrapContent.addView(view)
    }

    private fun exampleRecyclerView(){
        val users=viewModel.getUsers()
        userAdapter.setItems(users)
    }



}