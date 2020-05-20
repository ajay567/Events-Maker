package com.example.groupproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_browser.*

class browser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)
//        var Address = "https://www.cnn.com/"
//        button1.callOnClick()
        var title = intent.getStringExtra("name")


        if(title == "Google Search"){
            var Address = "https://www.google.com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }
        if(title == "Youtube"){
            var Address = "https://www.youtube.com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }
        if(title == "CNN"){
            var Address = "https://www.cnn.com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }

        if(title == "CNBC"){
            var Address = "https://www.cnbc.com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }
        if(title == "The New York Times"){
            var Address = "https://www.nytimes.com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }

        if(title == "The Washington Post"){
            var Address = "https://www.washingtonpost.com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }
        button1.setOnClickListener {
            var Address = "https://www." + editText1.text.toString()+".com/"
            val webSetting = webView1.settings
            webSetting.builtInZoomControls = true
            webSetting.javaScriptEnabled = true
            editText1.visibility = View.GONE
            button1.visibility = View.GONE
            webView1.webViewClient = WebViewClient()
            webView1.loadUrl(Address)
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView1.canGoBack()) {
            val pulse = AnimationUtils.loadAnimation(this, R.anim.abc_slide_out_bottom)
            webView1.startAnimation(pulse)
            webView1.goBack()
            editText1.visibility = View.VISIBLE
            button1.visibility = View.VISIBLE


            return true
        }
        return super.onKeyDown(keyCode, event)

    }
}
