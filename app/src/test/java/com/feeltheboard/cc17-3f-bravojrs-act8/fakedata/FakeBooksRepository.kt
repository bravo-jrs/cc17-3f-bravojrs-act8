package com.feeltheboard.`cc17-3f-bravojrs-act8`.fakedata

import com.feeltheboard.`cc17-3f-bravojrs-act8`.data.BooksRepository
import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.Books

class FakeBooksRepository: BooksRepository {
    override suspend fun getBooks(): Books {
        return Books(
            items = FakeDataSource.books
        )
    }
}