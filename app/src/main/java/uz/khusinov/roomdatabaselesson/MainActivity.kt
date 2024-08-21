package uz.khusinov.roomdatabaselesson

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.khusinov.roomdatabaselesson.database.AppDatabase
import uz.khusinov.roomdatabaselesson.database.entity.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var appDatabase: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appDatabase = AppDatabase.getInstance(this)

        val contact = Contact(name = "Shaxriyor", phoneNumber = "+998942331705")

        appDatabase.contactDao().addContact(contact)

        val contactsList = appDatabase.contactDao().getAllContacts()

        Log.d("TAG", "onCreate: $contactsList  ")

    }
}