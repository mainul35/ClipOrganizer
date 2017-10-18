DROP TABLE if EXISTS `user`;
CREATE TABLE `user`(
  `uuid` VARCHAR (50),
  `name` VARCHAR (100),
  `email` VARCHAR (100),
  `username` VARCHAR (100),
  `password` VARCHAR (100),
  `active` VARCHAR (5)
);

INSERT INTO user(`uuid`, `name`, `email`, `password`, `username`, `active`) VALUES ('af166869-1cdd-4c03-8fbb-d253237d5d92', 'Admin', 'admin@gmail.com', '12345', 'admin', '1');

DROP TABLE if EXISTS `user_role`;
CREATE TABLE if NOT EXISTS `user_role`(
  `username` VARCHAR (100),
  `role` VARCHAR (20)
);

INSERT  INTO user_role(`username`, `role`) VALUES ('admin', 'ROLE_ADMIN');