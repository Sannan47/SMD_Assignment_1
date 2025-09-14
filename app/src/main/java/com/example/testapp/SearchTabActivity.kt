package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SearchTabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_tab)

        val searchBox = findViewById<RelativeLayout>(R.id.searchBox)
        val homeBtn = findViewById<ImageView>(R.id.homeBtn)
        val addBtn = findViewById<ImageView>(R.id.addBtn)
        val heartBtn = findViewById<ImageView>(R.id.heartBtn)
        val profileBtn = findViewById<ImageView>(R.id.profileBtn)

        searchBox.setOnClickListener() {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        homeBtn.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
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

        profileBtn.setOnClickListener() {
            val intent = Intent(this, ProfileEditActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}