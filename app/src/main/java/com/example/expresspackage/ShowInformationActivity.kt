package com.example.expresspackage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_show_information.*
import org.w3c.dom.Text
import java.lang.reflect.Type

class ShowInformationActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_information)
        val cancel : Button = findViewById(R.id.buttonCancel)


        val pickupAdress: TextView = findViewById<TextView>(R.id.textViewPickupAdress) as TextView//-----
        val whoPickup: TextView = findViewById<TextView>(R.id.textViewWhoPickup) as TextView
        //val postingAdress: TextView = findViewById<TextView>(R.id.textViewPostingAdress) as TextView

        pickupAdress.text = intent.getStringExtra("city2") + ", " + intent.getStringExtra("street2") + ", " +
                intent.getStringExtra("numberHouse2") + " / " + intent.getStringExtra("numberLocal2") //-----

        whoPickup.text = intent.getStringExtra("nameConfirmation") + ", " + intent.getStringExtra("numberConfirmation")
        //postingAdress.text = intent.getStringExtra("city1")

        cancel.setOnClickListener{
            val intentType = Intent(this, TypeActivity::class.java)
            startActivity(intentType)
        }


    }
}
