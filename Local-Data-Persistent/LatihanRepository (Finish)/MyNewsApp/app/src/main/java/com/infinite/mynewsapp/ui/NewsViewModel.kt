package com.infinite.mynewsapp.ui

import androidx.lifecycle.ViewModel
import com.infinite.mynewsapp.data.NewsRepository
import com.infinite.mynewsapp.data.local.entity.NewsEntity

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()

    fun saveNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, true)
    }

    fun deleteNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, false)
    }
}