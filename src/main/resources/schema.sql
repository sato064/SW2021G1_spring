CREATE TABLE IF NOT EXISTS item (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255),
  price real,
  vendor varchar(255),
  PRIMARY KEY (id),
);
CREATE TABLE IF NOT EXISTS users (
  id varchar(20) NOT NULL,
  password varchar(255),
  PRIMARY KEY (id),
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8;
