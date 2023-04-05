package com.project.restcrud.entity;
import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "Book")
public class Book {
    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "name_of_author")
    private String authorName;

    @Column(name = "publisher_of_book")
    private String publisher;

    @Column(name = "book_isbn")
    private String isbn;

    @Column(name = "book_release_date")
    private String publicationDate;

    @Column(name = "genre")
    private String genre;

    public Book(){

    }
    public Book(String bookName, String authorName,String publisher, String isbn, String publicationDate, String genre) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
