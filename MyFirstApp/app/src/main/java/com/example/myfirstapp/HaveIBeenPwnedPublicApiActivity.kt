package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject
import org.json.JSONException

import com.android.volley.Response




class HaveIBeenPwnedPublicApiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_have_ibeen_pwned_public_api)
        val test = JSONObject()
        try {
            test.put("id", "3")
            test.put("name", "NAME OF STUDENT")
            test.put("year", "3rd")
            test.put("curriculum", "Arts")
            test.put("birthday", "5/5/1993")
        } catch (e: JSONException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }

        findViewById<TextView>(R.id.editTextTextMultiLine).apply { text = test.toString() }
    }
  //  findViewById<TextView>(R.id.editTextTextMultiLine)
    fun test(view: View)
    {
        val test2 = JSONObject()
        var textView = findViewById<TextView>(R.id.editTextTextMultiLine)


/*
        val test = JSONObject()
        try {
            test.put("id", (0..10).random())
            test.put("name", "NAME OF STUDENT")
            test.put("year", "3rd")
            test.put("curriculum", "Arts")
            test.put("birthday", (0..10).random().toString()+"/"+(0..10).random().toString()+"/1993")
        } catch (e: JSONException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }

        findViewById<TextView>(R.id.editTextTextMultiLine).apply { text = test.toString() }
*/
    }
}