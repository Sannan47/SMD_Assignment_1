package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DirectMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_direct_message)

        val backBtn = findViewById<ImageView>(R.id.backBtn)

        backBtn.setOnClickListener() {
            val intent = Intent(this, MessageListActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}