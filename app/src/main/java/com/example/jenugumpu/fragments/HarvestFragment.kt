package com.example.jenugumpu.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jenugumpu.databinding.FragmentHarvestBinding

class HarvestFragment : Fragment() {

    private var _binding: FragmentHarvestBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHarvestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.saveHarvestButton.setOnClickListener {
            val floralSource = binding.floralSourceInput.text.toString().trim().ifBlank { "Mixed forest blossom" }
            val moisture = binding.moistureInput.text.toString().toDoubleOrNull() ?: 18.0
            val litres = binding.litresInput.text.toString().toDoubleOrNull() ?: 0.0
            val quality = when {
                moisture <= 18.5 -> "Premium grade"
                moisture <= 20.0 -> "Good grade"
                else -> "Needs moisture reduction"
            }
            binding.harvestResult.text = "Saved batch: $floralSource honey, $litres litres, $moisture% moisture. Quality: $quality."
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
