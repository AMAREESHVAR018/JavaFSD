# Exercise 31 - Basic JDBC Connection

## Objective
Connect to SQLite and run a simple SQL statement.

## File Structure
- `pom.xml`
- `schema.sql`
- `src/main/java/com/community/jdbc/JdbcConnectionDemo.java`

## Sample Output
```text
1 Music Festival Music
```

## Explanation
The program opens a JDBC connection, creates the table if needed, inserts a row, and reads it back.

## Run Commands
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass=com.community.jdbc.JdbcConnectionDemo
```

## JDBC Configuration
- URL: `jdbc:sqlite:community.db`
- Driver: SQLite JDBC
