package com.icosol.core.interactors

import com.icosol.core.data.DocumentRepository
import com.icosol.core.domain.Document

class AddDocument (private val documentRepository: DocumentRepository){
    suspend operator fun invoke(document: Document) =
            documentRepository.addDocument(document)
}