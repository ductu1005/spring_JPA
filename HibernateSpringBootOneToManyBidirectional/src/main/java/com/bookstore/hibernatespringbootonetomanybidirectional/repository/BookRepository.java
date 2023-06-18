package com.bookstore.hibernatespringbootonetomanybidirectional.repository;

import com.bookstore.hibernatespringbootonetomanybidirectional.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}