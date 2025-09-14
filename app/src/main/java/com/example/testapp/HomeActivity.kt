package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val messagesBtn = findViewById<ImageView>(R.id.messages)
        val cameraBtn = findViewById<ImageView>(R.id.cameraBtn)
        val searchBtn = findViewById<ImageView>(R.id.searchBtn)
        val addBtn = findViewById<ImageView>(R.id.addBtn)
        val heartBtn = findViewById<ImageView>(R.id.heartBtn)
        val profileBtn = findViewById<ImageView>(R.id.profileBtn)

        messagesBtn.setOnClickListener() {
            val intent = Intent(this, MessageListActivity::class.java)
            startActivity(intent)
            finish()
        }

        cameraBtn.setOnClickListener() {
            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        searchBtn.setOnClickListener() {
            val intent = Intent(this, SearchTabActivity::class.java)
            startActivity(intent)
            finish()
        }

//        addBtn.setOnClickListener() {
//            val intent = Intent(this, AddPostActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

//        heartBtn.setOnClickListener() {
//            val intent = Intent(this, LikedActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

//        profileBtn.setOnClickListener() {
//            val intent = Intent(this, ProfileActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

    }
}