package com.icosol.core.data

import com.icosol.core.domain.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}