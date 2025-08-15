# Assignment 05: Multithreading & Concurrency in Java

## 🧠 What is Multithreading & Concurrency?

**Multithreading** in Java allows multiple threads (smallest units of a process) to run **concurrently** — enabling
**parallel task execution** to utilize CPU resources efficiently.

Java provides a rich set of **APIs, constructs, and frameworks** for writing multi-threaded and thread-safe
applications.

## 🌳 Core Concepts & Terminologies

| Concept               | Key Feature                                               | Example/ Detail                                          |
|-----------------------|-----------------------------------------------------------|----------------------------------------------------------|
| Thread                | Smallest unit of execution within a process               | Created by extending `Thread` or implementing `Runnable` |
| Runnable Interface    | Functional interface for creating tasks                   | Implements `run()` method                                |
| ExecutorService       | Manages thread pools and executes asynchronous tasks      | Better alternative to manually managing threads          |
| Synchronization       | Ensures mutual exclusion to prevent race conditions       | Via `synchronized` blocks or methods                     |
| Locks (ReentrantLock) | Provides more advanced locking than `synchronized`        | Explicit lock/unlock with try-finally                    |
| Volatile Keyword      | Ensures visibility of changes across threads              | Lightweight but doesn’t guarantee atomicity              |
| Atomic Variables      | Provides lock-free thread-safe operations                 | `AtomicInteger`, `AtomicBoolean` etc.                    |
| Futures & Callables   | Asynchronous computation results                          | Submit tasks and retrieve results using `Future`         |
| Deadlocks             | Two or more threads waiting forever on each other’s locks | Critical to detect and avoid                             |

---

## ⚙️ Thread Creation & Management Approaches

| Method                           | Characteristics                                     | Usage Scenario                                   |
|----------------------------------|-----------------------------------------------------|--------------------------------------------------|
| Extending Thread Class           | Simple, but less flexible (no multiple inheritance) | For simple one-off threads                       |
| Implementing Runnable            | More flexible; preferred for task-based threading   | Basic concurrency tasks                          |
| Using Callable & Future          | Supports return values & exceptions                 | For async tasks needing results                  |
| ExecutorService (Thread Pooling) | Efficient thread reuse, lifecycle management        | Scalable multithreaded applications              |
| Fork/Join Framework              | Divide-and-conquer parallelism                      | Large recursive data-processing tasks            |
| CompletableFuture (Java 8+)      | Non-blocking, async result handling                 | Complex async pipelines without blocking threads |

---

## 🧮 Important Concepts

### ➤ Race Conditions & Critical Sections

- Occur when multiple threads access shared data simultaneously, leading to inconsistent results.
- Use synchronization to ensure only one thread modifies critical data at a time.

### ➤ Thread Safety

- Code that behaves correctly when accessed by multiple threads concurrently.
- Achieved through synchronization, locks, immutability, and atomic variables.

### ➤ Deadlocks & Livelocks

- **Deadlock**: Threads wait on each other indefinitely.
- **Livelock**: Threads actively change states but make no progress.
- Avoid through careful resource ordering and using `tryLock()`.

### ➤ Executors vs Threads

- Executors manage thread lifecycle, allow efficient resource utilization.
- Prefer `ExecutorService` for scalable apps instead of manual thread creation.

---

## 📌 Sub-Assignments (Master Threading & Concurrency)

### a. Basic Thread Creation

- Create a simple thread by extending `Thread` class.
- Implement a task using `Runnable`.
- Observe the difference in approach.

### b. ExecutorService Basics

- Create a thread pool using `Executors.newFixedThreadPool()`.
- Submit multiple tasks and observe how threads are reused.
- Shut down the `ExecutorService` properly.

### c. Synchronization & Race Conditions

- Simulate a bank account where multiple threads deposit/withdraw money.
- Observe inconsistent results without synchronization.
- Fix the issue using `synchronized` blocks/methods.

### d. ReentrantLock Demo

- Rewrite the bank account example using `ReentrantLock` instead of `synchronized`.
- Demonstrate try-finally usage to avoid deadlocks.

### e. Callable & Future Example

- Create tasks that compute factorials using `Callable`.
- Retrieve results asynchronously using `Future`.

### f. Deadlock Simulation & Resolution

- Write a program that intentionally deadlocks by acquiring locks in reverse order.
- Fix it by enforcing a consistent locking order.

### g. Atomic Variables

- Use `AtomicInteger` to perform thread-safe increments without explicit locking.
- Compare performance against a synchronized version.

### h. CompletableFuture Chain (Optional Advanced)

- Build an async pipeline where data flows through multiple CompletableFutures.
- Handle both success and failure scenarios.

### i. Order Processing System

- Simulate an **Order Processing System** where:
    - Orders are processed concurrently.
    - Payment and inventory updates are done in parallel using `CompletableFuture`.
    - Thread-safety is ensured in shared inventory data.

## ✅ Goal of This Assignment

- By the end of this assignment, you should:
    - Be comfortable **creating and managing threads**.
    - Understand **thread safety**, synchronization, and race condition handling.
    - Use **ExecutorService** for scalable thread management.
    - Handle async task results using Future and **Callable**.
    - Recognize and avoid **deadlocks** and **livelocks**.
    - Apply modern async patterns with **CompletableFutures**.

## 💡 Pro Tips

- Prefer **ExecutorService** over manual thread management for anything beyond basic threading.
- Use **immutable data structures** where possible to minimize synchronization needs.
- Always acquire multiple locks in a **consistent global order** to prevent deadlocks.
- Visualize thread execution using a **Thread Visualizer** or simple debug prints.
- Start small with concurrency — multithreading bugs are hard to catch but critical to fix early.