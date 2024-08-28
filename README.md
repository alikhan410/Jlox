# JLox - Java Interpreter (In Progress)

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## Overview

**JLox** is an interpreter for the Lox programming language, implemented in Java. This project is based on the book *Crafting Interpreters* by Robert Nystrom. The interpreter is currently a work in progress, focusing on building a scanner, parsing expressions, and generating an abstract syntax tree (AST).

## Features

- **Lexical Analysis (Scanner):** Tokenizes the source code into meaningful symbols for further processing.
- **Parsing (AST):** Converts tokens into an Abstract Syntax Tree (AST) to represent the structure of the code.
- **Expression Handling:** Supports parsing and handling of various expressions.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher
- **Maven:** For managing dependencies (optional)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/JLox.git
    cd JLox
    ```

2. Compile the project:

    ```bash
    javac -d bin src/com/lox/*.java
    ```

3. Run the interpreter:

    ```bash
    java -cp bin com.lox.Main
    ```

### Running Tests

To be added.

## Project Structure

```
jLox/
│
├── src/
│   └── com/
│       └── lox/
│           ├── Token.java
│           ├── Scanner.java
│           ├── Expr.java
│           └── Lox.java
├── bin/
│   └── ...
├── README.md
└── LICENSE
```

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests to help improve the project.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
