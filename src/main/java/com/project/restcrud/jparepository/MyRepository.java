package com.project.restcrud.jparepository;
import com.project.restcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MyRepository extends JpaRepository<Book, Integer>{

    Book findByBookNameIgnoreCase(String name);

    Book findBookByAuthorNameIgnoreCase(String name);

    Book findBookByISBNIgnoreCase(String isbn);

    Book findBookBygenreIgnoreCase(String isbn);


}
