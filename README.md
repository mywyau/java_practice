# java_practice


## to run specific apps/classes, use custom runner script:

Please look inside build.gradle.kts for task names to run

```
./run_custom_tag.sh <task name>
```

```
./run_custom_tag.sh forLoopExamples
```


## Java and Spring Boot Learning Roadmap

This document outlines the key topics and concepts you need to learn to become proficient in **Java** and **Spring Boot**. Use this as a checklist and reference guide as you progress through your learning journey.

---

## **1. Core Java Topics**

### **a. Object-Oriented Programming (OOP)**
- [ ] Inheritance
- [ ] Polymorphism (method overriding and overloading)
- [ ] Encapsulation (access modifiers: `private`, `protected`, `public`)
- [ ] Abstraction (abstract classes and interfaces)

### **b. Collections Framework**
- [ ] `List`, `Set`, `Map` (e.g., `ArrayList`, `HashSet`, `HashMap`)
- [ ] Iterating over collections (iterators, enhanced `for` loops)
- [ ] Sorting and searching (`Comparable`, `Comparator`)

### **c. Exception Handling**
- [ ] `try`, `catch`, `finally`, `throw`
- [ ] Checked vs. unchecked exceptions
- [ ] Custom exceptions

### **d. Generics**
- [ ] Type-safe classes and methods
- [ ] Generic methods and bounded types

### **e. Java 8+ Features**
- [ ] Lambda expressions
- [ ] Streams API (`map`, `filter`, `reduce`, etc.)
- [ ] `Optional` for handling `null` values
- [ ] Date and Time API (`LocalDate`, `LocalTime`, `LocalDateTime`)

### **f. Input/Output (I/O)**
- [ ] `File`, `InputStream`, `OutputStream`, `Reader`, `Writer`
- [ ] Serialization and deserialization

### **g. Multithreading**
- [ ] `Thread`, `Runnable`, `ExecutorService`
- [ ] Synchronization and concurrency issues

---

## **2. Spring Framework Basics**

### **a. Dependency Injection (DI)**
- [ ] `@Autowired`, `@Component`, `@Service`, `@Repository`, `@Controller`

### **b. Spring Context and Configuration**
- [ ] Spring Application Context
- [ ] XML-based and annotation-based configuration

### **c. Aspect-Oriented Programming (AOP)**
- [ ] Cross-cutting concerns (e.g., logging, security)

---

## **3. Spring Boot**

### **a. Spring Boot Basics**
- [ ] Auto-configuration
- [ ] `@SpringBootApplication`
- [ ] `application.properties`/`application.yml`

### **b. Building REST APIs**
- [ ] `@RestController`, `@GetMapping`, `@PostMapping`, etc.
- [ ] HTTP methods (GET, POST, PUT, DELETE) and status codes

### **c. Data Access**
- [ ] Spring Data JPA
- [ ] Entities, repositories (`CrudRepository`, `JpaRepository`)
- [ ] Query methods

### **d. Spring Boot Actuator**
- [ ] Monitoring and management endpoints

### **e. Testing**
- [ ] Unit tests with JUnit and Mockito
- [ ] Integration tests with `@SpringBootTest`

---

## **4. Database and ORM**

### **a. SQL Basics**
- [ ] Basic SQL queries (SELECT, INSERT, UPDATE, DELETE)
- [ ] Joins, indexes, transactions

### **b. Hibernate (JPA Implementation)**
- [ ] `@Entity`, `@Table`, `@Column`
- [ ] Relationships (`@OneToOne`, `@OneToMany`, `@ManyToMany`)

### **c. Spring Data JPA**
- [ ] Query methods and `@Query` annotations

---

## **5. Build Tools**

### **a. Maven**
- [ ] `pom.xml` and dependency management
- [ ] Building, testing, and packaging

### **b. Gradle (Optional)**
- [ ] Basics of Gradle

---

## **6. Version Control**

### **a. Git**
- [ ] Basic commands (`clone`, `commit`, `push`, `pull`, `branch`, `merge`)
- [ ] GitHub/GitLab for remote repositories

---

## **7. API Documentation**

### **a. Swagger/OpenAPI**
- [ ] Automatically generate API documentation

---

## **8. Security**

### **a. Spring Security**
- [ ] Authentication and authorization
- [ ] JWT (JSON Web Tokens) for stateless authentication

---

## **9. Deployment**

### **a. Packaging**
- [ ] Create JAR/WAR files

### **b. Docker**
- [ ] Containerize your application

### **c. Cloud Deployment**
- [ ] Deploy to AWS, Azure, or Heroku

---

## **10. Advanced Topics**

### **a. Microservices**
- [ ] Spring Boot and Spring Cloud
- [ ] Service discovery, load balancing, API gateways

### **b. Messaging**
- [ ] Kafka or RabbitMQ

### **c. Caching**
- [ ] `@Cacheable` in Spring Boot

### **d. Performance Optimization**
- [ ] Optimize application performance

---

## **11. Tools and IDEs**

### **a. IntelliJ IDEA or Eclipse**
- [ ] Debugging, refactoring, shortcuts

### **b. Postman**
- [ ] Test APIs

### **c. Logging**
- [ ] Logback or Log4j

---

## **12. Practice Projects**

1. **To-Do List Application**: A simple CRUD application.
2. **Blog Platform**: A REST API for creating and managing blog posts.
3. **E-Commerce Application**: User authentication, product management, and order processing.
4. **Weather App**: Fetch and display weather data using a public API.

---

## **13. Resources**

### **Books**
- *Effective Java* by Joshua Bloch
- *Spring in Action* by Craig Walls

### **Online Courses**
- [Spring Boot Tutorial for Beginners](https://www.udemy.com/course/spring-boot-tutorial-for-beginners/) (Udemy)
- [Java Programming Masterclass](https://www.udemy.com/course/java-the-complete-java-developer-course/) (Udemy)

### **Documentation**
- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Java Documentation](https://docs.oracle.com/en/java/)

---

## **14. Community and Practice**

- Join Java and Spring Boot communities on Reddit, Stack Overflow, or Discord.
- Participate in coding challenges on platforms like LeetCode, HackerRank, or Codewars.

---

Good luck with your learning journey! 🚀