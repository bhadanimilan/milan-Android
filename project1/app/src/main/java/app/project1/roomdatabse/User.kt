package app.project1.roomdatabse

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "registration")
data class User(
    @PrimaryKey(autoGenerate = true)
    var uid:Int,
    var Email:String,
    var Gender:String,

){

}