package com.tijanidian.pmpd_playground.mvvm.domain

class GetMvvmUseCase(val mvvmRepository: MvvmRepository){

    fun execute(paramsIn:String):MvvmModel{
        val model=mvvmRepository.getMvvm()
        return model
    }
}