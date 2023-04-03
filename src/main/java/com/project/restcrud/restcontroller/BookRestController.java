package com.project.restcrud.restcontroller;
import com.project.restcrud.entity.Book;
import com.project.restcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookRestController {

    private  BookService bookService;
    @Autowired
    public BookRestController(BookService theBookService){
        this.bookService = theBookService;
    }
    //creating a new end point and exposing a list of Book from database
    @GetMapping("/favoriteBooks")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/favoriteBooks/{bookId}")
    public Book getBooks(@PathVariable int bookId){

        Book theBook = bookService.findById(bookId);
        if (theBook == null){
            throw new RuntimeException("Employee id not found - " + bookId);
        }
        return theBook;
    }
    //add new book to the database
    @PostMapping("/favoriteBooks")
    public Book addBook(@RequestBody Book theBook){
        theBook.setId(0);
        Book tempBook = bookService.saveBook(theBook);
        return tempBook;
    }
    //adding a map for updating /books -->put mapping
    @PutMapping("/favoriteBooks")
    public Book updateBook(@RequestBody Book theBook){
        Book tempBook = bookService.saveBook(theBook);
        return tempBook;
    }

    // adding a delete mapping to delete book from database
    @DeleteMapping("/favoriteBooks/{bookId}")
    public String deleteBook(@PathVariable int bookId){

        Book theBook = bookService.findById(bookId);
        //throw exception if the book variable is null;
        if(theBook == null){
            throw new RuntimeException("Book id not found - " + bookId);
        }else{
            bookService.deleteById(bookId);
        }
        return "Deleted book id is: " + bookId;

    }






}
