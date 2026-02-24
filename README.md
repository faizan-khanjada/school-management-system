# School Management System (Java)

A **console-based School Management System** developed using **Core Java** concepts.  
This project demonstrates **Object-Oriented Programming (OOP)** principles and basic data management using arrays.

---

## 📌 Features

- Manage **Students**, **Teachers**, and **Subjects**
- Add, update, and delete records
- Mark student attendance
- Store and calculate student grades
- Display student percentage and details
- Menu-driven console interface

---

## 🛠️ Technologies Used

- **Java (Core Java)**
- **OOP Concepts**
    - Inheritance
    - Encapsulation
    - Polymorphism
- **Arrays** for data storage
- **Scanner** for user input

---

## 🧩 Project Structure


```text
School-Management-System/
│
├── src/
│   ├── model/
│   │   ├── Person.java      # Base class
│   │   ├── Student.java     # Student entity
│   │   ├── Teacher.java     # Teacher entity
│   │   └── Subject.java     # Subject entity
│   │
│   ├── service/
│   │   └── School.java      # Core management logic
│   │
│   └── Main.java            # Entry point of the application
│
└── README.md
```
---

## 🔗 Class Relationship Overview

```text
Person
 ├── Student
 └── Teacher

School → Manages Students, Teachers, Subjects
Main → Entry Point

```
---

## 🚀 How to Run the Project

1. Clone or download the repository
2. Open the project in **IntelliJ IDEA** or **Eclipse**
3. Ensure **JDK** is properly configured
4. Run the `Main.java` file
5. Follow the on-screen menu instructions

---

## 📖 Key Concepts Demonstrated

- **Inheritance**: `Student` and `Teacher` extend `Person`
- **Encapsulation**: Private fields with getters and setters
- **Method Overriding**: Custom `toString()` implementation
- **Array Manipulation**: Add, update, delete using shifting logic
- **Menu-driven program design**

---

## ⚠️ Limitations

- Uses fixed-size arrays (no dynamic resizing)
- Data is stored in memory only (no database or file storage)
- Console-based user interface

---

## 🔮 Possible Enhancements

- Replace arrays with `ArrayList`
- Add file or database persistence
- Implement GUI using **JavaFX** or **Swing**
- Improve input validation and error handling

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

⭐ Feel free to fork this repository and enhance it further!
