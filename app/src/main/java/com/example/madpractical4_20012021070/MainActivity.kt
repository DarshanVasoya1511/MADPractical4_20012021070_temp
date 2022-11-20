package com.example.madpractical4_20012021070

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.*
import android.widget.Button
import android.widget.Toast
import com.example.madpractical4_20012021070.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWeb.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.google.co.in/")).apply { startActivity(this) }
        }

        binding.callNumberButton.setOnClickListener{
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:123456789")).apply { startActivity(this) }
        }

        binding.btncontactlist.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply { startActivity(this) }
        }

        binding.btncallLog.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply { startActivity(this) }
        }

        binding.btngallery.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }
        }

        binding.btncamera.setOnClickListener{
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { startActivity(this) }
        }

        binding.btnalarm.setOnClickListener{
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply { startActivity(this) }
        }

        binding.btnAbout.setOnClickListener {
            val message = binding.webUrlEditText.text.toString()
            var intent = Intent(this,AboutActivity::class.java)
            intent.putExtra("message_key",message)
            startActivity(intent)
        }

    }
}