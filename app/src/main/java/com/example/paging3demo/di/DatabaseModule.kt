package com.example.paging3demo.di

import android.content.Context
import androidx.room.Room
import com.example.paging3demo.data.local.UnsplashDatabase
import com.example.paging3demo.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    fun provideDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase {
        return Room.databaseBuilder(
            context,
            UnsplashDatabase::class.java,
            UNSPLASH_DATABASE
        ).build()
    }

}