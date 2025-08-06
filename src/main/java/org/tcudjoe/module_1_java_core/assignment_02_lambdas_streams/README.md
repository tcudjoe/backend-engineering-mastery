# Assignment 02: Lambdas & Streams in Java

---

## 🧠 What Are Lambdas & Streams?

**Java Lambdas** and the **Streams API** are core parts of Java’s functional programming capabilities introduced in
Java8.

**Lambda Expressions** are anonymous functions that enable you to write cleaner, more concise code.
**Streams API** allows you to process collections of data in a declarative, functional style.
Combined, these tools empower you to transform and filter data pipelines efficiently and readably.

---

## 🌳 Core Concepts & Their Characteristics

| Concept               | Key Feature                                                        | Example Syntax                             |
|-----------------------|--------------------------------------------------------------------|--------------------------------------------|
| Lambda Expressions    | Anonymous functions (parameters -> expression)                     | `(x, y) -> x + y `                         |
| Functional Interfaces | Interfaces with a single abstract method (SAM)                     | `Predicate<T>, Function<T,R>, Consumer<T>` |
| Method References     | Short-hand notation for lambdas calling existing methods           | `String::toUpperCase `                     |
| Streams API           | Pipeline operations on collections for processing and transforming | `stream().filter().map().collect()`        |

---

## ⚙️ Key Stream Operations & When to Use Them

### 🔹 filter()

Filters elements based on a Predicate.

Example: Filter students with a grade > 7.

### 🔹 map()

Transforms each element to another form.

Example: Convert names to uppercase.

### 🔹 reduce()

Aggregates elements into a single result.

Example: Compute sum or average of grades.

### 🔹 collect()

Terminal operation that converts streams to collections.

Example: Collect a list of filtered students.

### 🔹 Optional<T>

A container that may or may not contain a non-null value.

Prevents NullPointerExceptions.

--- 

## 🧮 Important Concepts

### ➤ Functional Interfaces

- Interfaces like `Predicate<T>`, `Function<T, R>`, `Supplier<T>`, and `Consumer<T>` are core to lambdas.

### ➤ Stream Pipelines

- Chains of operations starting from a source (Collection/Array) to terminal operations.
    - Example: `students.stream().filter(...).map(...).collect(...)`

### ➤ Method References

- Replace lambda expressions that simply call a method.
    - Example: `students.forEach(System.out::println);`

### ➤ Lazy Evaluation

- Stream operations are lazy; nothing happens until a terminal operation is invoked.

---

## 📌 Sub-Assignments (Hands-On Functional Programming)

### a. Lambda Basics

- Write a lambda to add two numbers.
- Create a custom functional interface and use it with a lambda.

### b. Stream Fundamentals

- Given a list of numbers, filter even numbers using a stream.
- Map each number to its square.
- Collect the result in a new list.

### c. Data Processing

- Create a Student class (name, age, grade).
- Given a list of students:
- Filter students with grades above 7.
- Map names to uppercase.
- Sort students by name using a stream.

### d. Aggregation with Reduce

- Use `reduce()` to sum all student grades.
- Calculate the average grade manually (or with collect()).

### e. Optional & Search

- Search for a student by name.
- Return an `Optional<Student>`.
- Print `“Student not found”` if empty.

### f. Functional Interfaces in Action

- Use `Predicate<Student>` to filter passed students.
- Use `Function<Student, String>` to extract formatted names.
- Use `Consumer<Student>` to print student details.

### g. Method References

- Replace lambdas with method references wherever possible.
    - Example: `System.out::println` for printing.

### h. Real-World Example

- Build a `StudentDirectoryV2` that:
    - Filters by grade range.
    - Finds the top scorer.
    - Lists names alphabetically.
    - Prints a formatted report using streams.

---

## ✅ Goal of This Assignment

- By the end of this assignment, you should:

    - Understand how lambdas simplify verbose anonymous classes.
    - Be able to build stream pipelines for filtering, transforming, and aggregating data.
    - Use method references effectively.
    - Handle possible null values using Optional<T>.
    - Recognize performance benefits of functional programming in Java.

---

## 💡 Pro Tips

- Chain multiple stream operations for readability.
- Start thinking in terms of **“what” you want to do with data**, not “how” to iterate.
- Use `peek()` in Streams for debugging purposes.
- Remember, not every collection operation needs to be a stream — **use them where they make sense**.