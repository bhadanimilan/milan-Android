package app.project1.roomdatabse.repo

import app.project1.roomdatabse.User
import app.project1.roomdatabse.UserDao

class UserRepo (val userDataDao:UserDao){

    suspend fun insert(userDao:User){
       userDataDao.insert(userDao)
    }

    suspend fun delete(userDao: User){
        userDataDao.Delete(userDao)
    }

    suspend fun update(userDao: User){
        userDataDao.update(userDao)
    }

    suspend fun getAllUser():List<User>{
        return userDataDao.getAllUser()
    }

}