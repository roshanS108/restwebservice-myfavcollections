


DROP DATABASE IF EXISTS `my_fav_collection`;
CREATE DATABASE `my_fav_collection`;
USE `my_fav_collection`;



CREATE TABLE `club`(

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
