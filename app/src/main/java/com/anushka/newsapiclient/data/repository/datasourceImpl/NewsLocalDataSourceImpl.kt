package com.anushka.newsapiclient.data.repository.datasourceImpl

import com.anushka.newsapiclient.data.db.ArticleDAO
import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.data.repository.datasource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(private val articleDAO: ArticleDAO):NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
       return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticleFromDatabase(article: Article) {
        return articleDAO.deleteArticle(article)
    }
}