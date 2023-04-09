USE `my_fav_collection`;
create table Ballon_Dor_Honors(

  `id` INT NOT NULL AUTO_INCREMENT,
  `age` INT DEFAULT NULL,
  `name` VARCHAR(100) NOT NULL,
  `nationality` VARCHAR(50) NOT NULL,
  `club` VARCHAR(100) DEFAULT NULL,
  `goals_that_season` INT DEFAULT NULL,
  `assists_that_season` INT DEFAULT NULL,
  `trophies_that_season` INT DEFAULT NULL,
  `year` INT DEFAULT NULL,
  `Champion_League_Win` INT DEFAULT NULL,

  FOREIGN KEY (`Champion_League_Win`) REFERENCES `honors` (`id`),

  PRIMARY KEY (`id`)

)
