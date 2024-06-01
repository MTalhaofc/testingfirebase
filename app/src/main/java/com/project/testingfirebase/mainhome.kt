package com.project.testingfirebase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.testingfirebase.databinding.ActivityMainBinding
import com.project.testingfirebase.databinding.ActivityMainhomeBinding

class mainhome : AppCompatActivity() {

    private lateinit var binding: ActivityMainhomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainhomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}