package com.tijanidian.mvvm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.tijanidian.pmpd_playground.R

class AlertActivity : AppCompatActivity() {
    private val viewMode:AlertViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        render()
    }

    private fun render(){
        val mvvmModel=viewMode.getAllMvvm()

    }
}