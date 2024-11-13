package com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model

data class Books(
    val items: List<BookItems>
)

data class BookItems(
    val id: String,
    val volumeInfo: BookVolumeInfo
)

data class BookVolumeInfo(
    val title: String,
    val imageLinks: BookImageLinks
)

data class BookImageLinks(
    val thumbnail: String
)
