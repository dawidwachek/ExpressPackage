package com.example.expresspackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_confirm_order.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //Button to Register
        val goToRegister : Button = findViewById(R.id.buttonGoToRegister)
        goToRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        //Button to Order Pack
        val goToOrderPack : Button = findViewById(R.id.buttonConfirmationOrder)
        goToOrderPack.setOnClickListener{
            val intentOrder = Intent(this, ConfirmOrderActivity::class.java)
            // start your next activity
            startActivity(intentOrder)

        }
        
        /*if (editTextLogin.text || editTextPassword.text == "") {

        }
        else {}*/
    }
}
