package com.tijanidian.mvvm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.tijanidian.pmpd_playground.R

class MvvmActivity : AppCompatActivity() {
    private val viewMode:MvvmViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
        render()
    }

    private fun render(){
        val mvvmModel=viewMode.getAllMvvm()

    }
}