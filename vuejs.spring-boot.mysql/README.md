# TaskAgile

Open source task management tool built with Vue.js 2, Spring Boot 2, and MySQL 5.7+

> This is the repository for the book [_Building applications with Spring 5 and Vue.js 2: A real-world practical guide to building a modern full-stack web application_](https://www.amazon.com/Building-applications-Spring-5-0-Vue-js-ebook/dp/B079X1VTST).

## Local development setup

### Prerequisites

- JDK8 - OpenJDK  Preferred
- MySQL 5.7+

### Database setup

- Create database `task_agile`
- Initialize database with scripts in `setup` folder

### Add dev properties file

- Create `src/main/resources/application-dev.properties` with the following settings to override the settings in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_agile?useSSL=false
spring.datasource.username=<your username>
spring.datasource.password=<your password>
```

## Commands

- Use `mvn test` to run the tests of the back-end and the front-end
- Use `mvn spring-boot:run` to start the back-end
- Use `npm run serve` inside the `front-end` directory to start the front-end
- Use `mvn install` to build both the front-end and the back-end
- Use `java -jar target/app-0.0.1-SNAPSHOT.jar` to start the bundled application
