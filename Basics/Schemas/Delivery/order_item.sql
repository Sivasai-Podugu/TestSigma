CREATE TABLE order_item (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             orders_id INT NOT NULL,
                             name VARCHAR(100) NOT NULL,
                             quantity INT NOT NULL,
                             price DECIMAL(10, 2) NOT NULL,
                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                             FOREIGN KEY (orders_id) REFERENCES orders (id)
);