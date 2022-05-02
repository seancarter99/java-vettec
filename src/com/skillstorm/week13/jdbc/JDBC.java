package com.skillstorm.week13.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

public class JDBC {

	/**
	 * JDBC stands for "Java Database Connectivity"
	 * 
	 * It's used to connect our Java applications to our SQL databases
	 * It was once the preferred way of connecting to SQL databases
	 * It's not anymore, but you'll still see/hear it thrown around
	 * 
	 * How does JDBC work?
	 * - JDBC works by establishing a connection to the database usually via HTTP(S)
	 * - We then write SQL queries in our Java code to interact with the database
	 * - The JDBC connection will translate the results from database (rows) into Java for use in our application
	 * 
	 * Downside of JDBC:
	 * - We write our SQL queries directly in the Java code
	 * - These queries offered too much "low level control" over the database
	 *   - Developers wanted a layer of abstraction instead of writing pure SQL in Java code
	 * - To remedy this, they created a design pattern called the DAO (Data Access Object)
	 *   - This was a simple interface created with the sole purpose of handling the SQL side of things
	 *   - Essentially, create a class to do all the SQL code so that the rest of app doesn't have to think about it
	 *     - Instead of saying SELECT firstName FROM employee WHERE id = 5;
	 *     - I can say getEmployeeFirstNameById(5);
	 * 
	 * Nowadays we use something known as JPA instead
	 * - JPA stands for "Java Persistency API" 
	 *   - Where API means "Application Programming Interface"
	 * - Acts as a layer of abstraction between us and SQL
	 * - Built on top of JDBC
	 * - JPA is known as an ORM or "Object Relational Mapper"
	 *   - It's called a mapper because the key is our Java data attribute and the key is some column in SQL
	 *   - This allows us to translate our Java objects we write to SQL
	 * - The most famous JPA implementations are Hibernate or OpenJPA
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/**
		 * Connecting to MySQL:
		 * 
		 * First and foremost, we need to pull from Maven the MySQL connector for Java
		 * 
		 * Steps for JDBC
		 * 
		 * 1. Load the MySQL Driver into memory
		 *    - This is done as an insurance mechanism so that I know for a fact the JVM knows about my Driver
		 *    - We add the following line of code to force load it into the JVM
		 *    - If we compile manually then we can skip this line so long as we load it before file
		 *    - If not, we do it this way
		 * 2. Establish a connection to MySQL using that Driver class that we loaded in
		 * 3. Create an SQL Statement
		 * 4. Execute the SQL Statement
		 * 5. Close the connection
		 */
		
		// Step 1.
		// From package com.mysql.cj.jdbc, load in the class Driver
		// Realistically, wrap this code in a try/catch where the catch handles the protocol for 
		// the MySQL object not being present
		
		// Without it, we can't connect to the DB and as such is often mission critical
		// Catch might be sending out an alert indicating it's down or redirects to another database
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2.
		// Once we have the Driver, connect to the database
		// url structure "jdbc:<sql-variant>://localhost:<port-running-sql>/<schema-name>"
		
		// Storing our login credentials for the database right here is a security risk
		// They should be stored more privately
		
//		String url = "jdbc:mysql://localhost:3306/library"; // Connects to the library schema
//		String user = "root";
//		String password = "root";
		try (InputStream input = JDBC.class.getClassLoader().getResourceAsStream("application.properties")) {
			Properties props = new Properties(); // Use to work with Properties file
			props.load(input); // Loads that stream into our props object
//			System.out.println(props.getProperty("db.url"));
			String url = props.getProperty("db.url");
			String user = props.getProperty("db.user");
			String password = props.getProperty("db.password");
			
			// This has the potential to throw an SQLException
			// SQLExceptions are checked exceptions and occur when an SQL query does not work (throws an error)
			Connection dbConnection = DriverManager.getConnection(url, user, password);
			
			// Step 3.
			String sql = "SELECT * FROM book_info";
			Statement statement = dbConnection.createStatement();
			PreparedStatement ps = dbConnection.prepareStatement(sql);
			
			// Step 4.
			// Bind the sql query with the statement and hit execute
			// If we were doing INSERT or UPDATE we would executeUpdate() instead
			// The query returns a ResultSet containing all of the rows that were retrieved by my query
			ResultSet rs = statement.executeQuery(sql);
			
			// ResultSet is essentially an Iterator
			// I can advance the "cursor" to step over each row from the results we get back
			while(rs.next()) {
				// If I use an int as a parameter I need to know what column number the data is
				int authorId = rs.getInt("author_id"); // If this isn't an int, this will throw an error
				String bookTitle = rs.getString("title");
				System.out.println("Author ID: " + authorId + ", Book Title: " + bookTitle);
			}
			
			// Step 5.
			dbConnection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// SELECT * FROM book_info WHERE title = 'Feast of July';
		getBookInfoByTitle("Feast of July");
		
		// SELECT * FROM book_info WHERE title = 'Feast of July'; SELECT * FROM users; --
		getBookInfoByTitle("'Feast of July'; SELECT * FROM users; --");
		
//		Connection dbConnection = DriverManager.getConnection(url, user, password);
	}

	public List<BookInfo> getBookInfoByAuthorId(int authorId) {
		String sql = "SELECT * FROM book_info WHERE author_id = " + authorId;
		return null; // Return a list of all of the data from the query transformed into a Java LinkedList
	}
	
	public static List<BookInfo> getBookInfoByTitle(String title) {
		
		// This is bad as it will lead to SQL Injection
		String sql = "SELECT * FROM book_info WHERE title = " + title;
		
		// Parameterized SQL query
		// Statements just take the SQL and has SQL execute it
		// Now we use PreparedStatements to have Java proof read the query and escape any malicious attempts before 
		// sending it to SQL
		String betterSQL = "SELECT * FROM book_info WHERE title = ?;";
		PreparedStatement preppedStatement = dbConnection.prepareStament(betterSQL);
		preppedStatement.setString(1, "Wild Seven"); // Set the value Wild Seven at the first ? in the query
		preppedStatement.executeQuery(betterSQL);
		
		return null;
	}
}
