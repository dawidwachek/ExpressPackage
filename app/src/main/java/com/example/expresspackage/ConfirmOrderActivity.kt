package com.example.expresspackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_confirm_order.*

class ConfirmOrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_order)



        val OrderPack : Button = findViewById(R.id.buttonOrderPack)
        OrderPack.setOnClickListener{
            textViewNoOrderPack.text = getString(R.string.No_Order_Pack) + editTextNoNumberPack.text
        }


    }


}
