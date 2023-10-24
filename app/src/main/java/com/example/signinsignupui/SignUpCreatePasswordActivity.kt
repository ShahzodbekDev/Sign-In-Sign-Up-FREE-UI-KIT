package com.example.signinsignupui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.signinsignupui.databinding.ActivitySignUpCreatePasswordBinding


class SignUpCreatePasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpCreatePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpCreatePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressBar.progress = 66
        binding.nextBtn.setOnClickListener {
            Intent(this, SignUpVerifyActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}