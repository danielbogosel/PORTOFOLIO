package ro.portofolio.springWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.portofolio.springWebApp.model.Document;


public interface DocumentRepository extends JpaRepository<Document,String> {
}
