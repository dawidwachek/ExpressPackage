package com.example.expresspackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_wait_to_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        //Button to Register
        val Registering : Button = findViewById(R.id.buttonRegister)
        Registering.setOnClickListener {
            val intentRegister = Intent(this, WaitToRegisterActivity::class.java)
            // start your next activity
            startActivity(intentRegister)
        }


        //Button to Regulatrions
        val ReadRegulations : Button = findViewById(R.id.buttonRegulatrions)
        ReadRegulations.setOnClickListener {
            val intentRegulatrions = Intent(this, RegulationsActivity::class.java)
            // start your next activity
            startActivity(intentRegulatrions)
        }


    }
}
