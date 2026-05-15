package com.example.jenugumpu.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jenugumpu.ai.GenAiAdvisor
import com.example.jenugumpu.databinding.FragmentAiAssistantBinding

class AiAssistantFragment : Fragment() {

    private var _binding: FragmentAiAssistantBinding? = null
    private val binding get() = _binding!!
    private val advisor = GenAiAdvisor()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAiAssistantBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.generateButton.setOnClickListener {
            val skill = binding.skillInput.text.toString().ifBlank { "craft" }
            val place = binding.locationInput.text.toString().ifBlank { "your area" }
            val budget = binding.budgetInput.text.toString().toIntOrNull() ?: 3000
            binding.aiResult.text = advisor.buildBusinessAdvice(skill, place, budget)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
