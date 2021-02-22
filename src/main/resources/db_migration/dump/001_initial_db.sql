CREATE SCHEMA db_schema

CREATE TABLE db_schema.user
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    email VARCHAR(254) NOT NULL,
    phone VARCHAR(20) NOT NULL
);

CREATE TABLE db_schema.account_information
(
    user_id  BIGINT PRIMARY KEY REFERENCES db_schema.user(id),
    login  VARCHAR(200) NOT NULL,
    password VARCHAR(254) NOT NULL
);