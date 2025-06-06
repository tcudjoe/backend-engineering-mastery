# Assignment 01: Java Collections

---

## 🧠 What Are Collections?

Java Collections are **data structures** that help you **store, retrieve, manipulate, and communicate aggregate data** —
like lists of users, sets of IDs, or maps of configurations.

The **Collections Framework** is a unified architecture that includes:

- **Interfaces** like `List`, `Set`, `Map`, `Queue`
- **Implementations** like `ArrayList`, `HashSet`, `HashMap`, `PriorityQueue`
- **Algorithms** (like sorting and searching) defined in `Collections` and `Arrays` utility classes

---

## 🌳 Core Interfaces & Their Characteristics

| Interface | Key Feature                                    | Example Implementations               |
|-----------|------------------------------------------------|---------------------------------------|
| `List`    | Ordered, indexed, allows duplicates            | `ArrayList`, `LinkedList`             |
| `Set`     | No duplicates, no guaranteed order (or sorted) | `HashSet`, `LinkedHashSet`, `TreeSet` |
| `Map`     | Key-value pairs, no duplicate keys             | `HashMap`, `TreeMap`, `LinkedHashMap` |
| `Queue`   | FIFO behavior, supports ordering               | `LinkedList`, `PriorityQueue`         |

---

## ⚙️ Key Implementations & When to Use Them

### 🔹 `ArrayList`

- Backed by an array
- Fast **random access**
- Slower **inserts/removals** in the middle

### 🔹 `LinkedList`

- Elements linked via nodes
- Fast **inserts/removals**, slower random access

### 🔹 `HashSet`

- No duplicates, no ordering
- Backed by a `HashMap`
- Fast lookup

### 🔹 `TreeSet`

- Sorted order (natural or comparator-based)
- Slower due to sorting (Red-Black Tree)

### 🔹 `HashMap`

- Key-value storage
- Fast access via hashing
- Keys must be unique

### 🔹 `TreeMap`

- Sorted map keys
- Slower than `HashMap`, but ordered

---

## 🧮 Important Concepts

### ➤ Autoboxing

- Primitive types are automatically wrapped/unwrapped (`int → Integer`) in collections

### ➤ Generics

- Use angle brackets (`<T>`) to define data types: `List<String>`, `Map<String, Integer>`

### ➤ Comparator vs Comparable

- Use `Comparable<T>` for natural sorting (in the class itself)
- Use `Comparator<T>` for external/custom sorting logic

### ➤ Iteration Techniques

- `for`, `for-each`, `Iterator`, `ListIterator`, `Streams`

### ➤ Performance Considerations

- Know time complexity: `ArrayList.get()` is O(1), `LinkedList.get()` is O(n)

---

## 📌 Sub-Assignments (Repeat-Until-You-Dream Style)

### a. Create & Manipulate Lists

- Create an `ArrayList<String>` of names
- Add, remove, get, and set elements
- Iterate using `for`, `for-each`, `iterator`
- Sort the list alphabetically

### b. Create & Use Sets

- Use `HashSet<Integer>` to store unique IDs
- Try adding duplicates and observe behavior
- Convert a `List` to a `Set` to remove duplicates
- Sort a `Set` using a `TreeSet`

### c. Play With Maps

- Create a `HashMap<String, Integer>` for product prices
- Retrieve, update, and remove items
- Loop through `entrySet()` and print key-values
- Replace with a `TreeMap` and sort keys alphabetically

### d. Use Generics

- Create a method `printList(List<T>)` that prints any type of list
- Understand how wildcards work: `List<?>`, `List<? extends Number>`

### e. Compare & Sort Objects

- Create a `User` class with `name` and `age`
- Implement `Comparable<User>` to sort by age
- Create a `Comparator<User>` to sort by name

### f. Collections Utilities

- Use `Collections.sort`, `Collections.shuffle`, `Collections.max`
- Reverse a list
- Create an immutable list with `List.of(...)`

### g. Performance Check

- Compare performance of `ArrayList` vs `LinkedList` for inserting 1M elements
- Compare `HashMap` and `TreeMap` in lookup time

### h. Real-World Example

- Build a `StudentDirectory` class that allows you to:
    - Add students (name, ID)
    - Remove them
    - Search by name or ID
    - List all sorted by name

---

## ✅ Goal of This Assignment

By the end of this assignment, you should:

- Know when and why to use each Collection type
- Be fluent in iteration, sorting, and manipulating data structures
- Understand collection performance tradeoffs
- Write generic, reusable code with collections

---

## 💡 Pro Tips

- **Reread your code** aloud and ask: “Would this make sense to another dev?”
- Use a **Java visualizer** to see how Lists, Maps, and Sets behave under the hood
- Practice daily with real-world metaphors (shopping cart = List, dictionary = Map)

---
