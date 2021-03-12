CREATE SCHEMA db_schema

CREATE TABLE db_schema.user
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name)>=2),
    email VARCHAR(254) NOT NULL UNIQUE,
    phone VARCHAR(20)
);

CREATE TABLE db_schema.account_information
(
    user_id  BIGINT PRIMARY KEY REFERENCES db_schema.user(id) ON DELETE CASCADE,
    login  VARCHAR(200) NOT NULL UNIQUE,
    password VARCHAR(254) NOT NULL
);