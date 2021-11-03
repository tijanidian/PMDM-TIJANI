package com.tijanidian.mvvm.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.mvvm.domain.GetMvvmUseCase

class MvvmViewModel(private val getMvvmUseCase:GetMvvmUseCase): ViewModel() {

    fun getAllMvvm()=getMvvmUseCase.execute("1")
}