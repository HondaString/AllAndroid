package com.infinite.newsapp.data.remote.retrofit

import com.infinite.newsapp.data.remote.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines?country=id&category=science")
    fun getNews(@Query("apiKey") apiKey: String): Call<NewsResponse>
}