DROP DATABASE budgetDB;

CREATE DATABASE budgetDB;

USE budgetDB;

CREATE TABLE txns(
 txnid INT PRIMARY KEY AUTO_INCREMENT,
 header VARCHAR(50) NOT NULL,
 amount DOUBLE NOT NULL,
 type  VARCHAR(10) NOT NULL,
 txnDate DATE NOT NULL
);