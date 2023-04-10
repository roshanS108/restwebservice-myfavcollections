package com.project.restcrud.entity.Club.Awards;
import com.project.restcrud.entity.Club.Club;
import jakarta.persistence.*;

//this class is for the player who won the champion league.
@Entity
@Table(name = "champion_league_winner")
public class Champion_League_Winner{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "age")
    private int age;

    @Column(name = "goals")
    private int goals;

    @Column(name = "assists")
    private int assists;

    @Column(name = "position_of_the_player")
    private String position;

    @ManyToOne
    @JoinColumn(name = "Champion_League_Win", nullable = false)
    private Honors_Of_Club honors;

    @ManyToOne
    @JoinColumn(name = "club_that_time", nullable = false)
    private Club club;

    public Champion_League_Winner(String name, String nationality, int age, int goals, int assists, String position) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.goals = goals;
        this.assists = assists;
        this.position = position;
    }
    public Honors_Of_Club getHonors() {
        return honors;
    }

    public void setHonors(Honors_Of_Club honors) {
        this.honors = honors;
    }

    public Club getClub() {
        return club;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Champion_League_Winner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", goals=" + goals +
                ", assists=" + assists +
                ", position='" + position + '\'' +
                ", honors=" + honors +
                ", club=" + club +
                '}';
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
