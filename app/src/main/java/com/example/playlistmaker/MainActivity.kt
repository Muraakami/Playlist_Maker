package com.example.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.main_search)

        val buttonListener : View.OnClickListener = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, "Привет ревьюер!", Toast.LENGTH_SHORT).show()
            }
        }
        buttonSearch.setOnClickListener (buttonListener)

        val buttonLibrary = findViewById<Button>(R.id.main_library)
        buttonLibrary.setOnClickListener {
            Toast.makeText(this@MainActivity, "Желаю вам хорошего дня!", Toast.LENGTH_SHORT).show()
        }
        val buttonSettings = findViewById<Button>(R.id.main_settings)
        buttonSettings.setOnClickListener {
            Toast.makeText(this@MainActivity, "До свидания!", Toast.LENGTH_SHORT).show()
        }
    }
}