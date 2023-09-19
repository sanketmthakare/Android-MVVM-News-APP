package com.anushka.newsapiclient.data.repository.datasourceImpl

import com.anushka.newsapiclient.data.api.NewsAPIService
import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String,page: Int): Response<APIResponse> {
    return newsAPIService.getTopHeadline(country,page)
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<APIResponse> {
      return newsAPIService.getSearchedTopHeadline(country,searchQuery,page)
    }
}