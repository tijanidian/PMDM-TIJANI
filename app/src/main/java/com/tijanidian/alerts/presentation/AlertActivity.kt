package com.tijanidian.alerts.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tijanidian.alerts.data.AlertDataRepository
import com.tijanidian.alerts.domain.GetAlertUseCase
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityAlertsBinding

class AlertActivity : AppCompatActivity() {

    private val viewModel: AlertViewModel = AlertViewModel(GetAlertUseCase(AlertDataRepository()))
    lateinit var viewBinding: ActivityAlertsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAlertsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        render()
    }

    private fun render() {
        val alert = viewModel.getAlerts().first()

        Log.d("@tijani", "$alert")
        viewBinding.mainTitle.text = alert.title
        viewBinding.datePublished.text = alert.datePublished
        viewBinding.summary.text = alert.summary
        viewBinding.iconWarning.setImageResource(R.drawable.ic_warning)

    }
}