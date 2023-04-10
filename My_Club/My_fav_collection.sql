CREATE DATABASE `My_fav_collection`;
USE `My_fav_collection`;

CREATE TABLE `players` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(45) DEFAULT NULL,
  `current_club` VARCHAR(45) DEFAULT NULL,
  `position_of_the_player` VARCHAR(45) DEFAULT NULL,
  `numberOfTitleOwn` VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
