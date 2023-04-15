package com.project.restcrud.restcontroller;
import com.project.restcrud.entity.Book.Book;
import com.project.restcrud.redis_cache_Service.DemoRedisCache;
import com.project.restcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookRestController {
    private BookService bookService;

    private DemoRedisCache redisCache;

    @Autowired
    public BookRestController(BookService theBookService, DemoRedisCache demoRedisCache){
        this.bookService = theBookService;
        this.redisCache = demoRedisCache;
    }
    //creating a new end point and exposing a list of Book from database
    @GetMapping("/favoriteBooks")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    //find books by ID
    @GetMapping("/favoriteBooks/{bookId}")
    public Book getBooks(@PathVariable int bookId){

        Book theBook = bookService.findById(bookId);
        if (theBook == null){
            throw new RuntimeException("Book id not found - " + bookId);
        }
        return theBook;
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
    /**
     * Fetch all the book from the redis cache instead of going to the database or api
     * @param theBook
     * @return
     */
    @GetMapping("/fetchAllBooks")
    public ResponseEntity<List<Book>> fetchAllBook(@RequestBody Book theBook){
        List<Book> bookList;
        bookList = redisCache.fetchAllBooks();
        return ResponseEntity.ok(bookList);
    }

    //adding new book to the database
    @PostMapping("/favoriteBooks")
    public Book addBook(@RequestBody Book theBook){
        theBook.setId(0);
        Book tempBook = bookService.saveBook(theBook);
        System.out.println("This book is saved to the database: " + theBook.getBookName());
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

    // Adds search functionality to the API, allowing users to search for specific data based on provided search parameters.
//    @GetMapping("/getBookList/search/name/{bookName}")
    public Book theBook(@PathVariable String bookName){
        System.out.println("INCOMING NAME : " + bookName);

        Book theBook = bookService.findByName(bookName);
        if(theBook == null){
            throw new RuntimeException("Book name not found - " + bookName);
        }
        return theBook;
    }
    //making search functionality /search/name and storing the book name in the redis cache memory
    @GetMapping("/getBookList/search/name/{bookName}")
//    @Cacheable(value = "bookCache")
    public ResponseEntity<Book> searchBookByName(@PathVariable String bookName) {
        Book theBooks = null;
        Optional<Book> theResult = Optional.ofNullable(bookService.findByName(bookName));
        theBooks = bookService.findByName(bookName);
        System.out.println(theBooks);

        //if the data is already in the  cache immediately return it
        if (redisCache.checkIfBooksIsInCache(theBooks.getId())) {
            System.out.println("Yes the book is in cache");
            return ResponseEntity.ok(theBooks);
        }
        // if the data is not there then get it from the database and store that data into cache.
        if (theResult.isPresent()){
            theBooks = theResult.get();
            System.out.println();
            bookService.saveTheBookInCache(theBooks);
        }
            return ResponseEntity.ok(theBooks);
    }
    //adding search author name functionality for different param to get same data
    @GetMapping("/getBookList/search/author/{authorName}")
    public Book searchBookByAuthor(@PathVariable String authorName){
        System.out.println("INCOMING AUTHOR NAME : " + authorName);
        Book theBook = bookService.findByBookAuthor(authorName);
        if(theBook == null){
            throw new RuntimeException("This Book author name not found - " + authorName);
        }
        System.out.println("The author name is: " + authorName);
        return theBook;
    }
    //adding search isbn functionality for different param to get same data
    @GetMapping("/getBookList/search/isbn/{isbn}")
    public Book searchBookByAISBN(@PathVariable String isbn){
        Book theBook = bookService.findBookByIsbn(isbn);
        if(theBook == null){
            throw new RuntimeException("This Book isbn not found - " + isbn);
        }
        return theBook;
    }
    //adding search genre functionality for different param to get same data
    @GetMapping("/getBookList/search/genre/{genre}")
    public Book searchBookByGenre(@PathVariable String genre){
        Book theBook = bookService.findBookByGenre(genre);
        if(theBook == null){
            throw new RuntimeException("This Book with this genre not found - " + genre);
        }
        return theBook;
    }




}
