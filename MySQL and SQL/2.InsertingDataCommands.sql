select database();

use pet_store;

create table cats (
name varchar(50),
age int
);

desc cats;

-- Inserting Data into table commands
Insert into cats (name , age) value ("Blue",5);

insert into cats value ("jenkins",8);

insert into cats (age,name) value (11,"java");

-- inserting multiple data into table 
Insert into cats (name,age)
value ("meatbol",6),("dora",10),("michan",4),("oreo",6);

select * from cats; -- used to get all the data inside table

-- Excersise solution
 use world;

 create table people (
	first_name varchar(20),
    last_name  varchar(20),
    age int
    );

desc people;

insert into people (first_name,last_name,age)
value ("Harsh","jha",22),("sony","jha",26),("Ajay","jha",48),("anjali","jha",14),("Madhuri","jha",46);

select * from people;

drop table people;

desc people;

use pet_store;

-- using not null constraint
create table cats2 (
	name varchar(50) not null,
    age int not null
);

desc cats2;

-- using default constraint
create table cats3 (
name varchar(20) default "mystery",
age int default 99
);

desc cats3;

insert into cats3 value ();

insert into cats3 value(null,4);

select * from cats3;

-- Primary key constraint
create table unique_cats(
	catId int not null primary key,
	name varchar(20) not null, 
    age int not null
);

desc unique_cats;

insert into unique_cats
value(2,"gal",10);

select * from unique_cats;

drop table unique_cats;

-- another way of using Primary key constraint
create table unique_cats (
	cat_id int,
    name varchar(20),
    age int,
    primary key(cat_id)
);

desc unique_cats;

drop table unique_cats;

-- auto_increment 
create table unique_cats (
	cat_id int auto_increment,
    name varchar(20),
    age int,
    primary key(cat_id)
);

insert into unique_cats value(1,'oingo',12);
insert into unique_cats(name,age) value('bingo',11);

select * from unique_cats;

-- Exercise solution-2
use world;
select database();

create table Employee (
	id int auto_increment,
	last_name varchar(20) not null,
	first_name varchar(20) not null,
	middle_name varchar(20),
	age int not null,
	current_status varchar(20) not null default 'employed',
	primary key(id)
);

desc Employee;

drop table Employee;


    
