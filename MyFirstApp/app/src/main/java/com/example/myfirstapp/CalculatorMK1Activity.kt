package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class CalculatorMK1Activity : AppCompatActivity()
{
    private var someMathStuff = arrayOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_mk1)
    }
    fun calcAdd(view: View)
    {
        someMathStuff += (view as Button).text.toString().toInt()
        findViewById<TextView>(R.id.calcfield).apply { text = someMathStuff.joinToString(separator = "+") }
        findViewById<TextView>(R.id.finishedNumber).apply { text = someMathStuff.sum().toString() }
    }
    fun calcDelete(view: View)
    {
        someMathStuff = arrayOf()
        findViewById<TextView>(R.id.calcfield).apply { text = "" }
    }
}