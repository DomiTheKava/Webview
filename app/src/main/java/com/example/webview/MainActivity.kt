package com.example.webview

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetUp()
    }


    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp() {
        val webView: WebView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()

        webView.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }


    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val webView: WebView = findViewById<WebView>(R.id.webview)
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }

}