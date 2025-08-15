# Module 02: Spring Boot Essentials

---

## 🚀 Overview

Spring Boot is a **Java-based framework** that simplifies the development of **production-ready, standalone
applications.** It builds on top of the Spring Framework and eliminates boilerplate code through **auto-configuration,
starter dependencies**, and a **convention-over-configuration** approach.

In this module, we’ll transition from core Java to **modern backend development** using **Spring Boot**. You’ll learn to
build APIs, manage application layers, and use best practices to develop clean, modular, and scalable services.

---

## 🎯 Learning Goals

- By the end of this module, you’ll be able to:
    - Understand the **Spring ecosystem** and how Spring Boot fits in
    - Build RESTful APIs using **Spring Boot**
    - Create **layered architectures** (Controller → Service → Repository)
    - Use **Spring Data JPA** to interact with databases
    - Handle exceptions using **@ControllerAdvice**
    - Work with **DTOs** and **Model Mapping**
    - Write **unit tests** using JUnit and Mockito
    - Secure your APIs (optional advanced topic)

---

## 📦 Tools & Technologies

| Tool/Tech           | Purpose                                   | 
|---------------------|-------------------------------------------|
| **Java 17+**        | Primary language                          | 
| **Spring Boot**     | Application framework                     | 
| **Maven/Gradle**    | Build tools                               | 
| **Spring Web**      | Build REST APIs                           | 
| **Spring Data JPA** | ORM and database access                   | 
| **H2/PostgreSQL**   | In-memory/local DB                        | 
| **Lombok**          | Reduce boilerplate (getters/setters/etc.) | 
| **ModelMapper**     | DTO-to-Entity conversion                  | 
| **JUnit + Mockito** | Unit testing tools                        | 

---

## 🧱 Module Structure

1. CRUD Operations (Create, Read, Update, Delete)
    - Create RESTful endpoints using @RestController
    - Layered architecture: Controller → Service → Repository
    - Entity modeling and DTO mapping

2. Application Configuration
    - application.yml vs application.properties
    - Profiles (dev, test, prod)
    - Custom config properties using @ConfigurationProperties

3. Error Handling
    - Centralized exception handling using @ControllerAdvice
    - Custom exceptions & error response objects
    - Handling common Spring errors (e.g., validation, 404s)

4. Caching
    - Enable caching with @EnableCaching
    - Use @Cacheable, @CachePut, @CacheEvict
    - In-memory cache with ConcurrentMapCache, Ehcache, or Redis

5. Health Checks & Actuator
    - Integrate Spring Boot Actuator
    - Expose health, info, metrics, and custom endpoints
    - Use /actuator/health, /actuator/metrics, etc.

6. Cross-Cutting Concerns
    - Implement logging, metrics, and auditing
    - Use @Aspect for AOP-based logging
    - Learn how to separate technical concerns from business logic

7. Logging
    - Use SLF4J with Logback for structured logging
    - Customize log levels & formats
    - Log exceptions, method entry/exit, and performance timings

8. Capstone Assignment: Real-World Application
    - Apply everything in a single project
    - Must include: CRUD, error handling, caching, logging, actuator, config
    - Follow clean code and modular design practices

--- 

## 🧠 Key Concepts

| Concept                   | Explanation                                                           | 
|---------------------------|-----------------------------------------------------------------------|
| **Inversion of Control+** | Spring manages object lifecycle via Dependency Injection              | 
| **Annotations**           | `@RestController`, `@Service`, `@Repository`, `@Entity`, `@Autowired` | 
| **Dependency Injection**  | Injecting beans/services via constructor or field                     | 
| **DTO Pattern**           | Prevents exposing internal entity structure in API responses          | 
| **JPA Repositories**      | Auto-generates common DB operations (`findAll`, `save`, etc.)         | 
| **Exception Handling**    | Ensures consistent, user-friendly error messages                      | 
| **Lombok**                | Reduce boilerplate (getters/setters/etc.)                             | 
| **Validation**            | Ensures data correctness before processing                            | 

---

## ✅ What You’ll Build

For each topic, you’ll go through two levels of mastery:

### 1. 🔁 Repeat-Style Assignments

- Focused, hands-on repetition to deeply understand the topic
- These are not mini-projects — they're designed for daily mastery practice

### 2. 📦 Mini Project

- A real-world use case where you implement the topic in a complete feature or service
- These will help you apply what you’ve learned like a backend engineer in a real team

_✨ By the end of this module, you’ll have multiple backend microfeatures you can combine or reuse in full-stack or
portfolio apps._

---

## 📌 Tips for Success

- Focus on clean code and proper structure
- Don’t skip the testing phase — even small unit tests matter
- Use Postman or cURL to test your APIs
- Ask yourself: “Can another dev understand and extend my code?”