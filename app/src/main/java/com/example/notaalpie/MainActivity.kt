package com.example.notaalpie

import android.net.http.SslError
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val myWebView: WebView = findViewById(R.id.Sitio)
        myWebView.webViewClient = WebViewClient()

        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.useWideViewPort = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.loadWithOverviewMode = true
        myWebView.settings.textZoom = 110
        myWebView.setInitialScale(40);
        

        myWebView.loadUrl("https://www.notaalpie.com.ar/")
        //setContentView(R.layout.activity_main2)

    }



    // boton para atras y salir de la app
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
            Toast.makeText(this, "Presione atrás de nuevo para salir", Toast.LENGTH_SHORT).show()
            Handler().postDelayed({ dobleback = false }, 2000)
            setContentView(R.layout.settings_activity)
        }
        else
        {
            Sitio.goBack();
        }
    }
}

