package com.project.restcrud.service;

import com.project.restcrud.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Book findById(int theID);

    Book saveBook(Book theBook);

    void deleteById(int theId);

}
