package com.tijanidian.ex02_alerts_recyclerview.data

import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel
import com.tijanidian.ex02_alerts_recyclerview.domain.AlertRepository


class AlertDataRepository: AlertRepository {
    override fun getALlAlerts(): List<AlertModel> {
        return mutableListOf(
            AlertModel(
                "1",
                "Recomendaciones de manejo. periodo estival 2021",
                1,
                "Recordatorio de manejo. Periodo estival 2021 21 junio de 2021. Para agricultores cosecha y post-cosechacoser lo más superficial posible. Retirar las pacas, los cordondes de paja o el...",
                "21/06/2021",
                "prueba",
                "recurso",
                mutableListOf()
            ),
            AlertModel(
                "2",
                "Detención de anguinas en cereales de inviero",
                2,
                "Detención de anguinas en cereales de invierno. 15 junio de 2021. Información para",
                "15/06/2021",
                "prueba",
                "recurso",
                mutableListOf()
            ),
            AlertModel(
                "3",
                "Recomendaciones de manejo. periodo estival 2021",
                2,
                "Recordatorio de manejo. Periodo estival 2021 21 junio de 2021. Para agricultores cosecha y post-cosechacoser lo más superficial posible. Retirar las pacas, los cordondes de paja o el...",
                "21/06/2021",
                "prueba",
                "recurso",
                mutableListOf()
            ),
            AlertModel(
                "1",
                "Recomendaciones de manejo. periodo estival 2021",
                2,
                "Recordatorio de manejo. Periodo estival 2021 21 junio de 2021. Para agricultores cosecha y post-cosechacoser lo más superficial posible. Retirar las pacas, los cordondes de paja o el...",
                "21/06/2021",
                "prueba",
                "recurso",
                mutableListOf()
            ),
            AlertModel(
                "1",
                "Recomendaciones de manejo. periodo estival 2021",
                1,
                "Recordatorio de manejo. Periodo estival 2021 21 junio de 2021. Para agricultores cosecha y post-cosechacoser lo más superficial posible. Retirar las pacas, los cordondes de paja o el...",
                "21/06/2021",
                "prueba",
                "recurso",
                mutableListOf()
            ),
            AlertModel(
                "1",
                "Recomendaciones de manejo. periodo estival 2021",
                1,
                "Recordatorio de manejo. Periodo estival 2021 21 junio de 2021. Para agricultores cosecha y post-cosechacoser lo más superficial posible. Retirar las pacas, los cordondes de paja o el...",
                "21/06/2021",
                "prueba",
                "recurso",
                mutableListOf()
            ),
        )

    }

}