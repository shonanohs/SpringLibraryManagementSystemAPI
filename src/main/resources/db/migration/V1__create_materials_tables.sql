CREATE TABLE IF NOT EXISTS BOOK
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255),
    publisher VARCHAR(255),
    genre VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS FILM
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    lead_actor VARCHAR(255),
    director VARCHAR(255),
    screenwriter VARCHAR(255),
    release_date DATE,
    genre VARCHAR(255),
    rating VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS PERIODICAL
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    publication_date DATE
);

CREATE SEQUENCE book_seq
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999999
CYCLE;

CREATE SEQUENCE film_seq
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999999
CYCLE;

CREATE SEQUENCE periodical_seq
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999999
CYCLE;