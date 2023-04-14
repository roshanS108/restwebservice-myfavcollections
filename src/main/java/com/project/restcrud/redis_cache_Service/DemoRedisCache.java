package com.project.restcrud.redis_cache_Service;

import com.project.restcrud.entity.Book.Book;

import java.util.List;

//this interface was made just to do some testing in redis cache
public interface DemoRedisCache {

    List<Book> fetchAllBooks();

    Book getSpecificBook(Integer id);

    Book findByName(String name);

    boolean checkIfBooksIsInCache(int id);
}
