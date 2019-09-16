package ro.portofolio.springWebApp.service;

import org.springframework.stereotype.Service;
import ro.portofolio.springWebApp.model.Document;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Service
public class DocumentService {

    private final List<Document> documents = new ArrayList<>();

    public List<Document> getDocuments(String name) {
        return ofNullable(name)
                .map(this::getByName)
                .orElse(documents);

    }

    private List<Document> getByName(String name) {
        return documents.stream()
                .filter(document -> document.getName().equals(name))
                .collect(Collectors.toList());
    }


    public Document addDocument(Document doc) {
        doc.setDocumentId(UUID.randomUUID().toString());
        documents.add(doc);
        return doc;
    }

    public Document getDocument(String docId) {
        return documents.stream()
                .filter(document -> document.getDocumentId().equals(docId))
                .findFirst()
                .orElse(null);

    }

    public Document updateDocument(String documentId, Document doc) {
        final Document existingDocuments = getDocument(documentId);
        if (existingDocuments != null) {
            doc.setDocumentId(documentId);
            documents.remove(existingDocuments);
            documents.add(doc);
            return existingDocuments;
        } else {
            return null;
        }

    }

    public Document deleteDocument(String documentId) {
        final Document doc = getDocument(documentId);
        if (documents.remove(doc)) {
            return doc;
        } else
            return null;
    }
}

