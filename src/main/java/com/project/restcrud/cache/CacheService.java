package com.project.restcrud.cache;

import com.project.restcrud.entity.Book.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService {


    private Map<Integer, Book> cache = new HashMap<>();


    public Book getBookId(int id){
        return cache.get(id);
    }
    public void putBook(int id, Book theBook){
        cache.put(id, theBook);
    }
    //checks if the book is already in the cache memory or not
    public boolean containsBookInCache(int id){
        return cache.containsKey(id);
    }


}
