-- TABLE --
INSERT INTO restaurant.stand (id, table_number) VALUES (1,1);
INSERT INTO restaurant.stand (id, table_number) VALUES (2,2);
INSERT INTO restaurant.stand (id, table_number) VALUES (3,3);
INSERT INTO restaurant.stand (id, table_number) VALUES (4,4);
-- PRODUCT TYPE --
INSERT INTO restaurant.product_type(id,name) VALUES (1, 'FOOD');
INSERT INTO restaurant.product_type(id,name) VALUES (2, 'DRINKS');
-- PRODUCT --
INSERT INTO restaurant.product(product_id, name, price, product_type_id) VALUES (1, 'TEA', 5.5, 2);
INSERT INTO restaurant.product(product_id, name, price, product_type_id) VALUES (2, 'WATER', 5, 2);
INSERT INTO restaurant.product(product_id, name, price, product_type_id) VALUES (3, 'SANDWICH', 10, 1);
INSERT INTO restaurant.product(product_id, name, price, product_type_id) VALUES (4, 'SCRAMBLED EGGS', 10, 1);
-- WAITER --
INSERT INTO restaurant.waiter(id, name, surname) VALUES (1, 'Tom', 'Hanks');
INSERT INTO restaurant.waiter(id, name, surname) VALUES (2, 'Jakub', 'Anielkiewicz');
INSERT INTO restaurant.waiter(id, name, surname) VALUES (3, 'Milan', 'Sawicko');