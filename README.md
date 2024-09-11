# JLox - Java Interpreter

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## Overview

**JLox** is an interpreter for the Lox programming language, implemented in Java. This project is based on the book *Crafting Interpreters* by Robert Nystrom.

## Features

- **Lexical Analysis (Scanner):** Tokenizes the source code into meaningful symbols for further processing.
- **Parsing (AST):** Converts tokens into an Abstract Syntax Tree (AST) to represent the structure of the code.
- **Expression Handling:** Supports parsing and handling of various expressions.
- **Statement Execution:** Executes control flow statements such as `if`, `while`, and `for` loops.
- **Error Handling:** Provides both compile-time (syntax) and runtime error handling with meaningful messages.
- **Function and Class Support:** Implements functions, closures, and user-defined classes for object-oriented programming.
- **Scope Resolution:** Handles variable scoping with lexical scopes and manages function closures.
- **Interpreter:** Evaluates and executes Lox code by walking through the AST and interacting with the environment.
- **Return Statements:** Supports early returns from functions using `return` statements.
- **Runtime Error Management:** Handles runtime errors gracefully, preventing the interpreter from crashing.
- **Callable Functions:** Implements callable objects, allowing for function invocation and method calls.
- **Native Support for Data Types:** Built-in support for data types like strings, numbers, booleans, and `nil`.
- **Memory Management:** Implements garbage collection for managing object and variable lifetimes.
- **REPL (Read-Eval-Print Loop):** Provides an interactive prompt for users to test and run Lox code dynamically.
- **Built-in Functions:** Provides utility functions like `print()` for displaying output directly in the Lox language.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/alikhan410/jLox.git
    cd JLox
    ```

2. Compile the project:

    ```bash
    javac -encoding UTF-8 -d bin src/com/lox/*.java
    ```

3. Run the interpreter with test file:

    ```bash
    java -cp bin src.com.lox.Lox code.lox   
    ```



# Lox Language Guide

## Basic Syntax

### Variables

In Lox, you can declare variables using the `var` keyword. Lox supports dynamic typing, so you don’t need to specify the type of the variable.

```lox
// Declaring and initializing variables
var name = "Alice";
var age = 30;

// Printing variables
print name; // Output: Alice
print age;  // Output: 30
```

### Functions

Functions in Lox are defined using the `fun` keyword. Functions can take parameters and return values.

```lox
// Defining a function
fun greet(name) {
    print "Hello, " + name + "!";
}

// Calling the function
greet("Bob"); // Output: Hello, Bob!
```

### Classes

Lox supports object-oriented programming with classes. You can define classes and create instances of them.

```lox
// Defining a class
class Person {
    // Constructor
    init(name, age) {
        this.name = name;
        this.age = age;
    }

    // Method
    greet() {
        print "Hi, I'm " + this.name + " and I'm " + this.age + " years old.";
    }
}

// Creating an instance of the class
var person = Person("Charlie", 25);
person.greet(); // Output: Hi, I'm Charlie and I'm 25 years old.
```

### Control Flow

Lox supports standard control flow statements like `if`, `else`, and `while`.

```lox
// Using if-else statements
var number = 10;

if (number > 0) {
    print "Number is positive.";
} else {
    print "Number is not positive.";
}

// Using while loop
var i = 0;
while (i < 5) {
    print i;
    i = i + 1;
}
```

## Example Script

Here is a complete example script demonstrating variables, functions, and classes:

```lox
// example.lox

// Variables
var greeting = "Hello";
var count = 3;

// Function
fun repeatMessage(message, times) {
    var result = "";
    while (times > 0) {
        result = result + message + " ";
        times = times - 1;
    }
    return result;
}

// Class
class Animal {
    init(name) {
        this.name = name;
    }

    speak() {
        print this.name + " says: Woof!";
    }
}

// Using the function
print repeatMessage(greeting, count); // Output: Hello Hello Hello 

// Using the class
var dog = Animal("Buddy");
dog.speak(); // Output: Buddy says: Woof!
```

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests to help improve the project.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
