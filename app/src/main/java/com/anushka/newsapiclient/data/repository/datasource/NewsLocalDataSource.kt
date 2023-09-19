package com.anushka.newsapiclient.data.repository.datasource

import androidx.room.Delete
import com.anushka.newsapiclient.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
    fun getSavedArticles(): Flow<List<Article>>
    suspend fun deleteArticleFromDatabase(article: Article)
}