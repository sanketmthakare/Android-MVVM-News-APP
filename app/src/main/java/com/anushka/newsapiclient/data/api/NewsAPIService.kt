package com.anushka.newsapiclient.data.api

import com.anushka.newsapiclient.data.model.APIResponse
import com.example.namespace.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {

    @GET("v2/top-headlines")
    suspend fun getTopHeadline(
        @Query("country")
        country: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String =BuildConfig.API_KEY
    ): Response<APIResponse>

    @GET("v2/top-headlines")
    suspend fun getSearchedTopHeadline(
        @Query("country")
        country: String,
        @Query("q")
        searchQuery:String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String =BuildConfig.API_KEY
    ): Response<APIResponse>
}