package com.app.nectar.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.nectar.R
import com.app.nectar.models.ChildItem

class ChildItemAdapter(private val childItemList: List<ChildItem>) :
    RecyclerView.Adapter<ChildItemAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgItem: ImageView = itemView.findViewById(R.id.imgItem)
        val tvItemName: TextView = itemView.findViewById(R.id.tvItemName)
        val tvItemQuantity: TextView = itemView.findViewById(R.id.tvItemQuantity)
        val tvItemPrice: TextView = itemView.findViewById(R.id.tvItemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ChildViewHolder(view)
    }

    override fun getItemCount(): Int {
        return childItemList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val childItem = childItemList[position]
        holder.imgItem.setImageResource(childItem.itemImage)
        holder.tvItemName.text = childItem.itemName
        holder.tvItemQuantity.text = "${childItem.itemQuantity}${childItem.itemUnit}, Price"
        holder.tvItemPrice.text = "$ ${childItem.itemPrice}"
    }
}