package app.project1.roomdatabse

import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(dataBase:User){

    }

    @Update
    suspend fun update(dataBase: User)

    @Delete
    suspend fun Delete(dataBase: User)

    @Query("SELECT * FROM User")
    suspend fun getAllUser():List<User>

}