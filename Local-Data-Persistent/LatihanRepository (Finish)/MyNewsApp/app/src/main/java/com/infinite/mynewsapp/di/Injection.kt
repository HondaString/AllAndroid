package com.infinite.mynewsapp.di

import android.content.Context
import com.infinite.mynewsapp.data.NewsRepository
import com.infinite.mynewsapp.data.local.room.NewsDatabase
import com.infinite.mynewsapp.data.remote.retrofit.ApiConfig
import com.infinite.mynewsapp.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        val appExecutors = AppExecutors()
        return NewsRepository.getInstance(apiService, dao, appExecutors)
    }
}