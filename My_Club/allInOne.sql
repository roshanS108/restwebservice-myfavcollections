DROP DATABASE IF EXISTS `my_fav_collection`;
CREATE DATABASE `my_fav_collection`;
USE `my_fav_collection`;

CREATE TABLE `soccer_player`(

   `id` int not null auto_increment,
   `age` int default null,
   `full_name` varchar(45) default null,
   `current_club` varchar(45)default null,
   `position_of_the_player` varchar(45)default null,
   `numberOfTitleOwn` varchar(45)default null,
   `name_of_tournament` varchar(233) default null,
    PRIMARY KEY(`id`)

 )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS `club`(

`id`INT NOT NULL AUTO_INCREMENT,
  `club_name` VARCHAR(45)DEFAULT NULL,
  `origin_date`VARCHAR(45) DEFAULT NULL,
  `home_kit_color` VARCHAR(45) DEFAULT NULL,
  `away_kit_color` VARCHAR(45) DEFAULT NULL,
  `founder_of_club` VARCHAR(45) DEFAULT NULL,
  `current_Manager` VARCHAR (45) DEFAULT NULL,
  `Captain` VARCHAR(45) DEFAULT NULL,
  `honors_id` VARCHAR(45) DEFAULT NULL, 
  `manager_id` VARCHAR(45) DEFAULT NULL, 
  `player_id` VARCHAR(45) DEFAULT NULL, 
  FOREIGN KEY (`honors_id`) REFERENCES `honors` (`id`),
 FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`),
 FOREIGN KEY (`player_id`) REFERENCES `players` (`id`),
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE IF NOT EXISTS Honors (
    id INT NOT NULL AUTO_INCREMENT,
    name_of_tournament VARCHAR(45) NOT NULL,
    times_won INT NOT NULL,
    year INT NOT NULL,
     manager_id INT,
    PRIMARY KEY (id),
    CONSTRAINT `FK_DETAIL` FOREIGN KEY (`manager_id`)
    REFERENCES `Manager`(`id`)
    -- FOREIGN KEY (`club_id`) REFERENCES `club` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

USE my_fav_collection;

CREATE TABLE IF NOT EXISTS `manager` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(45) DEFAULT NULL,
    `age` int DEFAULT NULL,
    `nationality` varchar(45) DEFAULT NULL,
    `Year_managed` int DEFAULT NULL,
    `title_won` int DEFAULT NULL,
    PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


