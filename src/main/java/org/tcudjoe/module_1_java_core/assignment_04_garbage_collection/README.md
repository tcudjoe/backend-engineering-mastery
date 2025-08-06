# Assignment 04: Garbage Collection in Java

---

## 🧠 What Is Garbage Collection?

**Garbage Collection (GC)** is Java’s **automatic memory management mechanism** that identifies and removes objects **no
longer in use**, freeing up memory and preventing leaks.

Unlike languages like C/C++, where you manually manage memory (`malloc`/`free`), Java handles this for you through its
**Garbage Collector**, ensuring more reliable and safer memory handling.

---

## 🌳 Core Concepts & Their Characteristics

| Concept                            | Key Feature                                               | Example/ Detail                                    |
|------------------------------------|-----------------------------------------------------------|----------------------------------------------------|
| Heap Memory                        | Where all objects are stored                              | Divided into Young Generation & Old Generation     |
| Young Generation (Eden + Survivor) | Where new objects are created (short-lived)               | Frequent minor collections                         |
| Old Generation (Tenured)           | Long-lived objects moved here after surviving GC cycles   | Less frequent but more expensive to collect        |
| Minor GC                           | Cleans up Young Generation                                | Fast and frequent                                  |
| Major (Full) GC                    | Cleans up Old Generation (and entire heap if needed)      | Slower, but reclaims significant memory            |
| Mark-and-Sweep Algorithm           | Marks live objects, sweeps unreferenced ones              | Core process of garbage collection                 |
| Stop-the-World Event               | Pauses application threads during GC cycle                | Essential for consistency but may cause pauses     |
| Reference Types                    | Strong, Soft, Weak, Phantom references affect GC behavior | Soft/Weak references can be GC’d more aggressively |

---

## ⚙️ Garbage Collector Implementations in Java

| GC Type                  | Characteristics                                  | Usage Scenario                                       |
|--------------------------|--------------------------------------------------|------------------------------------------------------|
| Serial GC                | Single-threaded, suitable for small applications | Low-memory, single-core environments                 |
| Parallel GC (Throughput) | Multi-threaded, focuses on maximizing throughput | High CPU, batch-processing systems                   |
| G1 (Garbage First) GC    | Splits heap into regions, low pause times        | Balanced choice for apps needing predictable latency |
| ZGC / Shenandoah GC      | Ultra-low pause, concurrent collection           | Large heaps with real-time requirements              |

---

## 🧮 Important Concepts

### ➤ Strong vs. Weak References

- **Strong**: Regular object references; GC will never reclaim these.
- **Soft**: Reclaimed only if memory is low.
- **Weak**: Reclaimed eagerly on next GC cycle.
- **Phantom**: Used for post-mortem cleanup actions.

### ➤ Memory Leaks in Java

- Occurs when objects are still referenced (even unintentionally) but are no longer needed.
- Common with static references or poorly managed collections.

### ➤ Finalization & Cleaner

- **`finalize()`** method: Legacy, unreliable.
- **Cleaner API**: Modern alternative to clean up resources.

---

## 📌 Sub-Assignments (Get Hands-On with Memory!)

### a. Observing GC Logs

- Enable GC logs in a simple program using `-verbose:gc` flag.
- Observe minor and major collections happening as you create many objects.

### b. Forcing Garbage Collection (For Experiment)

- Create a program that allocates large objects.
- Suggest GC with `System.gc()` (though it's just a suggestion).
- Monitor memory usage before and after GC.

### c. Strong vs Weak Reference Demo

- Create a `WeakReference` to an object.
- Nullify the strong reference and force GC.
- Check if the weak reference has been cleared.

### d. Memory Leak Simulation

- Create a program where objects are added to a static `List` and never removed.
- Observe how heap usage keeps increasing.
- Identify and fix the memory leak.

### e. Try Different Garbage Collectors (Optional Advanced)

- Run the same memory-intensive program with:
    - `XX:+UseSerialGC`
    - `XX:+UseParallelGC`
    - `XX:+UseG1GC`
- Compare GC behavior and log outputs.

### f. Real-World Example

- Build a **Cache System** that:
    - Stores items with **Soft References** to allow GC when memory is low.
    - Implements a manual cleanup mechanism using **WeakHashMap**.

## ✅ Goal of This Assignment

- By the end of this assignment, you should:
    - Understand **how Java manages memory** under the hood.
    - Know the **different GC algorithms** and when they’re used.
    - Differentiate between **reference types** and their GC impact.
    - Recognize symptoms of **memory leaks** and avoid common pitfalls.
    - Be able to configure basic GC options for your applications.

## 💡 Pro Tips

- Use tools like **VisualVM, JConsole, or Eclipse Memory Analyzer (MAT)** to visualize heap usage.
- Don’t rely on `System.gc()` — it's just a suggestion.
- Understand that **minimizing object references** is key to reducing GC overhead.
- Design data structures carefully (use `WeakHashMap` where appropriate).
- Avoid overusing static variables that hold large collections unless absolutely necessary.