package com.project.restcrud.entity.Club.Players;

import jakarta.persistence.*;

@Entity
@Table(name = "ballon_dor_honors")//------>might need to watch out with error on this capital things.
 public class Ballon_dor_winner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private String age;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "goals_that_season")
    private int goalsThatSeason;

    @Column(name = "assists_that_season")
    private int assistsThatSeason;

    @Column(name = "years")
    private int years;

    @Column(name = "champion_league_win")
    private int championLeagueWin;

    @Column(name = "club", nullable = false)
    private int club;


}
