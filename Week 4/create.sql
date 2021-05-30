DROP DATABASE Shop;
CREATE DATABASE Shop;
USE Shop;

CREATE TABLE SunglassesShop (
	id INT,
	article INT,
	color VARCHAR(50) NOT NULL,
	brand  VARCHAR(50) NOT NULL,
	manufacturer VARCHAR(50) NOT NULL,
	price INT NOT NULL
);

CREATE TABLE Customers(
         id INT ,
	 name_surname VARCHAR(50),
	 gender VARCHAR(50),
	 address VARCHAR(100),
	 phoneNumber VARCHAR(30)
);
 
CREATE TABLE Orders(
       id INT,
       status VARCHAR(30),
       order_customer INT,
       order_sunglass INT
);

ALTER TABLE SunglassesShop
MODIFY COLUMN id INT AUTO_INCREMENT PRIMARY KEY;

ALTER TABLE Customers
MODIFY COLUMN id INT AUTO_INCREMENT PRIMARY KEY;

ALTER TABLE Orders
MODIFY COLUMN id INT AUTO_INCREMENT PRIMARY KEY;

ALTER TABLE Orders
ADD (FOREIGN KEY(order_customer) REFERENCES Customers(id),
  FOREIGN KEY(order_sunglass)  REFERENCES  SunglassesShop(id));


INSERT INTO SunglassesShop 
VALUES (1, 1254, "Black", "Ray Ban", "China", 450),
(2, 1255, "Gold", "Ciosako", "China", 400),
(3, 1256, "Brown", "Armani", "China", 850),
(4, 1257, "Black", "Xiomai", "China", 350),
(5, 1259, "White", "Porsh", "China", 1000),
(6, 1260, "Red", "Dior", "China", 580);

INSERT INTO Customers 
VALUES (1, "Arsen Abylov","male", "Kasymbekov street 48", "0550147895"),
(2, "Ayperi Kadyrbekova", "female", "Lenin street 122", "0550147895"),
(3, "Zeynep Sultanova", "female", "Ahunbeva street 237", "0550147895"),
(4, "Ayana Muhammedova", "female", "Gagarina street 25", "0550147895"),
(5, "Rysbek Almazbeov", "male", "Ayni street 112", "0550147895");

INSERT INTO Orders 
VALUES (1, "Recieved", 1, 4),
(2, "Not verifed", 4, 6),
(3, "Sent", 5, 5),
(4, "Verifed", 2, 2),
(5, "Processed", 3, 1);
