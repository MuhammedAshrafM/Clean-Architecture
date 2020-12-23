package com.icosol.core.interactors

import com.icosol.core.data.BookmarkRepository
import com.icosol.core.domain.Bookmark
import com.icosol.core.domain.Document

class AddBookmark (private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
            bookmarkRepository.addBookmark(document, bookmark)
}