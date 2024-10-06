package com.app.nectar.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.nectar.databinding.CategoryItemBinding
import com.app.nectar.models.CategoryItem
import com.app.nectar.models.ChildItem
import com.app.nectar.screens.ProductDetailsScreen

class CategoryItemAdapter(var context: Context, private val categoryItemList: List<CategoryItem>) :
    RecyclerView.Adapter<CategoryItemAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(var binding: CategoryItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = CategoryItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return categoryItemList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val categoryItem = categoryItemList[position]
        holder.binding.imgItem.setImageResource(categoryItem.itemImage)
        holder.binding.tvItemName.text = categoryItem.itemName
        holder.binding.tvItemQuantity.text = "${categoryItem.itemQuantity.toInt()}${categoryItem.itemUnit}, Price"
        holder.binding.tvItemPrice.text = "$${categoryItem.itemPrice}"
    }
}