package com.bookstore.hibernatespringbootmanytomanybidirectional.repository;

import com.bookstore.hibernatespringbootmanytomanybidirectional.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}