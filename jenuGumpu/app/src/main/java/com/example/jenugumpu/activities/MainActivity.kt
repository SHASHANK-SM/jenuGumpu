package com.example.jenugumpu.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.jenugumpu.R
import com.example.jenugumpu.databinding.ActivityMainBinding
import com.example.jenugumpu.fragments.AiAssistantFragment
import com.example.jenugumpu.fragments.DashboardFragment
import com.example.jenugumpu.fragments.MarketplaceFragment
import com.example.jenugumpu.fragments.ReportsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            openFragment(DashboardFragment())
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_dashboard -> openFragment(DashboardFragment())
                R.id.nav_ai -> openFragment(AiAssistantFragment())
                R.id.nav_marketplace -> openFragment(MarketplaceFragment())
                R.id.nav_reports -> openFragment(ReportsFragment())
            }
            true
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
