USE `my_fav_collection`;
create table Ballon_Dor_Honors(

   `id` int NOT NULL AUTO_INCREMENT,
    `age` int DEFAULT NULL,
    `name` varchar(100) NOT NULL,
    `nationality` varchar(50) NOT NULL,
    `goals_that_season` int DEFAULT NULL,
    `assists_that_season` int DEFAULT NULL,
    `years` int DEFAULT NULL,
    `champion_league_win` int DEFAULT NULL,
    `club` int NOT NULL,
    PRIMARY KEY (`id`),
    KEY `fk_soccer_player_honorss` (`champion_league_win`),
    KEY `fk_club_player_balldor` (`club`),
    CONSTRAINT `fk_club_player_balldor` FOREIGN KEY (`club`) REFERENCES `club` (`id`),
    CONSTRAINT `fk_soccer_player_honorss` FOREIGN KEY (`champion_league_win`) REFERENCES `honors` (`id`)



  PRIMARY KEY (`id`)

)
