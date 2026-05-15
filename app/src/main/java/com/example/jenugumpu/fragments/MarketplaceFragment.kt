package com.example.jenugumpu.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jenugumpu.adapters.ProductAdapter
import com.example.jenugumpu.databinding.FragmentMarketplaceBinding
import com.example.jenugumpu.models.Product

class MarketplaceFragment : Fragment() {

    private var _binding: FragmentMarketplaceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMarketplaceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val products = listOf(
            Product("Forest Blossom Honey", "Buy 500 ml jar", "Rs.220", "Premium stock"),
            Product("Wildflower Honey", "Sell 1 litre batch", "Rs.360/litre", "Seller listing"),
            Product("Jamun Honey", "Buy 250 ml jar", "Rs.140", "Limited batch")
        )
        binding.productList.layoutManager = LinearLayoutManager(requireContext())
        binding.productList.adapter = ProductAdapter(products)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
