
  USE `my_fav_collection`;

  CREATE TABLE `Champion_League_Winner` (
   `id` int NOT NULL AUTO_INCREMENT,
   `name` varchar(100) NOT NULL,
   `nationality` varchar(50) NOT NULL,
   `age` int DEFAULT NULL,
   `goals` int DEFAULT NULL,
   `assists` int DEFAULT NULL,
   `position_of_the_player` varchar(45) DEFAULT NULL,
   `Champion_League_Win` int DEFAULT NULL,
   `club_that_time` int DEFAULT NULL,
   PRIMARY KEY (`id`),
   KEY `Champion_League_Win` (`Champion_League_Win`),
   KEY `fk_club_winnerr` (`club_that_time`),
   CONSTRAINT `champion_league_winner_ibfk_1` FOREIGN KEY (`Champion_League_Win`) REFERENCES `honors` (`id`),
   CONSTRAINT `fk_club_winnerr` FOREIGN KEY (`club_that_time`) REFERENCES `club` (`id`)

)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
