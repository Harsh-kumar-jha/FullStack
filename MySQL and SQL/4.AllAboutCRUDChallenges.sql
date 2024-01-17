-- Challenge 1 : Create a  Database about shirts
create database shirts_db;
use shirts_db;

-- Challenge 2 : Create a Table shirts to insert information about shirts
Create table shirts (
	shirt_id int primary key auto_increment,
    article varchar(20),
    color varchar(20),
    shirt_size varchar(5),
    last_worn int
    );

desc shirts;

insert into shirts(article,color,shirt_size,last_worn)
value ('t-shirt', 'white', 'S', 10),
('t-shirt', 'green', 'S', 200),
('polo shirt', 'black', 'M', 10),
('tank top', 'blue', 'S', 50),
('t-shirt', 'pink', 'S', 0),
('polo shirt', 'red', 'M', 5),
('tank top', 'white', 'S', 200),
('tank top', 'blue', 'M', 15);

-- Challenge 3 : Get All That Data In There With a single line
select * from shirts;

-- challenge 4 : Add A New Shirt Purple polo shirt, size M last worn 50 days ago
insert into shirts(article,color,shirt_size,last_worn) value ("polo shirt","purple","M",50);

-- challenge 5 : SELECT all shirts But Only Print Out Article and Color
select article,color from shirts;

-- challenge 6 : SELECT all medium shirts Print Out Everything But shirt_id
select article,color,shirt_size,last_worn from shirts where shirt_size = "M";

-- challenge 7 : Update all polo shirts Change their size to L
update shirts set shirt_size = "L" where article="polo shirt";

-- challenge 8 : Update the shirt last worn 15 days ago Change last_worn to 0
update shirts set last_worn = 0 where last_worn = 15;

-- challenge 9 : Update all white shirts Change size to 'XS' and color to 'off white'
update shirts set shirt_size = "XS", color = "off white" where color = "white";

-- challenge 10 : Delete all old shirts Last worn 200 days ago
select * from shirts where last_worn = 200; -- checking before deleting
delete from shirts where last_worn = 200;

-- challenge 11 : Delete all tank tops Your tastes have changed...
select * from shirts where article = 'tank top';
delete from shirts where article = 'tank top';

-- challenge 12 : Delete all shirts
delete from shirts;

-- challenge 13 : Drop the entire shirts table
drop table shirts;