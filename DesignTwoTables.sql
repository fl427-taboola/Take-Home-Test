USE taboola;
/* products table */
CREATE TABLE IF NOT EXISTS products(
    product_id INTEGER UNSIGNED AUTO_INCREMENT,
    product_name VARCHAR(255) NOT NULL,
    product_category VARCHAR(255) NOT NULL,
    PRIMARY KEY (product_id)
);

/* product price history table */
CREATE TABLE IF NOT EXISTS product_price_history(
    price_history_id INTEGER UNSIGNED AUTO_INCREMENT,
	product_id INTEGER UNSIGNED,
	product_price FLOAT NOT NULL,
	start_date TIMESTAMP,
	end_date TIMESTAMP,
	PRIMARY KEY (price_history_id),
	FOREIGN KEY (product_id) REFERENCES products(product_id)
);

/* sample */
INSERT INTO products VALUES (null, 'iPhone', 'Phone');
INSERT INTO products VALUES (null, 'iPad', 'Computer');
INSERT INTO products VALUES (null, 'Macbook', 'Computer');

INSERT INTO product_price_history VALUES (null, 1, 999, '2019-12-2', '2019-12-3');
INSERT INTO product_price_history VALUES (null, 1, 949, '2019-12-14', '2019-12-15');
INSERT INTO product_price_history VALUES (null, 1, 900, '2020-1-15', null);
INSERT INTO product_price_history VALUES (null, 2, 400, '2019-11-14', '2019-11-20');
INSERT INTO product_price_history VALUES (null, 3, 2200, '2019-12-17', '2020-1-20');


/* sample query to join two tables */
SELECT products.product_name, products.product_category, product_price_history.product_price, product_price_history.start_date, product_price_history.end_date
FROM products
INNER JOIN product_price_history
ON products.product_id=product_price_history.product_id
WHERE product_price_history.start_date>='2019-12-14'

