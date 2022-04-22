-- CRUD: CREATE, READ, UPDATE, DELETE

SELECT * FROM author;

-- I need to add data to the table using INSERT
-- INSERT is similar to SELECT, but it adds to a table

INSERT INTO author (first_name, last_name) VALUES ('Shawn', 'Carter');

-- Shawn Carter has been successfully added to the DB
SELECT * FROM author;

-- Since the name was spelled wrong, we must update it
-- To do so, we can use the UPDATE query
-- This command works, but will change EVERY row first name to Sean
UPDATE author SET first_name = 'Sean';

-- Instead, we can use the WHERE clause to specify what gets changed
UPDATE author SET first_name = 'Sean' WHERE author_id = 1; -- Changes just the one row
UPDATE author SET first_name = 'Sean' WHERE first_name = 'Shawn'; -- Changes all Shawn to Sean

-- I want to flush out the values from my database
-- To do so, I would use the DELETE query

-- Delete any row from the table with a first_name of Shawn
DELETE FROM author WHERE author_id = 1;
DELETE FROM author WHERE author_id > 0;

/*
	When using UPDATE or DELETE, you should ALWAYS be as specific as possible
    such that you don't delete/update any data that you aren't intending to change
    
 */

-- This will remove my table altogether
DROP TABLE author;