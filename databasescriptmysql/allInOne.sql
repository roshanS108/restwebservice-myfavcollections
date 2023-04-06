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
 PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
