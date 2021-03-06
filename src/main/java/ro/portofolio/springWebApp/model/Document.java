package ro.portofolio.springWebApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Document {
    @Id
    private String documentId;
    private String name;

    public Document() {

    }
    public Document(String document, String name) {
        this.documentId = document;
        this.name = name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(documentId, document.documentId) &&
                Objects.equals(name, document.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
