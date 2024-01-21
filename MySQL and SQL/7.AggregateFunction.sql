-- Aggregate Functions in SQL
use book_shop;
-- 1. Count function 
select count(*) from books; -- return number of rows present in that table

select count(author_fname) from books;

select count(distinct author_fname) from books;

select count(*) from books where title like '%the%';

-- 2. Group by function : summarizes or aggregates idendical data into single row
select author_lname from books group by author_lname;

SELECT 
    author_lname, COUNT(*) AS book_written
FROM
    books
GROUP BY author_lname
ORDER BY book_written DESC;

-- 3. Min and Max function 
select min(released_year) from books;
select max(released_year) from books;

select min(pages) from books;
select max(pages) from books;

-- subqueries
select * from books where pages = (select min(pages) from books);

SELECT 
    title, released_year
FROM
    books
WHERE
    released_year = (SELECT 
            MIN(released_year)
        FROM
            books);

-- group by with multiple columns
SELECT 
    author_fname, author_lname, COUNT(*)
FROM
    books
GROUP BY author_lname , author_fname; 

select concat(author_fname," ",author_lname) as author, count(*) from books group by author;

-- min and max function with group by

SELECT author_lname, MIN(released_year) FROM books GROUP BY author_lname;
 
SELECT author_lname, MAX(released_year), MIN(released_year) FROM books GROUP BY author_lname;
 
SELECT 
    author_lname,
    COUNT(*) AS books_written,
    MAX(released_year) AS latest_release,
    MIN(released_year) AS earliest_release,
    MAX(pages) AS longest_page_count
FROM
    books
GROUP BY author_lname;
 
 
SELECT 
	author_lname, 
        author_fname,
	COUNT(*) as books_written, 
	MAX(released_year) AS latest_release,
	MIN(released_year)  AS earliest_release
FROM books GROUP BY author_lname, author_fname;

-- 5. Sum function 
select sum(pages) from books;

select author_lname , sum(pages) from books group by author_lname;

-- 6. Avg function 
select avg(pages) from books;

-- Excersices Solution 
select count(stock_quantity) from books;

select released_year,count(*) from books group by released_year;

select sum(stock_quantity) from books;

select avg(released_year) from books group by author_fname,author_lname;

SELECT CONCAT(author_fname, ' ', author_lname) AS author, pages FROM books
WHERE pages = (SELECT MAX(pages) FROM books);
 
SELECT CONCAT(author_fname, ' ', author_lname) AS author, pages FROM books
ORDER BY pages DESC LIMIT 1;
 
SELECT 
    released_year AS year,
    COUNT(*) AS '# books',
    AVG(pages) AS 'avg pages'
FROM books
GROUP BY released_year
ORDER BY released_year;