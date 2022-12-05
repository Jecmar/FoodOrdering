package com.example.foodordering.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.foodordeeing.databinding.ActivityBottomNavigationBinding

class BottomNavigation : AppCompatActivity() {
    private lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)

        val navHostController = supportFragmentManager.findFragmentById(binding.fragmentRoot.id) as NavHostFragment
        val controller = navHostController.navController

        binding.bottomNavigation.setupWithNavController(controller)

        setContentView(binding.root)

    }
}