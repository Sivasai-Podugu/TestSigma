CREATE TABLE delivery_status(
                                   id INT AUTO_INCREMENT PRIMARY KEY,
                                   name VARCHAR(50) NOT NULL,
                                   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                   updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);