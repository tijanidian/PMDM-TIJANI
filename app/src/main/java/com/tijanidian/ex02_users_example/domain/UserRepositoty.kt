package com.tijanidian.ex02_users_example.domain

interface UserRepositoty {
    fun fetchUsers():List<UserModel>
}