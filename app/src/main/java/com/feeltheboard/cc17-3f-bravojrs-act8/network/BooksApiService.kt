package com.feeltheboard.`cc17-3f-bravojrs-act8`.network

import com.feeltheboard.`cc17-3f-bravojrs-act8`.network.model.Books
import retrofit2.http.GET

interface BooksApiService {
    @GET("v1/volumes?q=science+fiction/")
    suspend fun getBooks(): Books
}