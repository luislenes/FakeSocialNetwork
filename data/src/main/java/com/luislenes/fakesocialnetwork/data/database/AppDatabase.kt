package com.luislenes.fakesocialnetwork.data.database

import androidx.room.Database
import com.luislenes.fakesocialnetwork.data.database.dao.PostDao
import com.luislenes.fakesocialnetwork.data.database.entity.CommentEntity
import com.luislenes.fakesocialnetwork.data.database.entity.PostEntity

@Database(
    entities = [PostEntity::class, CommentEntity::class],
    version = 1
)
abstract class AppDatabase {

    abstract fun postDao(): PostDao
}