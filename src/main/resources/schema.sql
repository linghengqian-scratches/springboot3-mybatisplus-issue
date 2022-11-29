create table IF NOT EXISTS trademark_configs
(
    `id`       bigint NOT NULL AUTO_INCREMENT primary key,
    created_at datetime,
    updated_at datetime,
    `domain`   varchar(10),
    login_logo varchar(10)
);

INSERT INTO trademark_configs (created_at, updated_at, `domain`, login_logo)
VALUES ('2022-11-29 00:00:00', '2022-11-29 00:00:00', 'test', 'test');