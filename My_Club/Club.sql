



USE `my_fav_collection`;
CREATE TABLE IF NOT EXISTS  `club`(

   `id` int NOT NULL AUTO_INCREMENT,
   `club_name` varchar(45) DEFAULT NULL,
   `origin_date` varchar(45) DEFAULT NULL,
   `founder_of_club` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
