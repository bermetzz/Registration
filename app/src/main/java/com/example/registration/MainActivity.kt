package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        val email = findViewById<EditText>(R.id.email).text.toString()
        val username = findViewById<EditText>(R.id.user).text.toString()
        intent.putExtra("email", email)
        intent.putExtra("username", username)
        startActivity(intent)

    }
}