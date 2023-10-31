package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Tampilan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan2)

        val userId = intent.getStringExtra("NAMA")
        val storeLocation = intent.getStringExtra("LOCATION")

        val userIdTextView = findViewById<TextView>(R.id.user_id)
        val storeLocationTextView = findViewById<TextView>(R.id.store_location)

        userIdTextView.text = "Hello $userId"
        storeLocationTextView.text = storeLocation

        val btnSeeMenus = findViewById<Button>(R.id.see_menus)
        btnSeeMenus?.setOnClickListener {
            val intent = Intent(this, Tampilan3::class.java)
            intent.putExtra("USER_ID", userId)
            intent.putExtra("STORE_LOCATION", storeLocation)
            startActivity(intent)
            Log.d("Tampilan2", "Button Clicked") // Tambahkan ini untuk debug
        }

    }
}
