CREATE DATABASE exam;
USE exam;

CREATE TABLE countries(
    id              INT AUTO_INCREMENT NOT NULL,
    name            VARCHAR(50) NOT NULL,
    capital         VARCHAR(50) NOT NULL,
    population      INT NOT NULL,
    id_language     INT NOT NULL,

    CONSTRAINT pk_countries PRIMARY KEY(id)      
);

CREATE TABLE languages(
    id            INT AUTO_INCREMENT NOT NULL,
    id_language   INT NOT NULL,
    name          VARCHAR(55) NOT NULL,

    CONSTRAINT pk_languages PRIMARY KEY (id),
	CONSTRAINT fk_id_language FOREIGN KEY (id_language) 
		REFERENCES countries (id)
);

/*RECORDS INSERTION -> COUNTRIES*/
INSERT INTO countries VALUES(
    NULL,
    "Brasil",
    "Sao Paulo",
    1572001500,
    1
);
INSERT INTO countries VALUES(
    NULL,
    "Argentina",
    "Buenos Aires",
    147236500,
    2
);

INSERT INTO countries VALUES(
    NULL,
    "Mexico",
    "Ciudad de Mexico",
    158122354,
    2
);

/*RECORDS INSERTION -> LANGUAGES*/

INSERT INTO languages VALUES(
    NULL,
    1,
    "Portugues"
);
INSERT INTO languages VALUES(
    NULL,
    2,
    "Español"
);

INSERT INTO languages VALUES(
    NULL,
    2,
    "Español"
);

/*QUERIES*/

UPDATE countries SET population = 250000 WHERE id = 1;
/*DELETEION WHITOUT COMPLET

DELETE FROM countries
WHERE population > 10000;*/

SELECT countries.name, capital, languages.name AS "language" FROM countries 
INNER JOIN languages ON languages.id_language = countries.id_language;

SELECT countries.name, capital, languages.name AS "language" FROM countries 
INNER JOIN languages ON languages.id_language = countries.id_language GROUP BY language ;
