package com.example.jenugumpu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jenugumpu.databinding.ItemOpportunityBinding
import com.example.jenugumpu.models.Opportunity

class OpportunityAdapter(
    private val items: List<Opportunity>
) : RecyclerView.Adapter<OpportunityAdapter.OpportunityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpportunityViewHolder {
        val binding = ItemOpportunityBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OpportunityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OpportunityViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class OpportunityViewHolder(
        private val binding: ItemOpportunityBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Opportunity) {
            binding.titleText.text = item.title
            binding.descriptionText.text = item.description
            binding.incomeText.text = item.estimatedIncome
            binding.skillText.text = item.skillLevel
        }
    }
}
