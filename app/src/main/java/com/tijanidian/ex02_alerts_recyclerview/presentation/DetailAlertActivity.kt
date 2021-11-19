package com.tijanidian.ex02_alerts_recyclerview.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tijanidian.ex02_alerts_recyclerview.app.RetrofitApiClient
import com.tijanidian.ex02_alerts_recyclerview.data.AlertDataRepository
import com.tijanidian.ex02_alerts_recyclerview.data.AlertRemoteSource
import com.tijanidian.ex02_alerts_recyclerview.domain.FindAlertUseCase
import com.tijanidian.pmpd_playground.R

class DetailAlertActivity : AppCompatActivity() {

    private val viewModel = DetailAlertViewModel(
        FindAlertUseCase(
            AlertDataRepository(
                AlertRemoteSource(RetrofitApiClient())
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon)
        loadAlert()
    }

    private fun getAlertId(): String =
        intent.extras!!.getString(KEY_USER_ID, "0")

    private fun loadAlert() {
        Thread {
            val alert = viewModel.getALert(getAlertId())
            runOnUiThread {
               // bind
            }
        }.start()

    }

    companion object {
        private val KEY_USER_ID = "Key_user_id"

        fun getIntent(context: Context, id: String): Intent {
            val intent = Intent(context, DetailAlertActivity::class.java)
            intent.putExtra(KEY_USER_ID, id)
            return intent
        }

    }
}