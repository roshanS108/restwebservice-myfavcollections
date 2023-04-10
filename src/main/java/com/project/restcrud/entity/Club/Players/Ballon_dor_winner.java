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

    //club where he won the ballon dor....
    @Column(name = "club", nullable = false)
    private int club;

   public Ballon_dor_winner(String age, String name, String nationality, int goalsThatSeason,
                            int assistsThatSeason, int years, int championLeagueWin, int club) {

      this.age = age;
      this.name = name;
      this.nationality = nationality;
      this.goalsThatSeason = goalsThatSeason;
      this.assistsThatSeason = assistsThatSeason;
      this.years = years;
      this.championLeagueWin = championLeagueWin;
      this.club = club;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getAge() {
      return age;
   }

   public void setAge(String age) {
      this.age = age;
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

   public int getGoalsThatSeason() {
      return goalsThatSeason;
   }

   public void setGoalsThatSeason(int goalsThatSeason) {
      this.goalsThatSeason = goalsThatSeason;
   }

   public int getAssistsThatSeason() {
      return assistsThatSeason;
   }

   public void setAssistsThatSeason(int assistsThatSeason) {
      this.assistsThatSeason = assistsThatSeason;
   }

   public int getYears() {
      return years;
   }

   public void setYears(int years) {
      this.years = years;
   }

   public int getChampionLeagueWin() {
      return championLeagueWin;
   }

   public void setChampionLeagueWin(int championLeagueWin) {
      this.championLeagueWin = championLeagueWin;
   }

   public int getClub() {
      return club;
   }

   public void setClub(int club) {
      this.club = club;
   }
}
