package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, BlankFragment.newInstance())
            .commit()
    }
}