package com.example.rssreaderwithdagger2.cache

import androidx.room.*
import com.example.rssreaderwithdagger2.model.Model


@Dao
interface RoomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertDB(article: Model): Long

//    @Query("SELECT * FROM articles")
//    fun getAllArticles(): LiveData<List<Article>>
//
//    @Delete
//    suspend fun deleteArticle(article: Article)


}