package com.luislenes.fakesocialnetwork.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.luislenes.fakesocialnetwork.data.database.entity.PostEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PostDao {

    @Query("SELECT * FROM posts_table")
    suspend fun get(): Flow<List<PostEntity>>

    @Query("SELECT * FROM posts_table WHERE id=:id")
    suspend fun getById(id: Int): Flow<PostEntity>

    @Insert
    suspend fun insert(posts: List<PostEntity>)

    @Insert
    suspend fun insert(post: PostEntity)

    @Query("DELETE FROM trip_table")
    suspend fun deleteAll()
}