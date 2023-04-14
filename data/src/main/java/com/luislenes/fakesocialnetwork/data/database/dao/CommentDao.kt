package com.luislenes.fakesocialnetwork.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.luislenes.fakesocialnetwork.data.database.entity.CommentEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CommentDao {

    @Query("SELECT * FROM comments_table WHERE post_id = :postId")
    suspend fun getByPostId(postId: Int): Flow<List<CommentEntity>>
}