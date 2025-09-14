package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MessageListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_message_list)

        val cameraBtn = findViewById<LinearLayout>(R.id.cameraBtn)
        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val joshua = findViewById<LinearLayout>(R.id.joshua)

        backBtn.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        cameraBtn.setOnClickListener() {
            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        joshua.setOnClickListener() {
            val intent = Intent(this, DirectMessageActivity::class.java)
            startActivity(intent)
        }

    }
}