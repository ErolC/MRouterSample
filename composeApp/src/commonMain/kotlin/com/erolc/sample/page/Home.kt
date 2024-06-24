package com.erolc.sample.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.erolc.mrouter.utils.Page

@Composable
fun Home() = Page {
    val items = remember { listOf("音乐界面") }
    LazyColumn {
        itemsIndexed(items) { index, item ->
            Button(onClick = {
                when (index) {
                    0 -> route("music/first")
                }
            }) {
                Text(item)
            }
        }
    }
}