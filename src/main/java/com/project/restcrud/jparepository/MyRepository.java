package com.project.restcrud.jparepository;
import com.project.restcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MyRepository extends JpaRepository<Book, Integer>{

}
