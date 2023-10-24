package com.example.signinsignupui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signinsignupui.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupTvBtn.setOnClickListener {
            Intent(this, SignUpActivity::class.java).apply {
                startActivity(this)
            }
        }

    }
}