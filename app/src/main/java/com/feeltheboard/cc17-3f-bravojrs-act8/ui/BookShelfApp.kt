package com.feeltheboard.`cc17-3f-bravojrs-act8`.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.`cc17-3f-bravojrs-act8`.LocalBookShelfViewModel
import com.feeltheboard.`cc17-3f-bravojrs-act8`.ui.components.BookShelfAppTopBar
import com.feeltheboard.`cc17-3f-bravojrs-act8`.ui.components.BookShelfHomeScreen

@Composable
fun BookShelfApp() {
    // Access the BookShelfViewModel from the CompositionLocal
    val viewModel = LocalBookShelfViewModel.current
    Scaffold(
        topBar = {
            BookShelfAppTopBar()
        }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            BookShelfHomeScreen(
                books = viewModel.bookShelfState,
                contentPadding = it
            )
        }
    }

}