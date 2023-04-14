package com.luislenes.fakesocialnetwork.core.datasource

import kotlinx.coroutines.flow.Flow

interface NetworkDataSource<T> {

    suspend fun get(): Flow<List<T>>

    suspend fun getById(id: Int): Flow<T>

}