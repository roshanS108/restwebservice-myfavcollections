package com.project.restcrud.entity.Club.Awards;

import com.project.restcrud.entity.FavClub;
import jakarta.persistence.*;

@Entity
@Table(name = "champion_league_winner")
public class Champion_League_Winner{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "age")
    private Integer age;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "position_of_the_player")
    private String position;

    @ManyToOne
    @JoinColumn(name = "club_that_time", nullable = false)
    private FavClub club;

    @ManyToOne
    @JoinColumn(name = "Champion_League_Win", nullable = false)
    private Honors_Of_Club honors;
}
