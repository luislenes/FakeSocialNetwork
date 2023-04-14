package com.luislenes.fakesocialnetwork.core.model


import com.google.gson.annotations.SerializedName
import com.luislenes.fakesocialnetwork.core.util.StringUtil.EMPTY

data class Comment(
    @SerializedName("body")
    val body: String = EMPTY,
    @SerializedName("email")
    val email: String = EMPTY,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = EMPTY,
    @SerializedName("postId")
    val postId: Int = 0
)