package com.tijanidian.ex02_alerts_recyclerview.domain

class FindAlertUseCase(private val repository:AlertRepository) {

    fun execute(id:String):List<AlertModel>{
        return repository.getAlert(id)
    }

}