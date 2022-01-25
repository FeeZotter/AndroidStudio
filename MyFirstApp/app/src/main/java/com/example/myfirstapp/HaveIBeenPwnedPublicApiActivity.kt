package com.example.myfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject
import org.json.JSONException
import com.android.volley.toolbox.Volley


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
            test.put("birthday", "5.5.1993")
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        findViewById<TextView>(R.id.editTextTextMultiLine).apply { text = test.toString() }
    }

    @SuppressLint("SetTextI18n")
    fun test(view: View)
    {
        val textView = findViewById<TextView>(R.id.editTextTextMultiLine)
        val url = "https://haveibeenpwned.com/api/v3/breach/" + findViewById<TextView>(R.id.breachText).text
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            { response ->
                textView.text = "Response: %s".format(response.toString())
            },
            { error ->
                textView.text = error.toString()
            }
        )
        Volley.newRequestQueue(this).add(jsonObjectRequest)
    }
}