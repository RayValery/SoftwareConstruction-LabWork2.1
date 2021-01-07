DROP SCHEMA IF EXISTS laboratory_works CASCADE;

CREATE SCHEMA laboratory_works;

CREATE TABLE IF NOT EXISTS laboratory_works.teacher
(
    teacher_id BIGSERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR(50)           NOT NULL,
    last_name  VARCHAR(50)           NOT NULL,
    post       VARCHAR(50)           NOT NULL,
    tel        BIGINT
);