package com.bookstore.hibernatespringbootonetomanybidirectional;

import com.bookstore.hibernatespringbootonetomanybidirectional.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringBootOneToManyBidirectional {

	private final BookstoreService bookstoreService;

	public HibernateSpringBootOneToManyBidirectional(BookstoreService bookstoreService) {
		this.bookstoreService = bookstoreService;
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringBootOneToManyBidirectional.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			System.out.println("\nInsert author with books  ...");
			bookstoreService.insertAuthorWithBooks();

//			System.out.println("\nDelete a book of an author...");
//			bookstoreService.deleteBookOfAuthor();
//
//			System.out.println("\nDelete all book of an author...");
//			bookstoreService.deleteAllBooksOfAuthor();
		};
	}
}