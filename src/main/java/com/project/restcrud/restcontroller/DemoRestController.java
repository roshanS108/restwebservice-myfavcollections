package com.project.restcrud.restcontroller;
import com.project.restcrud.entity.Book.Book;
import com.project.restcrud.redis_cache_Service.DemoRedisCache;
import com.project.restcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class DemoRestController {

    private BookService bookService;

    private DemoRedisCache redisCache;

    @Autowired
    public DemoRestController(BookService theBookService, DemoRedisCache redisCache){
        this.bookService = theBookService;
        this.redisCache = redisCache;
    }

    @PostMapping("/storingBooks")
    public ResponseEntity<String> saveBook(@RequestBody Book theBook){
        boolean isBookStored = redisCache.checkIfBooksIsInCache(theBook.getId());
        boolean result = bookService.saveTheBook(theBook);

        if (result) {
            if (isBookStored) {
                return ResponseEntity.badRequest().body("Book already exists in cache");
            } else {
                return ResponseEntity.ok("Book saved successfully!");
            }
        } else {
            System.out.println("LLOL");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/getBooksFromCache")
    public ResponseEntity<List<Book>> fetchAllBook(){
        List<Book> book;
        book = redisCache.fetchAllBooks();
        return ResponseEntity.ok(book);
    }

    @GetMapping("/getSpecificBook/{theId}")
    public ResponseEntity<Book> getSpecBook(@PathVariable int theId){

        //if the book is already in the cache return
        Book theBook;
        theBook = redisCache.getSpecificBook(theId);

        if(theBook == null)
            return ResponseEntity.notFound().build();

        else
        System.out.println("not null");
            return ResponseEntity.ok(theBook);
    }
}
