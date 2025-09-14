package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OtherProfileViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_other_profile_view)


        val backBtn = findViewById<ImageView>(R.id.backBtn)
        val homeBtn = findViewById<ImageView>(R.id.homeBtn)
        val searchBtn = findViewById<ImageView>(R.id.searchBtn)
        val addBtn = findViewById<ImageView>(R.id.addBtn)
        val heartBtn = findViewById<ImageView>(R.id.heartBtn)
        val profileBtn = findViewById<ImageView>(R.id.profileBtn)

        backBtn.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
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

        addBtn.setOnClickListener() {
            val intent = Intent(this, CreatePostActivity::class.java)
            startActivity(intent)
            finish()
        }

//        heartBtn.setOnClickListener() {
//            val intent = Intent(this, LikedActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

        profileBtn.setOnClickListener() {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}