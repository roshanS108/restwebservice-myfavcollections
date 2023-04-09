
  USE `my_fav_collection`;

  CREATE TABLE `Champion_League_Winner` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `nationality` VARCHAR(50) NOT NULL,
  `age` INT DEFAULT NULL,
  `goals` INT DEFAULT NULL,
  `assists` INT DEFAULT NULL,
  `position_of_the_player` VARCHAR(45)DEFAULT NULL,
  `Champion_League_Win` INT DEFAULT NULL,

   FOREIGN KEY (`Champion_League_Win`) REFERENCES `honors`(`id`),
   PRIMARY KEY(`id`)

)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
