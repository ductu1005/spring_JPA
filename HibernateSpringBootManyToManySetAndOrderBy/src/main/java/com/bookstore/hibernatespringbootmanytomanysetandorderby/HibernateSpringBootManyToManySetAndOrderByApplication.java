package com.bookstore.hibernatespringbootmanytomanysetandorderby;

import com.bookstore.hibernatespringbootmanytomanysetandorderby.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringBootManyToManySetAndOrderByApplication {

    @Autowired
    private BookstoreService bookstoreService;

    public static void main(String[] args) {
        SpringApplication.run(HibernateSpringBootManyToManySetAndOrderByApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.fetchAuthorsOfBook();
        };
    }

}
