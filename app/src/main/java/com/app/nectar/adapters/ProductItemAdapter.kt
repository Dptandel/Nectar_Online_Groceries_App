package com.app.nectar.adapters

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.app.nectar.R
import com.app.nectar.models.ProductItem
import com.app.nectar.screens.ExploreCategoryScreen

class ProductItemAdapter(private val productList: List<ProductItem>) :
    RecyclerView.Adapter<ProductItemAdapter.ProductViewHolder>() {
    inner class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgProduct: ImageView = itemView.findViewById(R.id.imgProduct)
        val tvProductName: TextView = itemView.findViewById(R.id.tvProductName)
        val productItem: CardView = itemView.findViewById(R.id.productItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val productItem = productList[position]

        holder.imgProduct.setImageResource(productItem.itemImage)
        holder.tvProductName.text = productItem.itemName
        holder.productItem.apply {
            when ((position) % 5) {
                0 -> setCardBackgroundColor(Color.parseColor("#6453B175"))
                1 -> setCardBackgroundColor(Color.parseColor("#64F8A44C"))
                2 -> setCardBackgroundColor(Color.parseColor("#64F7A593"))
                3 -> setCardBackgroundColor(Color.parseColor("#64D3B0E0"))
                4 -> setCardBackgroundColor(Color.parseColor("#64FDE598"))
            }
            if (position == 5) {
                setOnClickListener {
                    context.startActivity(Intent(context, ExploreCategoryScreen::class.java))
                }
            }
        }
    }
}