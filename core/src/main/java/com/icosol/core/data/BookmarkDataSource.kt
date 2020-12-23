package com.icosol.core.data

import com.icosol.core.domain.Bookmark
import com.icosol.core.domain.Document

interface BookmarkDataSource {
    suspend fun add(document: Document, bookmark: Bookmark)

    suspend fun read(document: Document): List<Bookmark>

    suspend fun remove(document: Document, bookmark: Bookmark)
}