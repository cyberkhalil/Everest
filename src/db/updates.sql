CREATE TABLE IF NOT EXISTS version (
    version DOUBLE NOT NULL
);
DELETE from version;
INSERT INTO version values(1.4);