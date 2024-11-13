package com.feeltheboard.`cc17-3f-bravojrs-act8`.fakedata

import com.feeltheboard.`cc17-3f-bravojrs-act8`.data.BookShelfContainer
import com.feeltheboard.`cc17-3f-bravojrs-act8`.data.BooksRepository

class FakeBookShelfContainer : BookShelfContainer {
    override val booksRepository: BooksRepository = FakeBooksRepository()
}