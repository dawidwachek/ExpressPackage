package com.example.expresspackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import androidx.core.text.trimmedLength
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_point2.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlin.math.min

class Point2Activity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_point2)

        val goToShowInformation : Button = findViewById(R.id.buttonNextPoint2)


        val city2Text: EditText = findViewById(R.id.editTextCity2) //-------
        val street2Text: EditText = findViewById(R.id.editTextStreet2)
        val numberHouse2Text: EditText = findViewById(R.id.editTextNumberHouse2)
        val numberLocal2Text: EditText = findViewById(R.id.editTextNumberLocal2)
        val nameConfirmationText: EditText = findViewById(R.id.editTextNameConfirmation)
        val numberConfirmationText: EditText = findViewById(R.id.editTextNumberConfirmation)
        

        goToShowInformation.setOnClickListener{
            val intentGoToShowInfomation = Intent(this, ShowInformationActivity::class.java)


            //intentGoToShowInfomation.putExtra("city1", value) = intent.getStringExtra("city1")
            intentGoToShowInfomation.putExtra("city2", city2Text.text.toString())  //------
            intentGoToShowInfomation.putExtra("street2", street2Text.text.toString())
            intentGoToShowInfomation.putExtra("numberHouse2", numberHouse2Text.text.toString())
            intentGoToShowInfomation.putExtra("numberLocal2", numberLocal2Text.text.toString())
            intentGoToShowInfomation.putExtra("nameConfirmation", nameConfirmationText.text.toString())
            intentGoToShowInfomation.putExtra("numberConfirmation", numberConfirmationText.text.toString())


            // start your next activity
            startActivity(intentGoToShowInfomation)
        }
    }
}
