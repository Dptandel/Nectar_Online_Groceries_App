package com.app.nectar.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import com.app.nectar.R
import com.app.nectar.adapters.ProductItemAdapter
import com.app.nectar.databinding.FragmentExploreBinding
import com.app.nectar.databinding.ProductItemBinding
import com.app.nectar.models.ProductItem

class ExploreFragment : Fragment() {

    private lateinit var binding: FragmentExploreBinding

    private val productItemList = ArrayList<ProductItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentExploreBinding.inflate(inflater, container, false)

        binding.productRecyclerView.layoutManager = GridLayoutManager(context,2, GridLayoutManager.VERTICAL, false)

        addProducts()

        val productItemAdapter = ProductItemAdapter(productItemList)
        binding.productRecyclerView.adapter = productItemAdapter

        return binding.root
    }

    private fun addProducts() {
        productItemList.add(ProductItem(R.drawable.product_item_1, "Fresh Fruits & Vegetables"))
        productItemList.add(ProductItem(R.drawable.product_item_2, "Cooking Oil & Ghee"))
        productItemList.add(ProductItem(R.drawable.product_item_3, "Meat & Fish"))
        productItemList.add(ProductItem(R.drawable.product_item_4, "Bakery & Snacks"))
        productItemList.add(ProductItem(R.drawable.product_item_5, "Dairy & Eggs"))
        productItemList.add(ProductItem(R.drawable.product_item_6, "Beverages"))
        productItemList.add(ProductItem(R.drawable.product_item_1, "Fresh Fruits & Vegetables"))
        productItemList.add(ProductItem(R.drawable.product_item_2, "Cooking Oil & Ghee"))
        productItemList.add(ProductItem(R.drawable.product_item_3, "Meat & Fish"))
        productItemList.add(ProductItem(R.drawable.product_item_4, "Bakery & Snacks"))
        productItemList.add(ProductItem(R.drawable.product_item_5, "Dairy & Eggs"))
        productItemList.add(ProductItem(R.drawable.product_item_6, "Beverages"))
    }
}