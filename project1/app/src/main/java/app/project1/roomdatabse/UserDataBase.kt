package app.project1.roomdatabse

import android.content.Context
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase
import javax.xml.validation.Schema

@Database(entities = [], version = 1, exportSchema =false)
abstract class UserDataBase():RoomDatabase() {

    companion object{

        fun getInstance(context: Context):UserDataBase{
          return Room.databaseBuilder(context,UserDataBase::class.java,"db").
                  fallbackToDestructiveMigration().build()
        }
    }
}