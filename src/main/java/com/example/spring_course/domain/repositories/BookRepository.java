package com.example.spring_course.domain.repositories;

import com.example.spring_course.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
