package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val homeBtn = findViewById<ImageView>(R.id.homeBtn)
        val searchBtn = findViewById<ImageView>(R.id.searchBtn)
        val editProfileBtn = findViewById<TextView>(R.id.editProfileBtn)
        val hightlightBtn = findViewById<LinearLayout>(R.id.highlight)

        hightlightBtn.setOnClickListener() {
            val intent = Intent(this, HighlightViewActivity::class.java)
            startActivity(intent)
            finish()
        }

        editProfileBtn.setOnClickListener() {
            val intent = Intent(this, ProfileEditActivity::class.java)
            startActivity(intent)
            finish()
        }

        homeBtn.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
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


    }
}