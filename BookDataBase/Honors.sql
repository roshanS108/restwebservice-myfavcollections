USE my_fav_collection;

CREATE TABLE IF NOT EXISTS Honors (
    id INT NOT NULL AUTO_INCREMENT,
    name_of_tournament VARCHAR(45) NOT NULL,
    times_won INT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
