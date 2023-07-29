CREATE TABLE Assignment (
                             id INT AUTO_INCREMENT PRIMARY KEY ,
                             course_id INT,
                             name VARCHAR(100) NOT NULL,
                             description VARCHAR(200),
                             deadline DATE,
                             max_score DECIMAL(5, 2),
                             FOREIGN KEY (course_id) REFERENCES Course(id) ON DELETE CASCADE ON UPDATE CASCADE
);