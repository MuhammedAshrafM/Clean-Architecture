package com.icosol.core.data

import com.icosol.core.domain.Document

class OpenDocumentRepository (private val dataSource: OpenDocumentDataSource){

    suspend fun setOpenDocument(document: Document) =
            dataSource.setOpenDocument(document)

    suspend fun getOpenDocument() =
            dataSource.getOpenDocument()
}