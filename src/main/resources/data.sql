DROP TABLE IF EXISTS words;

CREATE TABLE words (
            id INT AUTO_INCREMENT  PRIMARY KEY,
            source_word VARCHAR(250) NOT NULL,
            translation VARCHAR(250) NOT NULL);

INSERT INTO words (source_word, translation) VALUES
('стол', 'table'),
('стул', 'chair')