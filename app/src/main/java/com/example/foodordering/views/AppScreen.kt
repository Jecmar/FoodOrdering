package com.example.foodordering.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.contains
import com.example.foodordeeing.databinding.ActivityAppScreenBinding
import com.example.foodordeeing.databinding.FragmentSignUpScreenBinding

class AppScreen : AppCompatActivity() {
    private lateinit var binding: ActivityAppScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, BottomNavigation::class.java)
            startActivity(intent)
        }

        binding.signup.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()

            transaction.add(android.R.id.content, SignUpScreen()).commit()
        }
    }
}