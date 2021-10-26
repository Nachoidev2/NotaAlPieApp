package com.example.notaalpie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.webkit.WebView
import android.widget.Toast

class Configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)
    }
    var dobleback = false
    override fun onBackPressed()
    {
        if (dobleback)
        {
            super.onBackPressed()
            return
        }
        val Sitio: WebView = findViewById(R.id.Sitio)
        if (Sitio.url == "https://www.notaalpie.com.ar/")
        {
            dobleback = true
            setContentView(R.layout.activity_main2)
        }
        else
        {

        }
    }
}