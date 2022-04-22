-- How do I retrieve all author names and the total number of books they've written

-- Retrieves number of copies each author wrote
SELECT a.first_name, a.last_name, COUNT(*) AS number_of_books
FROM author AS a
INNER JOIN book_info AS bi
ON a.author_id = bi.author_id
GROUP BY a.author_id
ORDER BY number_of_books DESC;

-- Retrieve the member name, return_date
SELECT first_name, last_name, return_date
FROM member AS m
INNER JOIN checkout AS c
ON m.member_id = c.member_id;

-- Retrieve the amount of times each member has done a checkout
SELECT first_name, last_name, COUNT(*) AS number_of_checkouts
FROM member AS m
INNER JOIN checkout AS c
ON m.member_id = c.member_id
GROUP BY c.member_id
ORDER BY number_of_checkouts DESC;

-- I want to see all of the members who've NEVER performed a checkout
SELECT first_name, last_name, c.checkout_id
FROM member AS m
LEFT JOIN checkout AS c
ON m.member_id = c.member_id;

-- I want the book titles and the amount of times that it has been checked out
SELECT bi.title, lb.book_id, bi.isbn, c.checkout_id, COUNT(*) AS number_of_checkouts
FROM book_info AS bi
INNER JOIN library_book AS lb
ON bi.isbn = lb.isbn
INNER JOIN checkout AS c
ON lb.book_id = c.book_id
GROUP BY bi.isbn
ORDER BY number_of_checkouts DESC
LIMIT 5;