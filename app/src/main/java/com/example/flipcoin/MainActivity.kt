
package com.example.flipcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flipButton: Button = findViewById(R.id.button)

        flipButton.setOnClickListener {
            flipCoin()
        }
}

    private fun flipCoin() {