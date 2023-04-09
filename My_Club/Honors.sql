USE my_fav_collection;

CREATE TABLE IF NOT EXISTS Honors (
 `id` int NOT NULL AUTO_INCREMENT,
   `name_of_tournament` varchar(45) DEFAULT NULL,
   `tournament_year` int NOT NULL,
   `club_that_won` int DEFAULT NULL,
   PRIMARY KEY (`id`),
   KEY `fk_club_id` (`club_that_won`),
   CONSTRAINT `fk_club_id` FOREIGN KEY (`club_that_won`) REFERENCES `club` (`id`)

    -- FOREIGN KEY (`club_id`) REFERENCES `club` (`id`)
    -- FOREIGN KEY (`club_id`) REFERENCES `club` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

