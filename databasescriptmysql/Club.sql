



USE `my_fav_collection`;
CREATE TABLE IF NOT EXISTS  `club`(

  `id`INT NOT NULL AUTO_INCREMENT,
  `club_name` VARCHAR(45)DEFAULT NULL,
  `origin_date`VARCHAR(45) DEFAULT NULL,

  `founder_of_club` VARCHAR(45) DEFAULT NULL,


   `honors_id` int DEFAULT NULL,
   `legend_players_id` int default null,
   `legend_manager_id` int default null,

  FOREIGN KEY (`honors_id`) REFERENCES `honors` (`id`),
   FOREIGN KEY (`legend_players_id`) REFERENCES `soccer_player` (`id`),
 FOREIGN KEY (`legend_manager_id`) REFERENCES `manager` (`id`),
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
