package com.bookstore.hibernatespringbootfilterassociation;

import com.bookstore.hibernatespringbootfilterassociation.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringBootFilterAssociationApplication {

    private final BookstoreService bookstoreService;

    public HibernateSpringBootFilterAssociationApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateSpringBootFilterAssociationApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("\nAuthor with all books ...");
            bookstoreService.fetchAuthorWithAllBooks();

            System.out.println("\nAuthor with cheap books ...");
            bookstoreService.fetchAuthorWithCheapBooks();

            System.out.println("\nAuthor with rest of books ...");
            bookstoreService.fetchAuthorWithRestOfBooks();
        };
    }

}
