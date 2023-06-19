package com.bookstore.hibernatespringbootmanytomanybidirectional;

import com.bookstore.hibernatespringbootmanytomanybidirectional.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringBootManyToManyBidirectionalApplication {

    @Autowired
    private BookstoreService bookstoreService;

    public static void main(String[] args) {
        SpringApplication.run(HibernateSpringBootManyToManyBidirectionalApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.insertAuthorsWithBooks();
        };
    }
}
