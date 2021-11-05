package com.tijanidian.mvvm.data

import com.tijanidian.mvvm.domain.AlertModel
import com.tijanidian.mvvm.domain.AlertRepository
import com.tijanidian.mvvm.domain.FileEntity

class AlertDataRepository : AlertRepository {
    override fun getAlerts(): List<AlertModel> = mutableListOf(AlertModel(
        "1",
        "title01",
        1,
        "prueba",
        "04-11-21",
        "prueba",
        "recurso",
        mutableListOf()
    ))
}