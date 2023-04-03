package com.project.restcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class FavClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "club_name")
    private String clubName;

    @Column(name = "origin_date")
    private int originDate;

    @Column(name = "home_kit_color")
    private String homeKitColor;

    @Column(name = "awayKitColor")
    private String away_kit_color;
    public FavClub(){

    }
    public FavClub(String clubName, int originDate, String homeKitColor, String away_kit_color) {
        this.clubName = clubName;
        this.originDate = originDate;
        this.homeKitColor = homeKitColor;
        this.away_kit_color = away_kit_color;
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

    public String getHomeKitColor() {
        return homeKitColor;
    }

    public void setHomeKitColor(String homeKitColor) {
        this.homeKitColor = homeKitColor;
    }

    public String getAway_kit_color() {
        return away_kit_color;
    }

    public void setAway_kit_color(String away_kit_color) {
        this.away_kit_color = away_kit_color;
    }

    @Override
    public String toString() {
        return "FavClub{" +
                "id=" + id +
                ", clubName='" + clubName + '\'' +
                ", originDate=" + originDate +
                ", homeKitColor='" + homeKitColor + '\'' +
                ", away_kit_color='" + away_kit_color + '\'' +
                '}';
    }
}
