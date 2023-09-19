package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.data.db.ArticleDAO
import com.anushka.newsapiclient.data.repository.datasource.NewsLocalDataSource
import com.anushka.newsapiclient.data.repository.datasourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(articleDao:ArticleDAO):NewsLocalDataSource{
        return NewsLocalDataSourceImpl(articleDao)
    }
}