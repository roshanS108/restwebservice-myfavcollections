package com.project.restcrud.entity;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "FavClub")
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

    @Column(name = "founder_of_club")
    private String founderOfClub;

    private List<Managers> allManagers;

    @Column(name = "current_Manager")
    private String currentManager;

    @Column(name = "location")
    private String location;

    @Column(name = "Captain")
    private String currentCaptain;

    private List<Honors> honorsList;

    public FavClub(){

    }
    public FavClub(String clubName, int originDate, String homeKitColor, String away_kit_color,
                   String founderOfClub, List<Managers> allManagers, String currentManager,
                   String location, String currentCaptain) {
        this.clubName = clubName;
        this.originDate = originDate;
        this.homeKitColor = homeKitColor;
        this.away_kit_color = away_kit_color;
        this.founderOfClub = founderOfClub;
        this.allManagers = allManagers;
        this.currentManager = currentManager;
        this.location = location;
        this.currentCaptain = currentCaptain;

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

    public String getFounderOfClub() {
        return founderOfClub;
    }

    public void setFounderOfClub(String founderOfClub) {
        this.founderOfClub = founderOfClub;
    }

    public List<Managers> getAllManagers() {
        return allManagers;
    }

    public void setAllManagers(List<Managers> allManagers) {
        this.allManagers = allManagers;
    }

    public String getCurrentManager() {
        return currentManager;
    }

    public void setCurrentManager(String currentManager) {
        this.currentManager = currentManager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrentCaptain() {
        return currentCaptain;
    }

    public void setCurrentCaptain(String currentCaptain) {
        this.currentCaptain = currentCaptain;
    }
}
