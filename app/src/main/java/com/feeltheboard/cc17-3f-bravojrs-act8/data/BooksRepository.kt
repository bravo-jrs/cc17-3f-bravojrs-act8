package com.feeltheboard.`cc17-3f-bravojrs-act8`.data

import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.BooksApiService
import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.Books

interface BooksRepository {
    suspend fun getBooks(): Books
}

class NetworkBooksRepository(
    private val booksApiService: BooksApiService
): BooksRepository {
    override suspend fun getBooks(): Books {
        return booksApiService.getBooks()
    }
}