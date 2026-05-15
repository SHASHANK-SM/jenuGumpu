package com.example.jenugumpu.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jenugumpu.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private var isSignupMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switchModeButton.setOnClickListener {
            isSignupMode = !isSignupMode
            updateMode()
        }

        binding.continueButton.setOnClickListener {
            val name = binding.nameInput.text.toString().trim()
            val phone = binding.phoneInput.text.toString().trim()
            val password = binding.passwordInput.text.toString().trim()

            when {
                isSignupMode && name.isBlank() -> binding.nameLayout.error = "Enter your name"
                phone.length < 10 -> binding.phoneLayout.error = "Enter valid phone number"
                password.length < 4 -> binding.passwordLayout.error = "Use at least 4 characters"
                else -> {
                    clearErrors()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
        }

        updateMode()
    }

    private fun updateMode() {
        clearErrors()
        binding.nameLayout.visibility = if (isSignupMode) android.view.View.VISIBLE else android.view.View.GONE
        binding.titleText.text = if (isSignupMode) "Create jenuGumpu Account" else "Welcome to jenuGumpu"
        binding.subtitleText.text = if (isSignupMode) {
            "Join the honey marketplace to record harvests, sell pure honey, and manage orders."
        } else {
            "Login to manage honey harvesting, buying, selling, and cart orders."
        }
        binding.continueButton.text = if (isSignupMode) "Sign Up" else "Login"
        binding.switchModeButton.text = if (isSignupMode) "Already have account? Login" else "New user? Create account"
    }

    private fun clearErrors() {
        binding.nameLayout.error = null
        binding.phoneLayout.error = null
        binding.passwordLayout.error = null
    }
}
