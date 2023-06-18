package com.bookstore.hibernatespringbootonetomanybidirectional.service;

import com.bookstore.hibernatespringbootonetomanybidirectional.entity.Author;
import com.bookstore.hibernatespringbootonetomanybidirectional.entity.Book;
import com.bookstore.hibernatespringbootonetomanybidirectional.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreService {

    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {

        this.authorRepository = authorRepository;
    }

    public void insertAuthorWithBooks() {
        Author jn = new Author();
        jn.setName("Joana Nimar");
        jn.setAge(34);
        jn.setGenre("History");
        Book jn01 = new Book();
        jn01.setIsbn("001-JN");
        jn01.setTitle("A History of Ancient Prague");
        Book jn02 = new Book();
        jn02.setIsbn("002-JN");
        jn02.setTitle("A People's History");
        Book jn03 = new Book();
        jn03.setIsbn("003-JN");
        jn03.setTitle("World History");
        jn.addBook(jn01);
        jn.addBook(jn02);
        jn.addBook(jn03);
        authorRepository.save(jn);
    }

    @Transactional
    public void deleteBookOfAuthor() {

        Author author = authorRepository.fetchByName("Alicia Tom");
        Book book = author.getBooks().get(0);

        author.removeBook(book); // use removeBook() helper        
    }

    @Transactional
    public void deleteAllBooksOfAuthor() {
        Author author = authorRepository.fetchByName("Joana Nimar");
        author.removeBooks(); // use removeBooks() helper    
    }

}