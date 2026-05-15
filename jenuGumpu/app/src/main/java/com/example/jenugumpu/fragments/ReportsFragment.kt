package com.example.jenugumpu.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jenugumpu.databinding.FragmentReportsBinding

class ReportsFragment : Fragment() {

    private var _binding: FragmentReportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentReportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.salesValue.text = "Rs.24,800"
        binding.ordersValue.text = "126"
        binding.aiTip.text = "AI Tip: Promote your best-selling product on weekends and prepare 20% extra stock before local events."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
