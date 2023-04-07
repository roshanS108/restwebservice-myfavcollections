USE my_fav_collection;

CREATE TABLE IF NOT EXISTS book(
id_book INT NOT NULL AUTO_INCREMENT,
book_name VARCHAR(255) NOT NULL,
name_of_author VARCHAR(255) NOT NULL,
publisher_of_book VARCHAR(255) NOT NULL,
book_isbn VARCHAR(255) NOT NULL,
book_release_date DATE NOT NULL,
genre VARCHAR(255) NOT NULL,
PRIMARY KEY (id_book)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
