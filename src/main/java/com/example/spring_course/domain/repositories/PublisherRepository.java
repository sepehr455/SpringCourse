package com.example.spring_course.domain.repositories;

import com.example.spring_course.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
