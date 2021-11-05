package com.tijanidian.mvvm.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.tijanidian.mvvm.data.AlertDataRepository
import com.tijanidian.mvvm.domain.GetAlertUseCase
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

        Log.d("@tijani","$alert")
        viewBinding.textBold.setText(R.string.text_bold_plag)
        viewBinding.currentDate.setText(R.string.text_date_plag)
        viewBinding.textBody.setText(R.string.text_body_plag)
        viewBinding.imageView.setImageResource(R.drawable.ic_warning)

    }
/*
    private fun setupBinding(){
        val layoutInflater=LayoutInflater.from(this)
        viewBinding= ActivityAlertsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }

 */
}