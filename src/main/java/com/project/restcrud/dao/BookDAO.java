package com.project.restcrud.dao;

import com.project.restcrud.entity.Book.Book;

import java.util.List;

public interface BookDAO {

    List<Book> findAll();
}
