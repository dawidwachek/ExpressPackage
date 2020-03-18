package com.example.expresspackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_point1.*

class Point1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_point1)

        val goToPoint2 : Button = findViewById(R.id.buttonNextPoint1)

        val city1Text: EditText = findViewById(R.id.editTextCity1) //----


        goToPoint2.setOnClickListener{
            val intentGoToPoint2 = Intent(this, Point2Activity::class.java)


            intentGoToPoint2.putExtra("city1", city1Text.text.toString()) //---



            // start your next activity
            startActivity(intentGoToPoint2)

        }

    }
}
