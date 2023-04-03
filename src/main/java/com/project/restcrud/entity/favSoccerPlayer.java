package com.project.restcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fav_soccer_player")
public class favSoccerPlayer {

    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private int age;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "current_club")
    private String current_Club;

    public favSoccerPlayer(){

    }
    public favSoccerPlayer(int id, String firstName, String lastName, String current_Club) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.current_Club = current_Club;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCurrent_Club() {
        return current_Club;
    }

    public void setCurrent_Club(String current_Club) {
        this.current_Club = current_Club;
    }

    @Override
    public String toString() {
        return "favSoccerPlayer{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", current_Club='" + current_Club + '\'' +
                '}';
    }
}
