package com.example.proyecto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pagina3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)
    }
    fun irpagina4(view: View) {
        val intent = Intent(this, pagina4::class.java)
        startActivity(intent)
    }
    fun irpagina5(view: View) {
        val intent = Intent(this, pagina5::class.java)
        startActivity(intent)
    }
    fun irpagina6(view: View) {
        val intent = Intent(this, pagina6::class.java)
        startActivity(intent)
    }
    fun irpagina7(view: View) {
        val intent = Intent(this, pagina7::class.java)
        startActivity(intent)
    }
    fun irpagina8(view: View) {
        val intent = Intent(this, pagina8::class.java)
        startActivity(intent)
    }
}