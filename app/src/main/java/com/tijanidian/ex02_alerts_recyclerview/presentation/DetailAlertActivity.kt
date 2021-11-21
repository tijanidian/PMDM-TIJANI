package com.tijanidian.ex02_alerts_recyclerview.presentation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tijanidian.ex02_alerts_recyclerview.app.RetrofitApiClient
import com.tijanidian.ex02_alerts_recyclerview.data.AlertDataRepository
import com.tijanidian.ex02_alerts_recyclerview.data.AlertRemoteSource
import com.tijanidian.ex02_alerts_recyclerview.domain.FindAlertUseCase
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityDetailAlertBinding


class DetailAlertActivity : AppCompatActivity() {

    private val bind: ActivityDetailAlertBinding by lazy {
        ActivityDetailAlertBinding.inflate(layoutInflater)
    }

    private val viewModel = DetailAlertViewModel(
        FindAlertUseCase(
            AlertDataRepository(
                AlertRemoteSource(RetrofitApiClient())
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        loadAlert()
        setupToolbar()
    }

    private fun getAlertId(): String {
        return  intent.extras!!.getString(KEY_USER_ID, "0")
    }


    private fun loadAlert() {
        Thread{
            val alert = viewModel.getAlert(getAlertId())
            Log.d("@dev","$alert")
            runOnUiThread {
                if (alert != null) {
                    if (alert.type==1){
                        bind.avatarIcon.setImageResource(R.drawable.ic_warning)
                    }else{
                        bind.avatarIcon.setImageResource(R.drawable.ic_danger)
                    }
                    bind.mainTitle.text = alert.title


                    bind.datePublished.text = alert.date

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                       bind.bodyContainer.setText(Html.fromHtml(alert.body, Html.FROM_HTML_MODE_COMPACT))
                    }else{
                            null
                    }
                }
            }
        }.start()


    }

    private fun setupToolbar() {
        setSupportActionBar(bind.mainBar)
        supportActionBar?.title = getString(R.string.text_informacion)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add -> {
                Toast.makeText(this, "Suuuuuu", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_privacy->{
                Toast.makeText(this, "HeHeHeHeHe", Toast.LENGTH_SHORT).show()
                true
            }

            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
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