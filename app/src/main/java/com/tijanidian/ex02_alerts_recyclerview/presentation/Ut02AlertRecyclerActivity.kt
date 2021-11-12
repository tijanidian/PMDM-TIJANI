package com.tijanidian.ex02_alerts_recyclerview.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tijanidian.ex02_alerts_recyclerview.data.AlertDataRepository
import com.tijanidian.ex02_alerts_recyclerview.domain.GetAlertUserCase
import com.tijanidian.pmpd_playground.databinding.ActivityUt02AlertRecyclerBinding


class Ut02AlertRecyclerActivity() : AppCompatActivity() {

    private val viewModel = Ut02AlertRecyclerViewModel(GetAlertUserCase(AlertDataRepository()))

    private val alertAdapter = AlertAdapter()

    private val bind: ActivityUt02AlertRecyclerBinding by lazy {
        ActivityUt02AlertRecyclerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        setUpView()
        alertsWithRecyclerView()
    }

    private fun setUpView() {
        bind.listAlerts.adapter = alertAdapter
        bind.listAlerts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun alertsWithRecyclerView() {
        val alerts = viewModel.getALets()
        alertAdapter.setItems(alerts)
    }
}