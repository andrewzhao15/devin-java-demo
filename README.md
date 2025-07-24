# Devin Java Demo

A simple Java project demonstrating the use of Jackson Databind for JSON serialization and deserialization.

## Project Structure

```
devin-java-demo/
├── src/
│   ├── main/java/
│   │   └── com/example/
│   │       ├── Main.java
│   │       └── model/
│   │           └── Person.java
│   └── test/java/
│       └── com/example/
│           └── model/
│               └── PersonTest.java
└── pom.xml
```

## Features

- JSON serialization and deserialization using Jackson Databind
- Custom property naming with `@JsonProperty` annotation
- Unit tests with JUnit

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean package
```

## Running the Application

```bash
java -jar target/devin-java-demo-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Running Tests

```bash
mvn test
```

## License

MIT