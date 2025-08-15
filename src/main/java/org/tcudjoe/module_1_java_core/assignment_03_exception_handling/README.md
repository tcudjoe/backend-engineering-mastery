# Assignment 03: Exception Handling in Java

---

## 🧠 What Are Exceptions?

**Exceptions** are unexpected events or errors that disrupt the normal flow of a program's execution.
Java provides a robust mechanism to handle these situations gracefully, ensuring the program doesn't crash and can
recover or fail elegantly.

---

## 🌳 Core Concepts & Their Characteristics

| Concept              | Key Feature                                                                   | Example Syntax                              |
|----------------------|-------------------------------------------------------------------------------|---------------------------------------------|
| Checked Exceptions   | Must be declared or handled (`IOException`, `SQLException`)                   | `try { ... } catch (IOException e) { ... }` |
| Unchecked Exceptions | Runtime exceptions (`NullPointerException`, `ArrayIndexOutOfBoundsException`) | No compile-time requirement to handle       |
| try-catch block      | Code that may throw an exception wrapped in try, handled in catch             | `try { ... } catch (Exception e) { ... }`   |
| finally block        | Executes code regardless of whether an exception occurred                     | `finally { ... }`                           |
| throw statement      | Manually throw an exception                                                   | `throw new IllegalArgumentException();`     |
| throws keyword       | Declares that a method might throw exceptions                                 | `public void readFile() throws IOException` |

---

## ⚙️ Key Practices & When to Use Them

### 🔹 Catching Specific Exceptions

- Always catch the most specific exception first.
    - Example: Catch `FileNotFoundException` before `IOException`.

### 🔹 Custom Exceptions

- Create your own exception classes for domain-specific errors.
    - Example: `InsufficientBalanceException`.

### 🔹 Exception Chaining

- Wrap lower-level exceptions into higher-level ones.
- Helps maintain abstraction layers in applications.

### 🔹 finally Block

- Always execute cleanup code (like closing files or DB connections).

---

## 🧮 Important Concepts

### ➤ Checked vs Unchecked

- **Checked**: Must be handled or declared.
- **Unchecked**: Optional to handle but still critical (NullPointer, Arithmetic).

### ➤ Best Practices

- Don’t use exceptions for normal control flow.
- Always clean up resources in a **finally block** or use **try-with-resources**.
- Always log exceptions for debugging purposes.

### ➤ Multi-Catch Block

- Catch multiple exceptions in one block using the `|` operator.
    - Example: `catch (IOException | SQLException e) { ... }`

### ➤ Try-With-Resources

- Auto-closes resources implementing `AutoCloseable`.
    - Example: `try (BufferedReader br = new BufferedReader(...)) { ... }`

---

## 📌 Sub-Assignments (Mastering Safe Code Execution)

### a. Basic Exception Handling

- Create a method that divides two numbers.
- Handle division by zero with a custom message.

### b. Checked Exception Handling

- Read from a file and handle `IOException`.
- Display a message if file not found.

### c. Custom Exceptions

- Create a custom exception: `InvalidAgeException`.
- Write a method that throws this exception if age < 18.

### d. Exception Chaining

- Write a method that simulates a database call.
- Catch a `SQLException` and throw a custom `DataAccessException`, passing the original cause.

### e. Multi-Catch & Finally

- Write a method that can throw `IOException` or `NumberFormatException`.
- Use a multi-catch block to handle both.
- Add a `finally` block that prints "Operation Completed".

### f. Try-With-Resources

- Read lines from a file using try-with-resources.
- Ensure the file is always closed properly.

### g. Real-World Example

- Build a BankAccount class that:
    - Has a withdraw method throwing `InsufficientFundsException`.
    - Catches any invalid operations with proper user-friendly messages.
    - Logs every exception thrown.

---

## ✅ Goal of This Assignment

- By the end of this assignment, you should:
    - Differentiate between checked and unchecked exceptions.
    - Gracefully handle errors using try-catch-finally.
    - Write and use custom exception classes.
    - Understand exception chaining for abstraction.
    - Use try-with-resources to avoid resource leaks.

---

## 💡 Pro Tips

- Never leave a catch block empty — at minimum, log the exception.
- Always prefer specific exception types over generic ones.
- Understand that unchecked exceptions (like NPEs) are often bugs.
- Use unit tests to simulate and verify exception scenarios.