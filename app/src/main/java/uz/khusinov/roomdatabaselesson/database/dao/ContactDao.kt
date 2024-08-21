package uz.khusinov.roomdatabaselesson.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import uz.khusinov.roomdatabaselesson.database.entity.Contact

@Dao
interface ContactDao {

    @Query("SELECT * FROM Contact")
    fun getAllContacts():List<Contact>

    @Insert
    fun addContact(contact: Contact)

    @Delete
    fun deleteContact(contact: Contact)

    @Update
    fun updateContact(contact: Contact)

    @Query("SELECT * FROM Contact where phoneNumber =:usersPhone")
    fun getContactByPhone(usersPhone:String):Contact

}