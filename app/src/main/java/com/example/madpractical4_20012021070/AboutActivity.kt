package com.example.madpractical4_20012021070

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val intent = intent
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.appname)
        messageTextView.text = "Your message is: " + message
    }
}