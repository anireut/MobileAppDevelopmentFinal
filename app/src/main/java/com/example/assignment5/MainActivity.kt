package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){
    //private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Contacts>
    lateinit var imageId : Array<Int>
    lateinit var header : Array<String>
    lateinit var description : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationBar : BottomNavigationView = findViewById(R.id.btmNav)
        //val navController = findNavController(R.id.recyclerView)

        //bottomNavigationBar.setupWithNavController(navController)
        val rv: RecyclerView = findViewById(R.id.recyclerView)


        imageId = arrayOf(

            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,
            R.drawable.nopfp,

        )

        header = arrayOf(
            "Ceasar, Julius",
            "Deer, John",
            "Ernest, Hemingway",
            "Fisher, Carrie ",
            "Harley, Davidson",
            "George, Regina",
            "Joseph, Jo",
            "Iverson, Alan",
            "Gump, Forrest",
            "Fred, Fred",
            "Roberts, Julia"
        )

        description = arrayOf(
            "Coworker",
            "Coworker",
            "Coworker",
            "Coworker",
            "Coworker",
            "Coworker",
            "Friend",
            "Friend",
            "Friend",
            "Friend",
            "Father",
            "Spouse"
        )
        //newRecyclerView = findViewById(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        newArrayList = arrayListOf<Contacts>()
        getUserdata()
        rv.adapter = MyAdapter(newArrayList)

    }

    private fun getUserdata(){
            for (i in imageId.indices) {
                val contacts = Contacts(imageId[i], header[i], description[i])
                newArrayList.add(contacts)
            }
        /*
        //var adapter = MyAdapter(newArrayList)
        //newRecyclerView.adapter = adapter
        //adapter.setOnItermClickListener(object : MyAdapter.onItemClickListener {

            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, ContactDetailsActivity::class.java)
                intent.putExtra("heading", newArrayList[position].header)
                intent.putExtra("description", newArrayList[position].description)
                intent.putExtra("image", newArrayList[position].title)
                startActivity(intent)

            }


        })*/
    }





}

