package ro.portofolio.springWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.portofolio.springWebApp.model.Document;

public interface DocumentRepository extends JpaRepository<Document,String> {
}
