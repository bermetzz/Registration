package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text = intent.getStringExtra("username")
        val text1 = intent.getStringExtra("email")
        val email1 = findViewById<TextView>(R.id.email_tv)
        val username1 = findViewById<TextView>(R.id.username)
        email1.text = text1
        username1.text = text
    }
}