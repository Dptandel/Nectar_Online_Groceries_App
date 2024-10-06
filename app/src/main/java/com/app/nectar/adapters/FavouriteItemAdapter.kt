package com.app.nectar.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.app.nectar.R
import com.app.nectar.models.FavouriteItem

class FavouriteItemAdapter(var context: Context, var favouriteItemList: MutableList<FavouriteItem>) :
    Adapter<FavouriteItemAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        val imgItem = itemView.findViewById<ImageView>(R.id.imgItem)
        val tvItemName = itemView.findViewById<TextView>(R.id.tvItemName)
        val tvItemQuantity = itemView.findViewById<TextView>(R.id.tvItemQuantity)
        val tvItemPrice = itemView.findViewById<TextView>(R.id.tvItemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.favourite_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return favouriteItemList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = favouriteItemList[position]

        holder.tvItemName.text = item.name
        holder.tvItemQuantity.text = "${item.quantity.toInt()}${item.unit}, Price"
        holder.tvItemPrice.text = "$${item.price}"
        holder.imgItem.setImageResource(item.image)
    }
}