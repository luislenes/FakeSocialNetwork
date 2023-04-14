package com.luislenes.fakesocialnetwork.core.model


import com.google.gson.annotations.SerializedName
import com.luislenes.fakesocialnetwork.core.util.StringUtil.EMPTY

data class Post(
    @SerializedName("body")
    val body: String = EMPTY,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("title")
    val title: String = EMPTY,
    @SerializedName("userId")
    val userId: Int = 0
)