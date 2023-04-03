package com.project.restcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "video_games")
public class VideoGames {
    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_of_game")
    private String nameOfGame;

    @Column(name = "release_date")
    private int releaseDate;
    public VideoGames(){

    }
    public VideoGames(String nameOfGame, int releaseDate) {
        this.nameOfGame = nameOfGame;
        this.releaseDate = releaseDate;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "VideoGames{" +
                "id=" + id +
                ", nameOfGame='" + nameOfGame + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
