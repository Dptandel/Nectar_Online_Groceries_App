package com.app.nectar.screens

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.app.nectar.R
import com.app.nectar.adapters.CategoryItemAdapter
import com.app.nectar.databinding.ActivityExploreCategoryScreenBinding
import com.app.nectar.models.CategoryItem
import java.util.ArrayList

class ExploreCategoryScreen : AppCompatActivity() {

    private lateinit var binding: ActivityExploreCategoryScreenBinding

    private var categoryItemList = ArrayList<CategoryItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExploreCategoryScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exploreCategoryRV.layoutManager = GridLayoutManager(this, 2)

        addCategoryItemsToList()

        val categoryAdapter = CategoryItemAdapter(this, categoryItemList)
        binding.exploreCategoryRV.adapter = categoryAdapter
    }

    private fun addCategoryItemsToList() {
        categoryItemList = ArrayList<CategoryItem>().apply {
            add(CategoryItem(R.drawable.category_item_1, "Diet Coke", 355.0, "ml", 1.99))
            add(CategoryItem(R.drawable.category_item_2, "Sprite Can", 325.0, "ml", 1.50))
            add(CategoryItem(R.drawable.category_item_3, "Apple & Grape Juice", 2.0, "L", 15.99))
            add(CategoryItem(R.drawable.category_item_4, "Orange Juice", 2.0, "L", 15.99))
            add(CategoryItem(R.drawable.category_item_5, "Coca Cola Can", 325.0, "ml", 4.99))
            add(CategoryItem(R.drawable.category_item_6, "Pepsi Can", 330.0, "ml", 4.99))
        }
    }
}