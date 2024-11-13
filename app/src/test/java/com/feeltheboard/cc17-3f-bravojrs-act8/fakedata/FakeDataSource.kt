package com.feeltheboard.`cc17-3f-bravojrs-act8`.fakedata

import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.BookImageLinks
import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.BookItems
import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.BookVolumeInfo

object FakeDataSource {
    val books = fakeBooksList
}

val fakeImageLinks = BookImageLinks(
    thumbnail = "https://fakeurl.com/thumbnail.jpg"
)

val fakeVolumeInfo = BookVolumeInfo(
    title = "Fake Book Title",
    imageLinks = fakeImageLinks
)

val fakeBookItems = BookItems(
    id = "fakeId",
    volumeInfo = fakeVolumeInfo
)

val fakeBooksList = listOf(
    fakeBookItems
)