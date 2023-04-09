package com.project.restcrud.service;

import com.project.restcrud.entity.Book.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> findAll();

    Book findById(int theID);

    Book saveBook(Book theBook);

    void deleteById(int theId);

    Book findByName(String name);

    Book findByBookAuthor(String name);

    Book findBookByIsbn(String name);

    Book findBookByGenre(String isbn);


}
