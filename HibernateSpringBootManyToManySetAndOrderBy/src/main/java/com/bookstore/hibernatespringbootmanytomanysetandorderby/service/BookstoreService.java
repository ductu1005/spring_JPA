package com.bookstore.hibernatespringbootmanytomanysetandorderby.service;

import com.bookstore.hibernatespringbootmanytomanysetandorderby.entity.Author;
import com.bookstore.hibernatespringbootmanytomanysetandorderby.entity.Book;
import com.bookstore.hibernatespringbootmanytomanysetandorderby.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Set;

@Service
public class BookstoreService {

    private final BookRepository bookRepository;

    public BookstoreService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @Transactional
    public void fetchAuthorsOfBook() {
        Book book = bookRepository.findById(1L).orElseThrow(null);
        Set<Author> authorsSet = book.getAuthors();

        System.out.println("Authors ordered descending by name:\n" + authorsSet + "\n");
    }
}