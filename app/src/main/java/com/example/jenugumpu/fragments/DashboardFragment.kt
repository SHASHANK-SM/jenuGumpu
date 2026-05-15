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
            Opportunity("Forest Blossom Batch", "18.2% moisture, ready for premium bottle packing.", "42 litres", "Premium"),
            Opportunity("Jamun Floral Source", "Dark honey batch with strong local demand.", "28 litres", "Good"),
            Opportunity("Wildflower Stock", "Suggested for small 250 ml jars and festival sales.", "35 litres", "Market fit")
        )

        binding.opportunityList.layoutManager = LinearLayoutManager(requireContext())
        binding.opportunityList.adapter = OpportunityAdapter(opportunities)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
