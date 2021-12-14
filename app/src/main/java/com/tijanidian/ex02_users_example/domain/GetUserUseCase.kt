package com.tijanidian.ex02_users_example.domain

class GetUserUseCase(private val repositoty: UserRepositoty) {

    fun execute(): List<UserModel> = repositoty.fetchUsers()
}