package com.project.restcrud.service;
import com.project.restcrud.cache.CacheService;
import com.project.restcrud.entity.Book.Book;
import com.project.restcrud.jparepository.MyRepository;
import com.project.restcrud.redis_cache_Service.DemoRedisCache;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl implements BookService, DemoRedisCache {
    private MyRepository myRepository;

    //Normal --> Cache without redis
    private CacheService cacheService;

    private RedisTemplate redisTemplate;

    private static final String KEY = "USER";
    @Autowired
    public BookServiceImpl(MyRepository bookService, RedisTemplate redisTemplate){
        this.myRepository = bookService;
        this.redisTemplate = redisTemplate;
    }
    //getting all the books from the database ---> Not using any redis cache to store the book
    @Override
    public List<Book> findAll() {
        return myRepository.findAll();
    }
    @Override
    @Cacheable(value = "finding book by ID")
    public Book findById(int theID) {
        //if the data is already in the cache memory just return that whatever in the cache memory
        if(cacheService.containsBookInCache(theID)){
            System.out.println("the data is already in cache");
            return cacheService.getBook(theID);
        }
        Optional<Book>theResult = myRepository.findById(theID);
        Book theBook = null;
        //if the data is not  in the cache memory add that data into cache memory.
        if(theResult.isPresent()){
            theBook = theResult.get();
            System.out.println("This method is being called");
            cacheService.putBook(theID,theBook);
            /*Book theBook2 = cacheService.getBook(theID);
            System.out.println("the book name: " + theBook2.getBookName());*/
        }
        return theBook;
    }
    @Transactional
    @Override
    public Book saveBook(Book theBook) {
       /* try{
            redisTemplate.opsForHash().put(KEY, theBook.getId(), theBook);

        }catch(Exception e){
            e.printStackTrace();
        }*/

        return myRepository.save(theBook);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        myRepository.deleteById(theId);
    }
    @Override
    public Book findByName(String name) {
        Optional<Book> theResult = Optional.ofNullable(myRepository.findByBookNameIgnoreCase(name));
//        Book theResult = bookService.findByName(name);
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }
    @Override
    public Book findByBookAuthor(String authorName) {

        Optional<Book> theResult = Optional.ofNullable(myRepository.findBookByAuthorNameIgnoreCase(authorName));
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }
    @Override
    public Book findBookByIsbn(String bookIsbn) {
        Optional<Book> theResult = Optional.ofNullable(myRepository.findBookByISBNIgnoreCase(bookIsbn));
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }
    @Override
    public Book findBookByGenre(String genre) {
        Optional<Book> theResult = Optional.ofNullable(myRepository.findBookByGenreIgnoreCaseLike(genre));
        Book theBook = null;
        if(theResult.isPresent()){
            theBook = theResult.get();
        }
        return theBook;
    }

    //demo-rest-controller
    @Override
    public boolean saveTheBook(Book theBook) {
        try{
            redisTemplate.opsForHash().put(KEY, theBook.getId(), theBook);
            return true;

        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    /*method from interface --> Demo Redis Cache
    * it fetch all the books from the redis cache
    *
    * */
    @Override
    public List<Book> fetchAllBooks() {
        List<Book> theBook;
        theBook = redisTemplate.opsForHash().values(KEY);
        return theBook;
    }

    @Override
    public Book getSpecificBook(Integer id) {
      Book theBook;
      theBook = (Book)redisTemplate.opsForHash().get(KEY, id.toString());
      return theBook;
    }

    @Override
    public boolean checkIfBooksIsInCache(Integer id) {
        return redisTemplate.opsForHash().hasKey(KEY, id.toString());
    }


}
