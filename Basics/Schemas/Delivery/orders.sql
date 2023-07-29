CREATE TABLE orders(
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        customer_name VARCHAR(100) NOT NULL,
                        customer_email VARCHAR(100) NOT NULL,
                        delivery_address VARCHAR(200) NOT NULL,
                        driver_id INT,
                        status_id INT NOT NULL,
                        date DATE NOT NULL,
                        total_amount DECIMAL(10, 2) NOT NULL,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        FOREIGN KEY (driver_id) REFERENCES driver(id),
                        FOREIGN KEY (status_id) REFERENCES delivery_status(id)
);
