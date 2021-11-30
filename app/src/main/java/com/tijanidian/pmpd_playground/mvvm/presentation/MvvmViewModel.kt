package com.tijanidian.pmpd_playground.mvvm.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.pmpd_playground.mvvm.domain.GetMvvmUseCase

class MvvmViewModel(private val getMvvmUseCase:GetMvvmUseCase): ViewModel() {

    fun getAllMvvm()=getMvvmUseCase.execute("1")
}