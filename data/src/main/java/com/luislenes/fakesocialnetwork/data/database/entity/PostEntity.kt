package com.luislenes.fakesocialnetwork.data.database.entity

import androidx.room.*
import com.luislenes.fakesocialnetwork.core.util.StringUtil.EMPTY

@Entity(tableName = "posts_table")
data class PostEntity(
    @PrimaryKey
    val id: Int = 0,
    val body: String = EMPTY,
    val title: String = EMPTY,
    @ColumnInfo(name = "user_id")
    val userId: Int = 0,
    @Embedded
    @Relation(
        parentColumn = "id",
        entityColumn = "post_id"
    )
    val comments: List<CommentEntity> = emptyList()
)