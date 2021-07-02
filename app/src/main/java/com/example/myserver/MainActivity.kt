package com.example.myserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myWebView : WebView = findViewById(R.id.myWebView)

        val etURL: EditText = findViewById(R.id.etUrl)

        val btnGo: ImageView = findViewById(R.id.btnGo)

        myWebView.webViewClient= WebViewClient()

        btnGo.setOnClickListener {
            val siteUrl: String = etURL.text.toString()
            if (URLUtil.isAboutUrl(siteUrl)){

            myWebView.loadUrl(siteUrl)

            }

            else
            {
                myWebView.loadUrl("https://www.google.com/search?q=$siteUrl")
            }

        }


        myWebView.settings.javaScriptEnabled = true
    }
}