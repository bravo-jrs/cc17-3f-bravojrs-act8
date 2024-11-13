package com.feeltheboard.`cc17-3f-bravojrs-act8`

import com.feeltheboard.`cc17-3f-bravojrs-act8`.data.NetworkBooksRepository
import com.feeltheboard.`cc17-3f-bravojrs-act8`.fakedata.FakeApiService
import com.feeltheboard.`cc17-3f-bravojrs-act8`.fakedata.FakeDataSource
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkBooksRepositoryTest {
    @Test
    fun networkBooksRepository_getData_verifyList() {
        runTest {
            // Arrange
            val booksRepository = NetworkBooksRepository(FakeApiService())
            // Act
            val books = booksRepository.getBooks()
            // Assert
            assertEquals(FakeDataSource.books, books.items)
        }
    }

}