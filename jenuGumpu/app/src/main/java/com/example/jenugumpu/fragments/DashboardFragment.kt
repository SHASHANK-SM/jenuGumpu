package com.example.jenugumpu.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jenugumpu.adapters.OpportunityAdapter
import com.example.jenugumpu.databinding.FragmentDashboardBinding
import com.example.jenugumpu.models.Opportunity

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val opportunities = listOf(
            Opportunity("Millet Snack Unit", "Package local snacks for schools and shops.", "Rs.12k/month", "Beginner"),
            Opportunity("Repair Desk", "Offer mobile accessory repair and charging-point service.", "Rs.18k/month", "Intermediate"),
            Opportunity("Craft Orders", "Sell handmade baskets and festival decor online.", "Rs.15k/month", "Beginner")
        )

        binding.opportunityList.layoutManager = LinearLayoutManager(requireContext())
        binding.opportunityList.adapter = OpportunityAdapter(opportunities)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
