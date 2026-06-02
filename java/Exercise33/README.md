# Exercise 33 - Transaction Handling in JDBC

## Objective
Use transaction handling with commit and rollback.

## File Structure
- `pom.xml`
- `schema.sql`
- `src/main/java/com/community/jdbc/TransactionDemo.java`

## Sample Output
```text
Transaction committed
```

## Explanation
The program disables auto-commit, performs multiple inserts, and commits them together.

## Run Commands
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass=com.community.jdbc.TransactionDemo
```

## JDBC Configuration
- URL: `jdbc:sqlite:community.db`
- Driver: SQLite JDBC
