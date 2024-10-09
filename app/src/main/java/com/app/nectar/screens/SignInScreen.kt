package com.app.nectar.screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.app.nectar.databinding.ActivitySignInScreenBinding

class SignInScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySignInScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoogleConnect.setOnClickListener {
            // Handle Google sign-in
            startActivity(Intent(this, MainScreen::class.java))
        }

        binding.btnFacebookConnect.setOnClickListener {
            // Handle Facebook sign-in
            startActivity(Intent(this, MainScreen::class.java))
        }
    }
}