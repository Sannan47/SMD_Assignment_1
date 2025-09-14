package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProfileEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_edit)

        val cancelBtn = findViewById<TextView>(R.id.cancelBtn)
        val doneBtn = findViewById<TextView>(R.id.doneBtn)

        cancelBtn.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        doneBtn.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}