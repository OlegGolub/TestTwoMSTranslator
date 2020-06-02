DROP TABLE IF EXISTS words;

CREATE TABLE words (
            id INT AUTO_INCREMENT  PRIMARY KEY,
            sourceWord VARCHAR(250) NOT NULL,
            translation VARCHAR(250) NOT NULL);

INSERT INTO words (sourceWord, translation) VALUES
('стол', 'table'),
('стул', 'chair')