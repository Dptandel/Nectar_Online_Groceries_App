package com.app.nectar.screens

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.nectar.R
import com.app.nectar.databinding.ActivityProductDetailsScreenBinding
import com.app.nectar.models.ChildItem

class ProductDetailsScreen : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsScreenBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var item = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("childItem", ChildItem::class.java)
        } else {
            intent.getParcelableExtra("childItem")
        }

        item?.let {
            binding.imgItem.setImageResource(it.itemImage)
            binding.tvItemName.text = it.itemName
            binding.tvItemQuantity.text = "${it.itemQuantity}${it.itemUnit}, Price"
            binding.tvItemPrice.text = "$ ${it.itemPrice}"
            binding.tvProductDetails.text = it.itemDetail
            binding.rbRating.rating = it.review.toFloat()
        }
    }
}