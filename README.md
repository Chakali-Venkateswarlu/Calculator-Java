# 🧮Calculator – Java AWT Scientific and Basic Calculator

## 📋 Project Overview

The **Calculator** is a graphical calculator application built using **Java AWT (Abstract Window Toolkit)**. It supports both **basic arithmetic operations** and a **set of scientific functions**, giving users an intuitive GUI for performing mathematical computations.

This project is ideal for students and Java enthusiasts who want to explore how to build GUI applications using the AWT framework.

---

## 🛠️ Features

### ✅ Basic Calculator Functions
- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`X`)
- Division (`÷`)
- Decimal input (`.`)
- Delete last character (`DEL`)
- Clear input/output (`AC`)
- Equal button to evaluate expressions (`=`)

### 🧮 Scientific Functions
- Factorial (`x!`)
- Square root (`√x`)
- Square (`x²`)
- Logarithm base 10 (`log`)
- Natural logarithm (`ln`)
- Trigonometric functions:
  - Sine (`sin`)
  - Cosine (`cos`)
  - Tangent (`tan`)
  - Inverse sine (`sin-1`)
  - Inverse cosine (`cos-1`)

---

## 🖥️ User Interface

The UI is constructed using Java AWT components like:

- `Frame`
- `TextField`
- `Button`
- Manual component positioning using `setBounds()`

Two text fields are used:
- `t1` – for input expressions
- `t2` – for result display

All buttons are arranged manually and styled using background/foreground colors.

---

## 📁 Project Structure

> 💡 Currently, all logic and layout are implemented in a single file (`Calculator.java`) for simplicity.

---

## 🚀 How to Run the Program

### ✅ Prerequisites
- Java Development Kit (JDK) installed.
- Any terminal or command line interface.

To verify:
```bash
java -version
javac -version
```
To Compile
```bash
javac Calculator.java
```

To Run
```bash
java Calculator
```
👨‍💻 Author
C Venkateswarlu

Developed to demonstrate Java GUI capabilities using AWT.
