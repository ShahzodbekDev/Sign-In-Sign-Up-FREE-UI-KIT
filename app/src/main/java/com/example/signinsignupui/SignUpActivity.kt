package com.example.signinsignupui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signinsignupui.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressBar.progress = 33
        binding.nextBtn.setOnClickListener {
            Intent(this, SignUpCreatePasswordActivity::class.java).apply {
                startActivity(this)
            }
        }

    }
}