CREATE TABLE IF NOT EXISTS customers
(
    customer_id VARCHAR(255) DEFAULT UUID(),
    name        VARCHAR(50) NOT NULL,
    PRIMARY KEY (customer_id)
);