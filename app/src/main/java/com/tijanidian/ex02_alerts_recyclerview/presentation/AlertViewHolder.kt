package com.tijanidian.ex02_alerts_recyclerview.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tijanidian.pmpd_playground.R

import com.tijanidian.pmpd_playground.databinding.ViewItemUt02RecyclerBinding

class AlertViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val bind = ViewItemUt02RecyclerBinding.bind(view)

    fun render(alertViewState: AlertViewState) {
        bind.labelTitle.text = alertViewState.title
        bind.labelDate.text = alertViewState.date
        bind.labelSummary.text = alertViewState.summary
        if (alertViewState.type == 1){
            bind.avatar.setImageResource(R.drawable.ic_warning)
        } else {
            bind.avatar.setImageResource(R.drawable.ic_danger)
        }
        view.setOnClickListener {
            view.context.startActivity(
                DetailAlert.getIntent(
                    itemView.context,
                    alertViewState.id
                )
            )
        }
    }
}