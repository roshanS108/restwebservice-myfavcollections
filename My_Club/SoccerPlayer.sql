
USE `my_fav_collection`;

CREATE TABLE IF NOT EXISTS `soccer_player`(

    `id` int not null auto_increment,
    `age` int default null,
    `full_name` varchar(45) default null,
    `current_club` varchar(45)default null,
    `position_of_the_player` varchar(45)default null,
    `numberOfChampionLeague` int default null,
    `number_of_goals` INT default null,
    `number_of_assist` INT DEFAULT NULL,

    `Champion_League_Win` INT DEFAULT NULL,

    FOREIGN KEY (`Champion_League_Win`) REFERENCES `honors`(`id`),
     PRIMARY KEY(`id`)

  )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
