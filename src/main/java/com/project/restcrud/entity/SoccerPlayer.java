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
    private String position_of_the_Player;

    @Column(name = "number_of_tile_won")
    private int numberOfTitleOwn;

    private String nameOfTournament;

    public SoccerPlayer(){

    }
    public SoccerPlayer(int id, String fullName,String current_Club,String position,
                           int numberOfTitleOwn, String nameOfTournament) {
        this.id = id;
        this.fullName = fullName;
        this.current_Club = current_Club;
        this.position_of_the_Player = position;
        this.numberOfTitleOwn = numberOfTitleOwn;
        this.nameOfTournament = nameOfTournament;
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
        return position_of_the_Player;
    }
    public void setPosition(String position) {
        this.position_of_the_Player = position;
    }
    public int getNumberOfTitleOwn() {
        return numberOfTitleOwn;
    }
    public void setNumberOfTitleOwn(int numberOfTitleOwn) {
        this.numberOfTitleOwn = numberOfTitleOwn;
    }
    public String getPosition_of_the_Player() {
        return position_of_the_Player;
    }

    public void setPosition_of_the_Player(String position_of_the_Player) {
        this.position_of_the_Player = position_of_the_Player;
    }
    public String getNameOfTournament() {
        return nameOfTournament;
    }

    public void setNameOfTournament(String nameOfTournament) {
        this.nameOfTournament = nameOfTournament;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "id=" + id +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                ", current_Club='" + current_Club + '\'' +
                ", position_of_the_Player='" + position_of_the_Player + '\'' +
                ", numberOfTitleOwn=" + numberOfTitleOwn +
                ", nameOfTournament='" + nameOfTournament + '\'' +
                '}';
    }
}
