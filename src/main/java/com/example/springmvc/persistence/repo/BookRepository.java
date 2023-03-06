package com.example.springmvc.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.springmvc.persistence.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
