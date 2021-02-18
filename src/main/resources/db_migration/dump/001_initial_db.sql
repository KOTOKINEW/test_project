CREATE DATABASE docker_db;

GO

CREATE SCHEMA public AUTHORIZATION docker_db_user

CREATE TABLE user
(
    id BIGINT,
    name CHARACTER VARYING(200),
    email CHARACTER VARYING(254),
    phone CHARACTER VARYING(20)
);

CREATE TABLE account_information
(
    id BIGINT,
    login  CHARACTER VARYING(200),
    password CHARACTER VARYING(254)
);