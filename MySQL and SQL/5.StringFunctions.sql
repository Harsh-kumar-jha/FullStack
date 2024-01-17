Create database book_shop;
use book_shop;

CREATE TABLE books 
	(
		book_id INT AUTO_INCREMENT,
		title VARCHAR(100),
		author_fname VARCHAR(100),
		author_lname VARCHAR(100),
		released_year INT,
		stock_quantity INT,
		pages INT,
		PRIMARY KEY(book_id)
	);
 
INSERT INTO books (title, author_fname, author_lname, released_year, stock_quantity, pages)
VALUES
('The Namesake', 'Jhumpa', 'Lahiri', 2003, 32, 291),
('Norse Mythology', 'Neil', 'Gaiman',2016, 43, 304),
('American Gods', 'Neil', 'Gaiman', 2001, 12, 465),
('Interpreter of Maladies', 'Jhumpa', 'Lahiri', 1996, 97, 198),
('A Hologram for the King: A Novel', 'Dave', 'Eggers', 2012, 154, 352),
('The Circle', 'Dave', 'Eggers', 2013, 26, 504),
('The Amazing Adventures of Kavalier & Clay', 'Michael', 'Chabon', 2000, 68, 634),
('Just Kids', 'Patti', 'Smith', 2010, 55, 304),
('A Heartbreaking Work of Staggering Genius', 'Dave', 'Eggers', 2001, 104, 437),
('Coraline', 'Neil', 'Gaiman', 2003, 100, 208),
('What We Talk About When We Talk About Love: Stories', 'Raymond', 'Carver', 1981, 23, 176),
("Where I'm Calling From: Selected Stories", 'Raymond', 'Carver', 1989, 12, 526),
('White Noise', 'Don', 'DeLillo', 1985, 49, 320),
('Cannery Row', 'John', 'Steinbeck', 1945, 95, 181),
('Oblivion: Stories', 'David', 'Foster Wallace', 2004, 172, 329),
('Consider the Lobster', 'David', 'Foster Wallace', 2005, 92, 343);

select * from books;

-- all about String Functions 

-- 1. Concat function in Strings : Combine Data For Cleaner Output
select concat('H','a','r','s','h') as Username;

select concat(author_fname,' ',author_lname) as author_name from books;

-- 2. Concat_WS function in Strings : Concat With Separator
select concat_ws('-','hi','bye','lol') as randomString;

select concat_ws('-',title,author_fname,author_lname) from books;

-- 3. SubString/SubStr function in Strings : Work With Parts Of Strings
select substring('Hello World',1,6);

select substring("Hello world",2,5);

select substring("Hello world",7);

select substring("Hello world",-3);

select substr(title,1,15) from books;

select substr(author_lname,1,1) as initials , author_lname from books;

-- Combining concat and substr function
select Concat(substr(title,1,10),'...') as short_tile from books;

SELECT 
    CONCAT(SUBSTR(author_fname, 1, 1),
            '.',
            SUBSTR(author_lname, 1, 1),
            '.') AS author_initials
FROM
    books;

-- 4. Replace function in String : Replace parts of strings
select replace("Hello World","Hell","!@#$"); -- case sensitive

select replace('cheese bread coffee milk' , ' ' , ' and ' );

SELECT 
    REPLACE(title, ' ', '-')
FROM
    books;

-- 5. Reverse function in String : it will reverse a given string
select reverse("Hello World");

select reverse(null); -- it will return null

select reverse(author_fname) from books;

select concat(author_fname,reverse(author_fname)) from books;

-- 6. Char_length function in string : Counts Characters in String
select char_length('hello world');

select char_length(title) as title_len , title from books;

-- 7. Upper()/UCASE() and Lower()/LCASE() function in string : Change A String's Case
select upper("hello");
select ucase('hello');

select lower("HELLO");
select lcase("HELLO");

select upper(title) from books;

SELECT 
    CONCAT(UPPER('I love '), UPPER(title), ' !!!')
FROM
    books;

-- 8. Insert function in String : use to insert some data in a large String
select Insert("Hello World",6,0," There ");

-- 9. Left and Right function in string
select left(author_fname,1) from books;

select right(author_fname,1) from books;

-- 10. Repeat function in string
select repeat('ha',5);

-- 11. Trim function in string : use to remove space from forward and backward direction but not from middle
select trim('            hello        '); 

-- Exercise Solution 
select reverse(upper("Why does my cat look at me with such hatred?"));

SELECT
  REPLACE
  (
  CONCAT('I', ' ', 'like', ' ', 'cats'),
  ' ',
  '-'
  );
  
  select replace(title," " ,"->") from books;
  
  select author_lname as forward , reverse(author_lname) as backward from books;
  
  select concat(upper(author_fname)," ",upper(author_lname)) as 'full name in caps' from books;
  
  select concat(title," was released in " , released_year) as blurb from books;
  
  select title , char_length(title) as "Character count" from books;
  
  select concat(substr(title,1,10),"...") as "short tittle",concat(author_lname,",",author_fname) as author , concat(stock_quantity," in stock") as quantity  from books;