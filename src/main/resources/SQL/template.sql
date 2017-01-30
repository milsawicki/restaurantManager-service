-- TABLE --
INSERT INTO restaurant.stand (id, table_number) VALUES (1,1);
INSERT INTO restaurant.stand (id, table_number) VALUES (2,2);
INSERT INTO restaurant.stand (id, table_number) VALUES (3,3);
INSERT INTO restaurant.stand (id, table_number) VALUES (4,4);

-- PRODUCT TYPE --
INSERT INTO restaurant.product(product_id, name, price, product_type) VALUES (1, 'Tea', 5.5, 0);
INSERT INTO restaurant.product(product_id, name, price, product_type) VALUES (2, 'Water', 5, 0);
INSERT INTO restaurant.product(product_id, name, price, product_type) VALUES (3, 'Beer', 10, 0);
INSERT INTO restaurant.product(product_id, name, price, product_type) VALUES (4, 'Scrambled Eggs', 10, 1);
INSERT INTO restaurant.product(product_id, name, price, product_type) VALUES (5, 'Sandwich', 10, 1);
INSERT INTO restaurant.product(product_id, name, price, product_type) VALUES (6, 'Tomato Soup', 10, 1);

-- WAITER --
INSERT INTO restaurant.waiter(id, name, surname) VALUES (1, 'Milan', 'Sawicki');
INSERT INTO restaurant.waiter(id, name, surname) VALUES (2, 'Jakub', 'Aniola');
