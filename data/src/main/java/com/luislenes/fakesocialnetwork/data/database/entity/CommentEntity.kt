package com.luislenes.fakesocialnetwork.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey
import com.luislenes.fakesocialnetwork.core.util.StringUtil

@Entity(
    tableName = "comments_table",
    foreignKeys = [
        ForeignKey(
            entity = PostEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("post_id"),
            onDelete = CASCADE
        )
    ]
)
data class CommentEntity(
    @PrimaryKey val id: Int = 0,
    val body: String = StringUtil.EMPTY,
    val email: String = StringUtil.EMPTY,
    val name: String = StringUtil.EMPTY,
    @ColumnInfo(name = "post_id") val postId: Int = 0
)
