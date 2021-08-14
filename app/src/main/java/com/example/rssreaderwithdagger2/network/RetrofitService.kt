package com.example.rssreaderwithdagger2.network

import com.example.rssreaderwithdagger2.model.Model
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RetrofitService {
    companion object {
        const val ENDPOINT = "https://rss-to-json-serverless-api.vercel.app/"
    }

    @GET("api")
    suspend fun getSets(
        @Query("feedURL") feedURL: String
    ): Model
}