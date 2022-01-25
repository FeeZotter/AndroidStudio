package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view : View)
    {
        startActivity(Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, findViewById<EditText>(R.id.editTextTextPersonName).text.toString())
        })
    }
    fun toCalc(view : View)
    {
        startActivity(Intent(this, CalculatorMK1Activity::class.java))
    }
    fun toHibpAPI(view : View)
    {
        startActivity(Intent(this, HaveIBeenPwnedPublicApiActivity::class.java))
    }
}