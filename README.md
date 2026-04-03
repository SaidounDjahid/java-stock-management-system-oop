# java-stock-management-system-oop
Java OOP stock management system with Swing GUI and UML-based design.
# 📦 Stock Management System (Java / OOP / Swing)

A Java-based stock management application built using Object-Oriented Programming principles and a graphical user interface (Swing).

This project was developed as part of an academic module at USTHB and demonstrates core software engineering concepts including OOP design, UML modeling, and event-driven programming.

---

## 🚀 Features

- Product management (add, update, display)
- Separation between available and sold products
- Warranty validation based on sale date
- Filtering by customer and date
- Stock statistics (sales rate calculation)
- Interactive graphical user interface (Java Swing)

---

## 🧠 Key Concepts

- Object-Oriented Programming (OOP)
- Inheritance (Produit → ProduitDispo / ProduitVendu)
- Interface implementation (`Statistique`)
- Encapsulation (getters / setters)
- UML modeling and reverse engineering
- Event-driven programming (Swing)

---

## 🏗️ Architecture Overview

The system is structured around the following core components:

### 🔹 Produit (Base Class)
- Common attributes: name, code, warranty duration
- Base class for all product types

### 🔹 ProduitDispo
- Represents available products in stock
- Adds storage location information

### 🔹 ProduitVendu
- Represents sold products
- Includes sale date and client code
- Implements warranty validation logic

### 🔹 Stock
- Manages all products
- Tracks available and sold items
- Implements sales statistics via `Statistique` interface

### 🔹 Statistique (Interface)
- Defines `pourcentageVente()` method
- Calculates stock sales rate

### 🔹 Menu (GUI)
- Built with Java Swing
- Handles user interactions and actions
- Provides access to all system functionalities

---

## 🖥️ User Capabilities

- Initialize stock with products
- Add and modify product data
- Display sold products after a given date
- Check products under warranty
- Filter products by client
- Calculate stock performance (sales rate)

---

## ⚙️ Technologies

- Java
- Swing (GUI)
- UML (ObjectAid)
- OOP Design

---

## ▶️ How to Run

### 1. Compile the project
```bash
javac *.java
2. Run the application
java Menu
📁 Project Structure
/src
 ├── Produit.java
 ├── ProduitDispo.java
 ├── ProduitVendu.java
 ├── Stock.java
 ├── Statistique.java
 ├── Menu.java
🎓 Academic Context

Developed at USTHB (University of Science and Technology Houari Boumediene)

Team:

Djahid Saidoun
Mounira Ameur
📄 Documentation

Project report available in the repository, including:

UML diagrams
System design
Implementation details
⚠️ Disclaimer

This project was developed for educational purposes and demonstrates core concepts of object-oriented design and application development.

👨‍💻 Authors
Djahid Saidoun
Mounira Ameur
