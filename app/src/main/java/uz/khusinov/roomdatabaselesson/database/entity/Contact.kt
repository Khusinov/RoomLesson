package uz.khusinov.roomdatabaselesson.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Contact(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    val name:String,
    val phoneNumber:String
)
