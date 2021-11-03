package com.tijanidian.mvvm.domain

class GetAlertUseCase(val alertRepository: AlertRepository){

    fun execute(paramsIn:String):AlertModel{
        val model=alertRepository.getMvvm()
        return model
    }
}