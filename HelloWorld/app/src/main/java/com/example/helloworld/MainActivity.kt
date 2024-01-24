package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val names = listOf("Alice", "Bob", "Charlie", "World")
    private var currNameIdx = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeBtn: android.widget.Button = findViewById(R.id.button)
        val helloText: android.widget.TextView = findViewById(R.id.text)
        helloText.text = getString(R.string.hello_text, "World")

        changeBtn.setOnClickListener {
            currNameIdx++
            if (currNameIdx >= names.size) currNameIdx = 0
            helloText.text = getString(R.string.hello_text, names[currNameIdx])
            showToast()
        }
    }

    private fun showToast() {
        Toast.makeText(this, "Changed!", Toast.LENGTH_SHORT).show()
    }
}