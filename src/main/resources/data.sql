create sequence user_seq;

CREATE TABLE user (
    id IDENTITY PRIMARY KEY,
    role VARCHAR(255),
    name VARCHAR(255),
    surname VARCHAR(255),
    join_date DATE,
    status BIT
);


--CREATE TABLE tutorials_tbl (
--   id INT NOT NULL,
--   title VARCHAR(50) NOT NULL,
--   author VARCHAR(20) NOT NULL,
--   submission_date DATE
--);