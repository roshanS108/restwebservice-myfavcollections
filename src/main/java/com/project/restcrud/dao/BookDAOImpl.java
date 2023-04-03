package com.project.restcrud.dao;

import com.project.restcrud.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{

    //defining fields for entity manager
    private EntityManager entityManager;

    //inject the entity manager in the constructor
    @Autowired
    public BookDAOImpl(EntityManager theEntityManager){
        this.entityManager = theEntityManager;
    }
    @Override
    public List<Book> findAll() {
        //creating a query for book from database
        TypedQuery<Book> theQuery = entityManager.createQuery("from Book", Book.class);

        //executing query from database
        List<Book>theBook = theQuery.getResultList();

        return theBook;
    }
}
