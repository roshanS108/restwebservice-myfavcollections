package com.project.restcrud.entity;

import jakarta.persistence.*;

//this entity represents all the managers they coached
@Entity
@Table(name = "Managers")
public class Managers {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
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




}
