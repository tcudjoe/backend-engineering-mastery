# Capstone Project – School Management System

---

## 🏫 Project Overview

This Capstone Project will bring together everything you've learned from **Java Core, Collections, Exception Handling,
OOP
Principles, Design Patterns,** and **SOLID Principles** to build a **School Management System**.

The goal is to design and build a **console-based mini-application** that simulates key school operations like:

- Student Management
- Course Management
- Grade Tracking
- Attendance Logging

You’ll apply **real-world coding practices** to architect a modular, scalable, and maintainable system.

--- 

## 🌳 Project Architecture (Layered Approach)

| Layer                      | Responsibility                                               |
|----------------------------|--------------------------------------------------------------|
| **Model Layer (Entities)** | Represents core data structures (Student, Course, Teacher)   | 
| **Service Layer**          | Business logic (registering, enrolling, grading, attendance) | 
| **DAO Layer (Optional)**   | Manages data storage (in-memory Lists/Maps for now)          | 
| **Utility Layer**          | Helper classes (InputValidator, DataLoader)                  | 
| **Main App (Controller)**  | Acts as the entry point, user interface (console menus)      | 

---

## ⚙️ Required Features & Concepts Applied

| Feature                                                | Concepts Involved                                                       |
|--------------------------------------------------------|-------------------------------------------------------------------------|
| **Student Directory**                                  | Collections (List, Map), OOP (Encapsulation)                            | 
| **Course Registration & Enrollment**                   | Generics, Collections, Exception Handling                               | 
| **Grade Assignment & Retrieval**                       | Maps, Data Access Layer, Design Patterns (Factory for creating reports) | 
| **Attendance Logging System**                          | Sets, Streams API, Exception Handling                                   | 
| **Search & Sort Functionalities**                      | Comparator, Comparable, Collections Utility Methods                     | 
| **Logging System (Singleton Pattern)**                 | Singleton Pattern, Lazy Initialization, Thread-Safety                   | 
| **User Interaction Menu (Controller)**                 | Switch-Case Control Flow, Modular Code Architecture                     | 
| **Notification Service (Observer Pattern)**            | Observer Pattern — Notify Teachers when students miss classes           | 
| **Service Layer Dependency Injection**                 | Dependency Inversion Principle, Constructor Injection                   | 
| **Custom Exceptions (e.g., StudentNotFoundException)** | Exception Handling, Clean Code Practices                                | 

---

## 📌 Sub-Assignments (Milestones)

### a. Model Creation

- Define `Student`, `Teacher`, `Course`, `Grade`, `AttendanceRecord` classes.
- Use **encapsulation** with private fields and public getters/setters.
- Apply `toString()`, `equals()`, and `hashCode()` methods correctly.

### b. Collections in Action

- Use **ArrayLists** for student/course directories.
- Use **HashMaps** to track grades (e.g., `<Student, Map<Course, Grade>>`).
- Use **TreeSets** for ordered attendance records.

### c. Exception Handling & Custom Exceptions

- Create custom exceptions like `StudentNotFoundException`, `CourseFullException`.
- Implement proper `try-catch-finally` blocks to handle erroneous operations.
- Throw exceptions with meaningful messages when invalid actions occur.

### d. Implement Design Patterns

- **Singleton**: Centralized Logger or Configuration Manager.
- **Factory Pattern**: For generating various types of reports (AttendanceReport, GradeReport).
- **Observer Pattern**: Notify teachers when students fall below attendance threshold.
- **Strategy Pattern (Optional)**: Different grading schemes (Percentage-based, Grade-letter-based).

### e. Functional Programming with Streams & Lambdas

- Filter students based on GPA.
- Sort courses alphabetically or by capacity.
- Aggregate attendance percentages per student using `Stream` operations.

### f. Real-Time Data Flow Simulation (Console UI)

- Build a console menu to navigate through:
    - Adding Students/Courses
    - Enrolling Students
    - Assigning Grades
    - Viewing Attendance & Grades Reports
- Follow clean separation of concerns (Controller → Service → Model).

---

## ✅ Goals of This Capstone Assignment

- By completing this project, you should:
    - Be able to design a **modular system architecture**.
    - Write clean, maintainable code that adheres to **OOP principles** and **SOLID**.
    - Combine **Java Collections, Exception Handling, Design Patterns**, and **Functional Programming** into one
      cohesive application.
    - Simulate **real-world project structures** like MVC-ish patterns and layered architecture.
    - Build a small-scale **production-like codebase** — preparing you for larger systems (Spring Boot microservices
      later).

---

## 💡 Pro Tips

- Structure your project into **packages** (`models`, `services`, `utilities`, `exceptions`, etc.).
- Write **small, focused methods** — don’t cram everything into `main()`.
- For every class you write, ask yourself: “**Does this follow Single Responsibility?**”
- Add **meaningful log statements** using your Singleton Logger.
- Focus on **code readability** over fancy tricks; maintainability wins in production.
- Don't overcomplicate — start small and refactor as you iterate.

---

## 🚀 Optional Enhancements (For Extra Mastery)

- Implement file-based persistence (saving/loading data from JSON or CSV).
- Add a **Simple Authentication System** (username/password for teachers).
- Implement **unit tests** for services _(will be touched later)_.
- Add **dependency injection manually** to simulate frameworks like Spring _(will be touched later)_.