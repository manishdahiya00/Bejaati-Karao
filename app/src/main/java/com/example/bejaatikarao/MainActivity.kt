package com.example.bejaatikarao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bejaatikarao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            val color = binding.spinner.selectedItem.toString()
            val intent = Intent(this, BejaatiActivity::class.java)
            intent.putExtra("COLOR", color)
            startActivity(intent)
        }
    }
}