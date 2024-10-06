package com.app.nectar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.nectar.R
import com.app.nectar.adapters.CartItemAdapter
import com.app.nectar.databinding.FragmentCartBinding
import com.app.nectar.models.CartItem

class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding

    private lateinit var cartItemList: MutableList<CartItem>
    private lateinit var cartItemAdapter: CartItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        prepareData()

        cartItemAdapter = CartItemAdapter(requireContext(), cartItemList)

        binding.cartRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.cartRecyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        binding.cartRecyclerView.adapter = cartItemAdapter

        return binding.root
    }

    private fun prepareData() {
        cartItemList = mutableListOf<CartItem>().apply {
            add(CartItem(1, "Bell Pepper Red", 1.0, "kg", 1, 4.99, R.drawable.cart_item_1))
            add(CartItem(2, "Egg Chicken Red", 4.0, "pcs", 1, 1.99, R.drawable.cart_item_2))
            add(CartItem(3, "Organic Bananas", 12.0, "kg", 1, 2.99, R.drawable.cart_item_3))
            add(CartItem(4, "Ginger", 250.0, "gram", 1, 2.99, R.drawable.cart_item_4))
        }
    }
}