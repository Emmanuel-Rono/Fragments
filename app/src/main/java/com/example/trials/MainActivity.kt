package com.example.trials

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //create a view
        super.onCreate(savedInstanceState)//To check the saved instances i.e if there was an opened fragments (for this case)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.Button1) //To access view
       // val Framelayout=findViewById<FrameLayout>(R.id.fLayout)
        val button2 = findViewById<Button>(R.id.Button2)//To access view
        val firstFragment = FirstFragment()//Creating an object for the firstfRAGMENT,
        val secondFragment =SecondFragment()//REMEMBER WE USE objects and classes here
        supportFragmentManager.beginTransaction().apply {
            setReorderingAllowed(true)
            replace(R.id.Fcontainer, secondFragment)//Transaction is used to replace contents of frame layout to an intended layout
            commit() //The initial app fragment is assigned firstFragment
        }
     supportFragmentManager.beginTransaction().apply {
         setReorderingAllowed(true)
         replace(R.id.Fcontainer, firstFragment)
         button1.setOnClickListener {
             supportFragmentManager.beginTransaction().apply {
                 replace(R.id.ContactView,secondFragment)
                 commit()
             }
         }
     }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply { replace(R.id.Fcontainer,firstFragment)
            commit()
            }
        }


        }
    }
