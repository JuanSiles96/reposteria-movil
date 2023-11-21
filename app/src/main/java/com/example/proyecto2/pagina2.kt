package com.example.proyecto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pagina2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)
    }
    fun irpagina3(view: View) {
        val intent = Intent(this, pagina3::class.java)
        startActivity(intent)
    }
}