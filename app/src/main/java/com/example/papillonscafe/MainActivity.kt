package com.example.papillonscafe

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.papillonscafe.ui.theme.PapillonsCafeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            enableEdgeToEdge()
            setContent {
                PapillonsCafeTheme {
                    val context = LocalContext.current
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        floatingActionButton = {
                            FloatingActionButton(onClick = {
                                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:715-396-2736"))
                                context.startActivity(intent)
                            }) {
                                Icon(Icons.Filled.Phone, contentDescription = "Call Papillon's Cafe")
                            }
                        }
                    ) { innerPadding ->
                        WebsiteView(
                            modifier = Modifier.padding(innerPadding),
                            url = "https://papillonscaferhinelander.com"
                        )
                    }
                }
            }
        }, 6000)
    }
}

@Composable
fun WebsiteView(modifier: Modifier = Modifier, url: String) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                loadUrl(url)
            }
        },
        update = { webView ->
            webView.loadUrl(url)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun WebsiteViewPreview() {
    PapillonsCafeTheme {
        WebsiteView(url = "https://papillonscaferhinelander.com")
    }
}
