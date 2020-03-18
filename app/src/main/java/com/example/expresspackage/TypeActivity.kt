package com.example.expresspackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)


        val goToPoint1 : Button = findViewById(R.id.buttonNextType)
        goToPoint1.setOnClickListener{
            val intentGoToPoint1 = Intent(this, Point1Activity::class.java)
            // start your next activity
            startActivity(intentGoToPoint1)
        }
    }
}
