package com.project.restcrud.service;

import com.project.restcrud.entity.Book;
import com.project.restcrud.jparepository.MyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private MyRepository<Book> bookService;

    @Autowired
    public BookServiceImpl(MyRepository<Book> bookService){
        this.bookService = bookService;
    }

    @Override
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @Override
    public Book findById(int theID) {
        Optional<Book>theResult = bookService.findById(theID);

        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }

    @Transactional
    @Override
    public Book saveBook(Book theBook) {
        return bookService.save(theBook);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        bookService.deleteById(theId);
    }
}
