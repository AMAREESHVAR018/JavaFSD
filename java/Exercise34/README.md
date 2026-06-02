# Exercise 34 - Java Modules

## Objective
Create and use two Java modules: `com.utils` and `com.greetings`.

## File Structure
- `com.utils/src/module-info.java`
- `com.utils/src/com/utils/MessageUtil.java`
- `com.greetings/src/module-info.java`
- `com.greetings/src/com/greetings/Main.java`

## Sample Output
```text
Welcome to the Community Learning Management System
```

## Explanation
The `com.greetings` module uses the exported utility class from `com.utils`.

## Compile Commands
```bash
javac -d out/com.utils com.utils/src/module-info.java com.utils/src/com/utils/MessageUtil.java
javac --module-path out -d out/com.greetings com.greetings/src/module-info.java com.greetings/src/com/greetings/Main.java
```

## Run Commands
```bash
java --module-path out -m com.greetings/com.greetings.Main
```
