package com.example.proyecto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun irpagina2(view: View) {
        val intent = Intent(this, pagina2::class.java)
        startActivity(intent)
    }
}