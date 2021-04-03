package com.blityapps.blitynews

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.blityapps.blitynews.Theming.BlityNewsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main()
        }
    }

    @Composable
    fun Main() {
        BlityNewsTheme {
            Surface(modifier = Modifier.fillMaxWidth()) {
                Text(text = stringResource(id = R.string.app_name))
            }
        }
    }

    @Preview
    @Composable
    fun MainPreviewLight() {
        BlityNewsTheme(isDark = false) {
            Surface(modifier = Modifier.fillMaxWidth()) {
                Text(text = stringResource(id = R.string.app_name))
            }
        }
    }

    @Preview
    @Composable
    fun MainPreviewDark() {
        BlityNewsTheme(isDark = true) {
            Surface(modifier = Modifier.fillMaxWidth()) {
                Text(text = stringResource(id = R.string.app_name))
            }
        }
    }
}
