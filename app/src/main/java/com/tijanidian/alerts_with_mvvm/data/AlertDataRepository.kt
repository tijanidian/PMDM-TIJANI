package com.tijanidian.alerts_with_mvvm.data

import com.tijanidian.alerts_with_mvvm.domain.AlertModel
import com.tijanidian.alerts_with_mvvm.domain.AlertRepository

class AlertDataRepository : AlertRepository {
    override fun getAlerts(): List<AlertModel> = mutableListOf(
        AlertModel(
            "2",
            "Recomendaciones de manejo. periodo estival 2021",
            1,
            "Recordatorio de manejo. Periodo estival 2021 21 junio de 2021. Para agricultores cosecha y post-cosechacoser lo más superficial posible. Retirar las pacas, los cordondes de paja o el...",
            "21/06/2021",
            "prueba",
            "recurso",
            mutableListOf()
        )
    )
}