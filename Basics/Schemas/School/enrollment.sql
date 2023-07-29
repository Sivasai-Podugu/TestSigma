CREATE TABLE Enrollment (
                             id INT AUTO_INCREMENT PRIMARY KEY ,
                             student_id INT,
                             course_id INT,
                             enrollment_date DATE NOT NULL,
                             FOREIGN KEY (student_id) REFERENCES Student(id) ON DELETE CASCADE ON UPDATE CASCADE,
                             FOREIGN KEY (course_id) REFERENCES Course(id) ON DELETE CASCADE ON UPDATE CASCADE
);
