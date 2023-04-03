package com.project.restcrud.restcontroller;

import com.project.restcrud.dao.BookDAO;
import com.project.restcrud.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {

    private BookDAO bookDAO;

    @Autowired
    public BookRestController(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    //creating a new end point and exposing a list of Book from database
    @GetMapping("/favoriteBooks")
    public List<Book> findAll(){
        return bookDAO.findAll();
    }




}
