package com.app.nectar.screens

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.app.nectar.R
import com.app.nectar.databinding.ActivityMainScreenBinding
import com.app.nectar.fragments.AccountFragment
import com.app.nectar.fragments.CartFragment
import com.app.nectar.fragments.ExploreFragment
import com.app.nectar.fragments.FavouriteFragment
import com.app.nectar.fragments.ShopFragment

class MainScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(ShopFragment())

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_shop -> {
                    loadFragment(ShopFragment())
                    true
                }
                R.id.menu_explore -> {
                    loadFragment(ExploreFragment())
                    true
                }
                R.id.menu_cart -> {
                    loadFragment(CartFragment())
                    true
                }
                R.id.menu_favourite -> {
                    loadFragment(FavouriteFragment())
                    true
                }
                R.id.menu_account -> {
                    loadFragment(AccountFragment())
                    true
                }

                else -> {
                    false
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}