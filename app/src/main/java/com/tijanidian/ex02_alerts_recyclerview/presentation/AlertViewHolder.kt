package com.tijanidian.ex02_alerts_recyclerview.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ViewItemUt02RecyclerBinding

class AlertViewHolder(view:View):RecyclerView.ViewHolder(view) {
    private val bind=ViewItemUt02RecyclerBinding.bind(view)

    fun render(alertViewState: AlertViewState){
        bind.labelTitle.text=alertViewState.title
        bind.labelDate.text=alertViewState.date
        bind.labelSummary.text=alertViewState.summary
    }
}