-- CRUD basic commands 
-- CRUD stands for Create , Read , Update and Delete

use pet_store;

-- Create part from CRUD commands
create table cats (
	cat_id int auto_increment,
    cat_name varchar(20),
    cat_age int,
    cat_breed varchar(20),
    primary key(cat_id)
);

desc cats;

INSERT INTO cats(cat_name, cat_breed, cat_age) 
VALUES ('Ringo', 'Tabby', 4),
       ('Cindy', 'Maine Coon', 10),
       ('Dumbledore', 'Maine Coon', 11),
       ('Egg', 'Persian', 4),
       ('Misty', 'Tabby', 13),
       ('George Michael', 'Ragdoll', 9),
       ('Jackson', 'Sphynx', 7);
       
-- Read commads from CRUD
Select * from cats;
select cat_age from cats;
select cat_name , cat_age from cats;

-- Read command using where clause
select * from cats where cat_age = 4;
select cat_name,cat_age from cats where cat_age = 4;
select cat_name from cats where cat_age = 4;

-- some random exercise solution
select cat_id from cats;
select cat_name , cat_breed from cats;
select cat_name , cat_age from cats where cat_breed = "tabby";
select * from cats where cat_id = cat_age;

-- aliase command
select cat_id as id , cat_name as kittyName from cats;

-- update command 
UPDATE cats SET cat_age=14 WHERE cat_name='Misty';
update cats set cat_breed = "shorthair" where cat_breed = "tabby";

-- update exercise
update cats set cat_name = "jack" where cat_name="jackson";
update cats set cat_breed = "British shorthair" where cat_name ="Ringo";
update cats set cat_age = 12 where cat_breed = "Main Coons";

-- delete command
delete from cats where cat_name = "egg";

-- delete exercise 
delete from cats where cat_age = 4;
delete from cats where cat_id = cat_age;
delete from cats;