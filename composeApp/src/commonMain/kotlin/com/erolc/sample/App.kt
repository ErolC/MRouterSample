package com.erolc.sample

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.erolc.mrouter.RouteHost
import com.erolc.mrouter.register.page
import com.erolc.sample.page.Home
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        RouteHost("home") {
            page("home") {
                Home()
            }
        }
    }
}