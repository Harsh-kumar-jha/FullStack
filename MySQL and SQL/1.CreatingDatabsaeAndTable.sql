show databases; -- use to check all the available database 

CREATE DATABASE pet_store; -- created a database with name pet_store

create database slimStore; -- created a database with name slimestore

create database chicken_coop; -- created a database with name slimestore

DROP DATABASE slimstore; -- deleted a database 

USE chicken_coop; -- selected chicken_coop database for further use

SELECT DATABASE(); -- use to check which database is selected

CREATE DATABASE tea_shop; -- created a database with name as tea_Shop

USE tea_shop; -- selected tea_Shop databse for further use

SELECT database(); -- use to check which database is selected

use pet_store;

select database();

-- Now below we will create table inside pet_store
CREATE TABLE cats (
	name varchar(50),
    age int
    );
    
CREATE TABLE dogs(
	name varchar(50),
    breed varchar(50),
    age int
    );

Show tables; -- use to check how many tables are present in the database

Show columns from cats; -- use to check the column in a particular database

desc cats; -- alternate for above command

drop table cats; -- it will delete everything from given table


-- challenge
use tea_shop;
create table pastries (
	name varchar(50),
    quantity varchar(50)
    );
desc pastries;
drop table pastries;