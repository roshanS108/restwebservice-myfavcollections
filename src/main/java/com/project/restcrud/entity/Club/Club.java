package com.project.restcrud.entity.Club;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "Club") //-->> might give you error in here for captailizing the first letter
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "club_name")
    private String clubName;

    @Column(name = "origin_date")
    private int originDate;

    @Column(name = "founder_of_club")
    private String founderOfClub;


    @Column(name = "location")
    private String location;

    public Club(){

    }
    public Club(String clubName, int originDate,
                   String founderOfClub,
                   String location) {
        this.clubName = clubName;
        this.originDate = originDate;
        this.founderOfClub = founderOfClub;

        this.location = location;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getOriginDate() {
        return originDate;
    }

    public void setOriginDate(int originDate) {
        this.originDate = originDate;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", clubName='" + clubName + '\'' +
                ", originDate=" + originDate +
                ", founderOfClub='" + founderOfClub + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getFounderOfClub() {
        return founderOfClub;
    }

    public void setFounderOfClub(String founderOfClub) {
        this.founderOfClub = founderOfClub;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
