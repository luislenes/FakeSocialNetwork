package com.luislenes.fakesocialnetwork.core.datasource

import kotlinx.coroutines.flow.Flow

interface LocalDataSource<T> {

    suspend fun get(): Flow<List<T>>

    suspend fun getById(id: Int): Flow<T>

    suspend fun save(source: List<T>): Flow<Boolean>

    suspend fun deleteById(id: Int): Flow<Boolean>

    suspend fun clear(): Flow<Boolean>
}