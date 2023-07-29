CREATE TABLE Course_Teachers (
                                 id  INT AUTO_INCREMENT PRIMARY KEY ,
                                 course_id INT,
                                 teacher_id INT,
                                 FOREIGN KEY (course_id) REFERENCES Course(id) ON DELETE CASCADE ON UPDATE CASCADE,
                                 FOREIGN KEY (teacher_id) REFERENCES Teacher(id) ON DELETE CASCADE ON UPDATE CASCADE
);
