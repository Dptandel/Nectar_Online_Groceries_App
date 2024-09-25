package com.app.nectar.screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.nectar.R
import com.app.nectar.databinding.ActivitySignInScreenBinding

class SignInScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySignInScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoogleConnect.setOnClickListener {
            // Handle Google sign-in
            val homeScreen = Intent(this, HomeScreen::class.java)
            startActivity(homeScreen)
        }

        binding.btnFacebookConnect.setOnClickListener {
            // Handle Facebook sign-in
        }
    }
}