package com.example.assignment5
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ContactDetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        val header = intent.getStringExtra("header")


        val contactHeading: TextView = findViewById(R.id.header)


        //val contactDescription: TextView = findViewById(R.id.description)
        //val contactImage: ImageView = findViewById(R.id.title)
        //val bundle: Bundle? = intent.extras

        //val header = bundle!!.getString("heading")
        //val imageId = bundle!!.getInt("imageId")
        //val description = bundle!!.getString("description")

        contactHeading.text = header
        //contactDescription.text = description
        //contactImage.setImageResource(imageId)
    }

}