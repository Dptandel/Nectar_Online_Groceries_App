package com.app.nectar.screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.nectar.R
import com.app.nectar.databinding.ActivityOnBoardingScreenBinding

class OnBoardingScreen : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOnBoardingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetStarted.setOnClickListener {
            val intent = Intent(this, SignInScreen::class.java)
            startActivity(intent)
        }
    }
}