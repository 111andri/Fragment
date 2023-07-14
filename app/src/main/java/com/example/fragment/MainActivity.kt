package com.example.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragment.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = secondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.f1fragment, firstFragment)
            commit()
        }

        val btnFirstFragment = findViewById<Button>(R.id.btnFirstFragment)

        btnFirstFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.f1fragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnsecondFragment = findViewById<Button>(R.id.btnSecondFragment)

        btnsecondFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.f1fragment,secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}