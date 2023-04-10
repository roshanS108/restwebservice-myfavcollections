USE my_fav_collection;

CREATE TABLE IF NOT EXISTS `manager` (
  `id` int NOT NULL AUTO_INCREMENT,
   `name` varchar(45) DEFAULT NULL,
   `age` int DEFAULT NULL,
   `nationality` varchar(45) DEFAULT NULL,
   `Years_Managed` varchar(45) NOT NULL,
   `title_won` int DEFAULT NULL,
   `CL_Manager_Win` int DEFAULT NULL,
   PRIMARY KEY (`id`),
   KEY `fk_manager_win` (`CL_Manager_Win`),
   CONSTRAINT `fk_manager_win` FOREIGN KEY (`CL_Manager_Win`) REFERENCES `honors` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
