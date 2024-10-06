package com.app.nectar.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.nectar.R
import com.app.nectar.databinding.ChildItemBinding
import com.app.nectar.models.ChildItem
import com.app.nectar.screens.ProductDetailsScreen

class ChildItemAdapter(var context: Context, private val childItemList: List<ChildItem>) :
    RecyclerView.Adapter<ChildItemAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(var binding: ChildItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val binding = ChildItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ChildViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return childItemList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val childItem = childItemList[position]
        holder.binding.imgItem.setImageResource(childItem.itemImage)
        holder.binding.tvItemName.text = childItem.itemName
        holder.binding.tvItemQuantity.text = "${childItem.itemQuantity.toInt()}${childItem.itemUnit}, Price"
        holder.binding.tvItemPrice.text = "$${childItem.itemPrice}"

        holder.binding.childItemCardView.setOnClickListener {
            context.startActivity(Intent(context, ProductDetailsScreen::class.java).apply {
                putExtra("childItem", childItem)
            })
        }
    }
}