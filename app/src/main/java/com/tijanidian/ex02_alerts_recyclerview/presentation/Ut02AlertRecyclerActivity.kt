package com.tijanidian.ex02_alerts_recyclerview.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.tijanidian.ex02_alerts_recyclerview.app.RetrofitApiClient
import com.tijanidian.ex02_alerts_recyclerview.data.AlertDataRepository
import com.tijanidian.ex02_alerts_recyclerview.data.AlertRemoteSource
import com.tijanidian.ex02_alerts_recyclerview.domain.GetAlertUserCase
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityUt02AlertRecyclerBinding


class Ut02AlertRecyclerActivity() : AppCompatActivity() {

    private val viewModel = Ut02AlertRecyclerViewModel(
        GetAlertUserCase(
            AlertDataRepository(
                AlertRemoteSource(RetrofitApiClient())
            )
        )
    )

    private val alertAdapter = AlertAdapter()

    private val bind: ActivityUt02AlertRecyclerBinding by lazy {
        ActivityUt02AlertRecyclerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        setUpView()
        alertsWithRecyclerView()
        setupToolbar()
    }

    private fun setUpView() {
        bind.listAlerts.adapter = alertAdapter
        bind.listAlerts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun alertsWithRecyclerView() {
        Thread(Runnable {
            val alerts = viewModel.getAlerts()
            runOnUiThread {
                alertAdapter.setItems(alerts)
            }
            Log.d("@dev","$alerts")
        }).start()

    }

    private fun setupToolbar() {
        setSupportActionBar(bind.mainBar)
        supportActionBar?.title = getString(R.string.text_main_information)
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
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_privacy->{
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
                true
            }

            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}