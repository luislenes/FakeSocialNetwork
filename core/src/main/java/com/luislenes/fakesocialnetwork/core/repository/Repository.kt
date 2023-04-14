package com.luislenes.fakesocialnetwork.core.repository

import com.luislenes.fakesocialnetwork.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface Repository<T> {

    suspend fun get(): Flow<Resource<List<T>>>

    suspend fun getById(id: Int): Flow<Resource<T>>

    suspend fun deleteById(id: Int): Flow<Boolean>

    suspend fun delete(): Flow<Boolean>
}