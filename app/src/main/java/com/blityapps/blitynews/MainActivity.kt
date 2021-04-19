package com.blityapps.blitynews

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Sailing
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blityapps.blitynews.theming.BlityNewsTheme

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main(isSystemInDarkTheme())
        }
    }

    @Composable
    fun Main(isDark: Boolean = false) {
        BlityNewsTheme.Theme(isDark = isDark) {
            Scaffold(
                topBar = { BlityNewsAppBar() },
                modifier = Modifier.fillMaxSize(),
            ) { innerPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Surface(
                        modifier = Modifier
                            .clickable {}
                            .clip(MaterialTheme.shapes.medium)
                            .background(MaterialTheme.colors.surface)
                            .padding(16.dp)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = stringResource(id = R.string.app_name))
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(
                                content = {
                                    Text(text = "Button to click")
                                },
                                onClick = {
                                    Log.i(TAG, "MainPreviewLight: Hello")
                                },
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun BlityNewsAppBar() {
        val expanded = remember { mutableStateOf(false) }

        return TopAppBar(
            backgroundColor = MaterialTheme.colors.background,
            elevation = 0.dp,
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.app_name))

                Column {
                    IconButton(onClick = { expanded.value = true }) {
                        Icon(
                            Icons.Rounded.Sailing,
                            contentDescription = "Hello"
                        )
                    }

                    DropdownMenu(
                        expanded = expanded.value,
                        onDismissRequest = { expanded.value = false },
                        modifier = Modifier.wrapContentWidth()
                    ) {
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: first") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Second") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                        DropdownMenuItem(onClick = { Log.i(TAG, "BlityNewsAppBar: Third") }) {
                            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                    contentDescription = "Ok",
                                    modifier = Modifier
                                        .width(36.dp)
                                        .height(36.dp)
                                )
                                Text(text = "Second")
                            }
                        }
                    }
                }
            }
        }
    }

    @Preview
    @Composable
    fun MainPreviewLight() {
        Main(false)
    }

    @Preview
    @Composable
    fun MainPreviewDark() {
        Main(true)
    }
}
