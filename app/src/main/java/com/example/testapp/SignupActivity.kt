package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val profileImage = findViewById<RelativeLayout>(R.id.profileImage)

        backBtn.setOnClickListener() {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }

        profileImage.setOnClickListener() {
            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }



    }
}