package com.project.restcrud.jparepository;
import com.project.restcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyRepository extends JpaRepository<Book, Integer>{


    Book findByBookNameIgnoreCase(String name);
}
