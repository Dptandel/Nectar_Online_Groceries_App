package com.app.nectar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.nectar.R
import com.app.nectar.adapters.FavouriteItemAdapter
import com.app.nectar.databinding.FragmentFavouriteBinding
import com.app.nectar.models.FavouriteItem

class FavouriteFragment : Fragment() {

    private lateinit var binding: FragmentFavouriteBinding

    private lateinit var favouriteItemList: MutableList<FavouriteItem>

    private lateinit var favouriteItemAdapter: FavouriteItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavouriteBinding.inflate(inflater, container, false)

        prepareData()

        favouriteItemAdapter = FavouriteItemAdapter(requireContext(), favouriteItemList)

        binding.favouriteRecyclerView.adapter = favouriteItemAdapter
        binding.favouriteRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.favouriteRecyclerView.addItemDecoration(
            DividerItemDecoration(
                requireContext(), DividerItemDecoration.VERTICAL
            )
        )

        return binding.root
    }

    private fun prepareData() {
        favouriteItemList = mutableListOf<FavouriteItem>().apply {
            add(FavouriteItem(1, "Sprite Can", 325.0, "ml", 1.50, R.drawable.image_1))
            add(FavouriteItem(2, "Diet Coke", 355.0, "ml", 1.99, R.drawable.image_2))
            add(FavouriteItem(3, "Apple & Grape Juice", 2.0, "L", 15.50, R.drawable.image_3))
            add(FavouriteItem(4, "Coca Cola Can", 325.0, "ml", 4.99, R.drawable.image_4))
            add(FavouriteItem(5, "Pepsi Can", 330.0, "ml", 4.99, R.drawable.image_5))
        }
    }
}