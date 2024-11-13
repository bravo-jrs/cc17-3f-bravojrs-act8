package com.feeltheboard.`cc17-3f-bravojrs-act8`.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.feeltheboard.`cc17-3f-bravojrs-act8`.data.BooksRepository
import kotlinx.coroutines.launch

class BookShelfViewModel(
    private val booksRepository: BooksRepository
): ViewModel() {
    var bookShelfState: String by mutableStateOf("")

    init {
        getBooks()
    }

    private fun getBooks() =
        try {
            viewModelScope.launch {
                val books = booksRepository.getBooks()
                bookShelfState = ("${books.items.size} Books found!")
            }
        } catch (e: Exception) {
                bookShelfState = "Error: ${e.message}"
        }
}