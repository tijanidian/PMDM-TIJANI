package com.tijanidian.ex02_users_example.data

import com.tijanidian.ex02_users_example.domain.UserModel
import com.tijanidian.ex02_users_example.domain.UserRepositoty

class UserDataRepository:UserRepositoty{
    override fun fetchUsers(): List<UserModel> {
       return mutableListOf(
           UserModel(1, "Name 1","Surname1",2),
           UserModel(2, "Name 2","Surname2",15),
           UserModel(3, "Name 3","Surname3",21),
           UserModel(4, "Name 4","Surname4",23),
           UserModel(5, "Name 5","Surname5",21),
           UserModel(6, "Name 6","Surname6",24),
           UserModel(7, "Name 7","Surname7",22),
           UserModel(8, "Name 8","Surname8",12),
           UserModel(9, "Name 9","Surname9",32),
       )

    }
}