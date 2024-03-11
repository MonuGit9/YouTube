package com.planetapps.youtube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.planetapps.youtube.home.HomeScreen
import com.planetapps.youtube.ui.theme.YouTubeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YouTubeTheme {
                HomeScreen()
                }
            }
        }
    }