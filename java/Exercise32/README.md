# Exercise 32 - Insert and Update Operations in JDBC

## Objective
Perform insert and update operations with JDBC.

## File Structure
- `pom.xml`
- `schema.sql`
- `src/main/java/com/community/jdbc/Event.java`
- `src/main/java/com/community/jdbc/EventDao.java`
- `src/main/java/com/community/jdbc/JdbcCrudDemo.java`

## Sample Output
```text
1 Community Workshop Education
```

## Explanation
The DAO uses `PreparedStatement` for insert and update operations.

## Run Commands
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass=com.community.jdbc.JdbcCrudDemo
```

## JDBC Configuration
- URL: `jdbc:sqlite:community.db`
- Driver: SQLite JDBC
