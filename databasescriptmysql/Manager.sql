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
