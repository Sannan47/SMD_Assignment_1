package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val signupBtn = findViewById<TextView>(R.id.signupBtn)
        val loginBtn = findViewById<TextView>(R.id.loginBtn)
        val backBtn = findViewById<ImageView>(R.id.backBtn)

        signupBtn.setOnClickListener() {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }


        backBtn.setOnClickListener() {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }

//        loginBtn.setOnClickListener() {
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
    }
}