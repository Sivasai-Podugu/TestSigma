CREATE TABLE Payment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    paamountyment_amount DECIMAL(10, 2) NOT NULL,
    status ENUM('Pending', 'Paid', 'Failed') NOT NULL,
    method ENUM('Credit Card', 'Debit Card', 'PayPal', 'Cash on Delivery') NOT NULL,
    FOREIGN KEY (order_id) REFERENCES Orders(id) ON DELETE CASCADE ON UPDATE CASCADE
);