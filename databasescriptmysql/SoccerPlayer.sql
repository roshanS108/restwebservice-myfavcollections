 DROP DATABASE IF EXISTS `my_fav_collection`;
CREATE DATABASE `my_fav_collection`;
USE `my_fav_collection`;







CREATE TABLE IF NOT EXISTS `soccer_player`(

    `id` int not null auto_increment,
    `age` int default null,
    `full_name` varchar(45) default null,
    `current_club` varchar(45)default null,
    `position_of_the_player` varchar(45)default null,
    `numberOfTitleOwn` int default null,
    `name_of_tournament` varchar(233) default null,

     PRIMARY KEY(`id`)

  )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
