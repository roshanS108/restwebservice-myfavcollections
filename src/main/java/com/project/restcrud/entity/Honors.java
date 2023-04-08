package com.project.restcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Honors_Of_Club")
public class Honors {

    private String nameOfTournament;

    private int timesWon;

    public Honors(String nameOfTournament, int timesWon){
        this.nameOfTournament = nameOfTournament;
        this.timesWon = timesWon;
    }

    public String getNameOfTournament() {
        return nameOfTournament;
    }

    public void setNameOfTournament(String nameOfTournament) {
        this.nameOfTournament = nameOfTournament;
    }

    public int getTimesWon() {
        return timesWon;
    }

    public void setTimesWon(int timesWon) {
        this.timesWon = timesWon;
    }
}
