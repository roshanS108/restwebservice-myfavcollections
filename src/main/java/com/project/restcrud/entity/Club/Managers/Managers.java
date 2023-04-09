package com.project.restcrud.entity.Club.Managers;

import jakarta.persistence.*;

//this entity represents all the managers they coached
@Entity
@Table(name = "Managers")
public class Managers {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "Year_managed")
    private int year_Managed;

    @Column(name = "title_won")
    private int numberOfTitleWon;

    public Managers(int id, String name, int age, String nationality, int year_Managed, int numberOfTitleWon) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.year_Managed = year_Managed;
        this.numberOfTitleWon = numberOfTitleWon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYear_Managed() {
        return year_Managed;
    }

    public void setYear_Managed(int year_Managed) {
        this.year_Managed = year_Managed;
    }

    public int getNumberOfTitleWon() {
        return numberOfTitleWon;
    }

    public void setNumberOfTitleWon(int numberOfTitleWon) {
        this.numberOfTitleWon = numberOfTitleWon;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", year_Managed=" + year_Managed +
                ", numberOfTitleWon=" + numberOfTitleWon +
                '}';
    }
}
