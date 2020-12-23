package com.icosol.core.data

import com.icosol.core.domain.Document

interface DocumentDataSource {
    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}