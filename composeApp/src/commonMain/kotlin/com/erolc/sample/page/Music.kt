package com.erolc.sample.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.erolc.mrouter.register.Register
import com.erolc.mrouter.register.module
import com.erolc.mrouter.utils.Page

fun Register.route() = module("music") {
    page("first") {
        First()
    }
    page("second") {
        Second()
    }
}

@Composable
fun First() = Page {
    Column(Modifier.fillMaxHeight()) {
        Spacer(Modifier.weight(1f))

    }
}


@Composable
fun Second() = Page {

}