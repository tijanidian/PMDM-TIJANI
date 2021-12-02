package com.tijanidian.ex02_users_example.presentation


import androidx.lifecycle.ViewModel
import com.tijanidian.ex02_users_example.domain.GetUserUseCase

class Ut02Ex02ViewModel(private  val useCase:GetUserUseCase): ViewModel() {

    fun getUsers():List<UserViewState>{
        val users=useCase.execute()
        return users.map{userModel ->
            UserViewState(
            userModel.id,
                "${userModel.name} ${userModel.surname}",
                userModel.age.toString()

        )
        }
    }

}