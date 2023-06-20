package com.bookstore.hibernatespringbootfilterassociation.repository;

import com.bookstore.hibernatespringbootfilterassociation.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}