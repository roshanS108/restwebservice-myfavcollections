package com.project.restcrud.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Soccer_Player")
public class SoccerPlayer {
    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private int age;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "current_club")
    private String current_Club;

    @Column(name = "position")
    private String position;

    @Column(name = "number_of_tile_won")
    private int numberOfTitleOwn;

    public SoccerPlayer(){

    }
    public SoccerPlayer(int id, String fullName,String current_Club,String position,
                           int numberOfTitleOwn) {
        this.id = id;
        this.fullName = fullName;
        this.current_Club = current_Club;
        this.position = position;
        this.numberOfTitleOwn = numberOfTitleOwn;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCurrent_Club() {
        return current_Club;
    }

    public void setCurrent_Club(String current_Club) {
        this.current_Club = current_Club;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getNumberOfTitleOwn() {
        return numberOfTitleOwn;
    }
    public void setNumberOfTitleOwn(int numberOfTitleOwn) {
        this.numberOfTitleOwn = numberOfTitleOwn;
    }

    @Override
    public String toString() {
        return "favSoccerPlayer{" +
                "id=" + id +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                ", current_Club='" + current_Club + '\'' +
                ", position='" + position + '\'' +
                ", numberOfTitleOwn=" + numberOfTitleOwn +
                '}';
    }
}
