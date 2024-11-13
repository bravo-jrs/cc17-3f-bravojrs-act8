package com.feeltheboard.`cc17-3f-bravojrs-act8`.fakedata

import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.BooksApiService
import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.Books

class FakeApiService: BooksApiService {
    override suspend fun getBooks(): Books {
        return Books(
            items = FakeDataSource.books
        )
    }
}