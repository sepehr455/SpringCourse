package com.example.spring_course.domain.repositories;

import com.example.spring_course.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
