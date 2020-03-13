package ro.portofolio.springWebApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import ro.portofolio.springWebApp.model.Document;
import ro.portofolio.springWebApp.repository.DocumentRepository;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class FirstWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstWebAppApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(DocumentRepository repo) {
        return args -> {
            repo.saveAll(List.of(
            		new Document(UUID.randomUUID().toString(),"doc1"),
            		new Document(UUID.randomUUID().toString(),"doc2"),
            		new Document(UUID.randomUUID().toString(),"doc3"),
            		new Document(UUID.randomUUID().toString(),"doc4"),
            		new Document(UUID.randomUUID().toString(),"doc5")
			));
        };
    }


}
