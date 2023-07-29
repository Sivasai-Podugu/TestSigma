CREATE TABLE Grade (
                        id INT AUTO_INCREMENT PRIMARY KEY ,
                        enrollment_id INT,
                        assignment_id INT,
                        score DECIMAL(5, 2),
                        remarks VARCHAR(200),
                        FOREIGN KEY (enrollment_id) REFERENCES Enrollment(id) ON DELETE CASCADE ON UPDATE CASCADE,
                        FOREIGN KEY (assignment_id) REFERENCES Assignment(id) ON DELETE CASCADE ON UPDATE CASCADE
);
