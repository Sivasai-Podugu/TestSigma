CREATE TABLE Teacher (
                          id INT AUTO_INCREMENT PRIMARY KEY ,
                          first_name VARCHAR(50) NOT NULL,
                          last_name VARCHAR(50) NOT NULL,
                          date_of_birth DATE NOT NULL,
                          gender ENUM('Male', 'Female', 'Other') NOT NULL,
                          address VARCHAR(100),
                          email VARCHAR(100) UNIQUE NOT NULL,
                          phone VARCHAR(20),
                          hire_date DATE NOT NULL,
                          salary DECIMAL(10, 2) NOT NULL
);
