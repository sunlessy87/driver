DROP TABLE IF EXISTS drivers;

CREATE TABLE drivers(
                        driver_id INT PRIMARY KEY,
                        first_name varchar(100) NOT NULL,
                        last_name varchar(100) NOT NULL
);

DROP TABLE IF EXISTS cars;

CREATE TABLE cars(
                        car_id INT PRIMARY KEY,
                        model varchar(100) NOT NULL,
                        number varchar(100) NOT NULL,
                        driver_id INT DEFAULT NULL
);