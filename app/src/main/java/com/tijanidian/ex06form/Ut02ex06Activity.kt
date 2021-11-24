package com.tijanidian.ex06form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityUt02ex06Binding

class Ut02ex06Activity : AppCompatActivity() {
    private val binding:ActivityUt02ex06Binding by lazy{
        ActivityUt02ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }


}