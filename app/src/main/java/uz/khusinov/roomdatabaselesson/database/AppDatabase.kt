package uz.khusinov.roomdatabaselesson.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.khusinov.roomdatabaselesson.database.dao.ContactDao
import uz.khusinov.roomdatabaselesson.database.entity.Contact


@Database(entities = [Contact::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun contactDao(): ContactDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase {

            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "contact_db"
                ).allowMainThreadQueries().build()
            }

            return instance!!
        }
    }
}