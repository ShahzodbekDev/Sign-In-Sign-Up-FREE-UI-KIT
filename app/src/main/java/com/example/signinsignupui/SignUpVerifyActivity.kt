package com.example.signinsignupui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signinsignupui.databinding.ActivitySignUpVerifyBinding

class SignUpVerifyActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpVerifyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpVerifyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.progressBar.progress = 100
    }
}