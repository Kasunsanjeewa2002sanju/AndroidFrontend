package com.example.budgetbuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

import com.example.myapp.register

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)

        val btnSignUp: Button = findViewById(R.id.signup)
        val btnLogin: Button = findViewById(R.id.loginbtn)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, register::class.java) // Fixed class name
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish() // Prevents back navigation to login screen
        }
    }
}
