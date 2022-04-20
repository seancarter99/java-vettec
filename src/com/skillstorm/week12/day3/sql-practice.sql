-- This is a single line comment  

/*
  This
  is
  a
  multi
  line
  comment
*/

-- SQL syntax is "high level" meaning it looks like English

/* 
Commands:
  DESCRIBE - Describes a table and spits out info on it and its columns 
  SELECT - Used to read data from the database (the start of a query)
  FROM - Specifies which table to retrieve data from
  WHERE - Allows us to specify criteria for the data we get back
  GROUP BY - Allows us to group our rows that we get back logically (group by first_name)
  HAVING - Works with GROUP BY and is a way to filter the data for group by
  ORDER BY - Allows us to specify the order the data is presented once everything else has run
*/

/*
  SQL Data Types:
  
  Numeric:
    INT
    SMALLINT (short in Java)
    TINYINT (byte in Java)
    MEDIUMINT (between a short and int in Java)
    BIGINT (long in Java)
    
    FLOAT(M,D)
      Takes two parameters for extra specification (number formatting)
      M - The total number of digits the number will be (before AND after the decimal)
      D - THe number of decimal places
    DOUBLE(M,D)
    DECIMAL(M,D) - Preferred for money where preciseness matters
    
  String:
    CHAR(M) (Fixed size string)
      Max size is 255 characters
      M - How many characters should be in the string
	VARCHAR(M) (variable sized string)
    TEXT (65,000 characters)
      Used for storing articles or files (images)
	BLOB (BINARY LARGE OBJECT)
      Used for storing files (images, videos)
      Works the same as TEXT
	TINYBLOB/TINYTEXT
    SMALLBLOB/SMALLTEXT
    MEDIUMBLOB/MEDIUMTEXT
    BIGBLOB/BIGTEXT
	ENUM ('Y', 'N') Only allow 'Y' or 'N' or NULL to be entered for that column
    
  Date/Time:
   DATE (YYYY-MM-DD)
   TIME (HH:MM:SS)
   DATETIME (YYYY-MM-DD HH:MM:SS)
   TIMESTAMP (YYYYMMDDHHMMSS)
   YEAR
	2 Digits ranges from 70 to 69 where 70 is 1970 and 69 is 2069
    4 Digits allows me to enter the year of my choosing
  
  Other:
   BOOL/BOOLEAN (true/false)
*/

-- Spits out information on the actor table
DESCRIBE actor;

-- SELECT Statement
-- SELECT data FROM some_table
-- SELECT statements return a table with the data specified

SELECT actor_id FROM actor;

-- SELECT multiple values
SELECT first_name, last_name FROM actor;

-- SELECT EVERYTHING from a table
SELECT * FROM actor;

-- Snake Case: theres_a_snake_in_my_boot (Python)
-- Camel Case: theresASnakeInMyBoot (Java)

-- WHERE Clause
-- SELECT data FROM table WHERE condition

-- Give me all the data from actor so long as the actor_id for the row is greater than 10
SELECT * FROM actor WHERE actor_id > 10;

-- Give me all the rows so long as the actor's first name is Nick
SELECT * FROM actor WHERE first_name = 'NICK';

-- Only give me Nick Stallone
SELECT * FROM actor WHERE actor_id = 44;
SELECT * FROM actor WHERE first_name = 'NICK' AND last_name = 'STALLONE';