package com.tijanidian.ex02_alerts_recyclerview.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tijanidian.pmpd_playground.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon)


    }

    companion object {
        private val KEY_USER_ID = "Key_user_id"

        fun getIntent(context: Context, id: String): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(KEY_USER_ID, id)
            return intent
        }
    }
}