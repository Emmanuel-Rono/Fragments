package com.example.trials

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //create a view
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.Button1) //To access view
        val button2 = findViewById<Button>(R.id.Button2)//To access view
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, firstFragment)//Transaction is used to replace contents of frame layout to an intended layout
            commit()
        }
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, firstFragment)
                addToBackStack(null)//To allow us access the fragment when we click back button
                commit()

            }

        }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment)
                addToBackStack(null)//To allow us access the fragment when we click back button
                commit()
            }
            }

        }
    }
