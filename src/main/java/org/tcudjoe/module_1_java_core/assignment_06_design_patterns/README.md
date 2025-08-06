# Assignment 06: Design Patterns & SOLID Principles in Java

---

## 🧠 What are Design Patterns?

**Design Patterns** are **proven solutions to common software design problems**. They represent best practices that
experienced object-oriented software developers follow to solve recurring design issues in a **scalable, reusable, and
maintainable** way.

Java, being an object-oriented language, heavily benefits from applying these patterns to produce **clean, modular, and
extendable codebases**.

---

## 🌳 SOLID Principles (Foundation for Good Design)

| Principle                     | Description                                                       | Example                                                  |
|-------------------------------|-------------------------------------------------------------------|----------------------------------------------------------|
| **S** – Single Responsibility | A class should have only one reason to change                     | Separate user authentication and user profile management |
| **O** – Open/Closed           | Classes should be open for extension, but closed for modification | Use interfaces or abstract classes                       |
| **L** – Liskov Substitution   | Subtypes should be substitutable for their base types             | Derived classes should not break parent class contracts  |
| **I** – Interface Segregation | No client should be forced to implement methods it doesn't use    | Split fat interfaces into smaller ones                   |
| **D** – Dependency Inversion  | Depend on abstractions, not on concrete implementations           | Use dependency injection                                 |

---

## ⚙️ Core Design Patterns & When to Use Them

| Pattern Type   | Example Patterns                      | Use Cases                                                     |
|----------------|---------------------------------------|---------------------------------------------------------------|
| **Creational** | Singleton, Factory, Builder           | Object creation logic decoupled from business logic           |
| **Structural** | Adapter, Decorator, Facade            | Composing classes and objects for flexibility and reuse       |
| **Behavioral** | Strategy, Observer, Command, Template | Method Assigning responsibilities between objects dynamically |

---

### 🔹 Singleton Pattern

- Ensures a class has only **one instance** and provides a global point of access.
- Used for c**onfigurations, logging, caching** etc.

### 🔹 Factory Pattern

- Defines an interface for creating objects, but lets subclasses alter the type of objects that will be created.
- Promotes **loose coupling** between client code and object creation logic.

### 🔹 Builder Pattern

- Simplifies creation of complex objects step-by-step.
- Used for constructing immutable objects with many parameters.

### 🔹 Strategy Pattern

- Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- Promotes **open/closed principle** by allowing runtime algorithm selection.

### 🔹 Observer Pattern

- Establishes a **publisher-subscriber** relationship.
- When an object changes state, its dependents are notified automatically.

---

## 🧮 Important Concepts

### ➤ Composition over Inheritance

- Favor **object composition** to achieve code reuse and flexibility rather than deep inheritance trees.

### ➤ Dependency Injection (DI)

- A technique where an object’s dependencies are passed in from the outside, promoting **loose coupling** and easier
  testing.

### ➤ Anti-Patterns to Avoid

- **God Objects**: Classes that know too much or do too much.
- **Tight Coupling**: Code directly dependent on specific implementations.
- **Overengineering**: Applying patterns where simple solutions suffice.

---

## 📌 Sub-Assignments (Build Mastery of Patterns & Principles)

### a. Singleton Logger

- Implement a thread-safe Singleton Logger class.
- Ensure only one instance is created even in multi-threaded environments.
- Add methods like `logInfo()`, `logError()` etc.

### b. Factory Shape Creator

- Design a `ShapeFactory` that returns different `Shape` objects (`Circle`, `Square`, `Triangle`) based on input.
- Demonstrate usage in client code without knowing concrete classes.

### c. Builder Pattern for Complex Object

- Create a `User` object with optional parameters using the Builder pattern.
- Ensure immutability of the User object.

### d. Strategy Pattern Payment Processor

- Implement a `PaymentProcessor` that can accept multiple payment strategies (CreditCard, PayPal, Crypto).
- Demonstrate changing strategy at runtime.

### e. Observer Pattern Stock Price Notifier

- Create a `StockMarket` subject that notifies observers (like TradingBot, UserDashboard) whenever stock prices change.
- Add/Remove observers dynamically.

### f. Dependency Inversion Demo

- Refactor a tightly coupled class to follow the Dependency Inversion Principle.
- Use constructor injection to inject dependencies.

### g. SOLID Violations & Refactoring

- Write a class that violates at least 3 SOLID principles.
- Refactor the code to adhere to SOLID.

### h. Notification Service

- Build a **Notification Service** where:
    - The service supports Email, SMS, and Push notifications using the **Strategy Pattern**.
    - Observers can subscribe to notifications (Observer Pattern).
    - Use a **Factory Pattern** to decide which type of notification to send.
    - Configuration is held in a Singleton.

---

## ✅ Goal of This Assignment

- By the end of this assignment, you should:
    - Understand **when and why to apply SOLID principles**.
    - Be fluent in creating and applying common **creational, structural, and behavioral patterns**.
    - Recognize code smells and apply design patterns to solve them.
    - Build modular, testable, and scalable systems using **pattern-driven design**.
    - Be able to identify anti-patterns and refactor code effectively.

## 💡 Pro Tips

- Don’t force a design pattern; patterns should solve a real problem.
- Design Patterns are **language-agnostic** — understanding the problem they solve is more important than code syntax.
- Practice **real-world use cases**; avoid textbook-only implementations.
- Use **UML diagrams** to visualize how patterns interact with each other.
- Master **SOLID** — most patterns are easier to understand once you grasp SOLID principles.