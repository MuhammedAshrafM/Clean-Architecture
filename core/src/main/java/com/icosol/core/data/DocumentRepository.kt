package com.icosol.core.data

import com.icosol.core.domain.Document

class DocumentRepository (private val dataSource: DocumentDataSource){

    suspend fun addDocument(document: Document) =
            dataSource.add(document)

    suspend fun getDocuments() =
            dataSource.readAll()

    suspend fun removeDocument(document: Document) =
            dataSource.remove(document)
}