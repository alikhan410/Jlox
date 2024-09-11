# JLox - Java Interpreter (In Progress)

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
    javac -d bin src/com/lox/*.java
    ```

3. Run the interpreter:

    ```bash
    java -cp bin com.lox.Lox
    ```

### Running Tests

To be added.

## Project Structure

```
lox/
│
├── .idea/
├── out/
├── src/
│   └── com/
│       └── lox/
│           ├── tool/
│           │   └── GenerateAst.java
│           ├── Environment.java
│           ├── Expr.java
│           ├── Interpreter.java
│           ├── Lox.java
│           ├── LoxCallable.java
│           ├── LoxClass.java
│           ├── LoxFunction.java
│           ├── LoxInstance.java
│           ├── Parser.java
│           ├── Resolver.java
│           ├── Return.java
│           ├── RuntimeError.java
│           ├── Scanner.java
│           ├── Stmt.java
│           ├── Token.java
│           └── TokenType.java
├── .gitignore
├── code.lox
└── README.md
```

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests to help improve the project.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
