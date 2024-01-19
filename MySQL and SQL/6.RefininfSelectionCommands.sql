-- Refining Selections
use book_shop;

INSERT INTO books
    (title, author_fname, author_lname, released_year, stock_quantity, pages)
    VALUES ('10% Happier', 'Dan', 'Harris', 2014, 29, 256), 
           ('fake_book', 'Freida', 'Harris', 2001, 287, 428),
           ('Lincoln In The Bardo', 'George', 'Saunders', 2017, 1000, 367);
           
SELECT 
    *
FROM
    books;
    
-- Distinct clause
select author_fname from books;
select distinct author_fname from books;

select released_year from books;
select distinct released_year from books;

select distinct concat(author_fname," ", author_lname) as authors from books;
select distinct author_fname,author_lname from books;

-- order by clause : by default it will sort in ascending order
select * from books order by author_fname; 

select * from books order by author_fname desc; -- now it will sort in descending order

select * from books order by released_year;

select title , author_fname,author_lname from books order by 2 desc;

SELECT book_id, author_fname, author_lname, pages
FROM books ORDER BY 2 desc;
 
SELECT 
    book_id, author_fname, author_lname, pages
FROM
    books
ORDER BY author_lname , author_fname;

-- Limit clause 
select * from books limit 5;

select title from books limit 1;

select title from books limit 10;

select * from books limit 1;

select title,released_year from books order by released_year limit 5;

select title , released_year from books order by released_year desc limit 1;

select title , released_year from books order by released_year desc limit 3,5;

-- like clause 
SELECT 
    title, author_fname, author_lname
FROM
    books
WHERE
    author_fname LIKE '%da%';
    
select * from books where title like "%:%";

select * from books where author_fname like "____";

select * from books where author_fname like "_a_";

select * from books where author_fname like "%a";

select * from books where title like "%\%%";

select * from books where title like "%\_%";

-- Excersise Solution
select title from books where title like "%stories%";

select title , pages from books order by pages desc limit 1;

select concat(title," - ",released_year) as summery from books order by released_year desc limit 3;

select title , author_lname from books where author_lname like "%\ %";

select title,released_year,stock_quantity from books order by 3 limit 3;

select title,author_lname from books order by author_lname,title;

SELECT 
    UPPER(CONCAT('MY FAVORITE AUTHOR IS ',
                    author_fname,
                    ' ',
                    author_lname,
                    '!')) AS yell
FROM
    books
ORDER BY author_lname;
