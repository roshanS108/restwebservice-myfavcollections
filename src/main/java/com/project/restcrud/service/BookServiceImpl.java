package com.project.restcrud.service;
import com.project.restcrud.entity.Book.Book;
import com.project.restcrud.jparepository.MyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private MyRepository bookService;

    @Autowired
    public BookServiceImpl(MyRepository bookService){
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

    @Override
    public Book findByName(String name) {
        Optional<Book> theResult = Optional.ofNullable(bookService.findByBookNameIgnoreCase(name));
//        Book theResult = bookService.findByName(name);

        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }
    @Override
    public Book findByBookAuthor(String authorName) {

        Optional<Book> theResult = Optional.ofNullable(bookService.findBookByAuthorNameIgnoreCase(authorName));
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }
    @Override
    public Book findBookByIsbn(String bookIsbn) {
        Optional<Book> theResult = Optional.ofNullable(bookService.findBookByISBNIgnoreCase(bookIsbn));
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }

    @Override
    public Book findBookByGenre(String genre) {
        Optional<Book> theResult = Optional.ofNullable(bookService.findBookByISBNIgnoreCase(genre));
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }
}
