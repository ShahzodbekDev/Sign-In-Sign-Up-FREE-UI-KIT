package com.example.signinsignupui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.signinsignupui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lineView = findViewById<View>(R.id.lineView)
        lineView.layoutParams.height = 200

        binding.createAcBtn.setOnClickListener {
            Intent(this,CreateAccountActivity::class.java).apply {
                startActivity(this)
            }
        }
        binding.signupTvBtn.setOnClickListener {
            Intent(this,SignUpActivity::class.java).apply {
                startActivity(this)
            }
        }

    }
}