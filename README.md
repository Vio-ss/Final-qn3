# Calculator Application

This project is a simple calculator application implemented in Java.

# Project Structure

![Calculator](file:///D:/worldline/testing/wl%20tasks/final/qn2/calc.png)

## Features

- Addition
- Subtraction
- Multiplication

## Getting Started

To get started with the project, follow these instructions:

### Prerequisites

- JDK (Java Development Kit)
- Maven
- Git

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/Vio-ss/Final-qn3
    ```

2. Navigate to the project directory:

### Usage

1. Compile the application using Maven:

    ```bash
    mvn clean package
    ```

2. Run the tests to validate the operations:

    ```bash
    mvn clean test
    ```

### Jenkins Pipeline

The project includes a Jenkins pipeline that automates the following stages:

1. **Checkout**: Checks out the source code from the GitHub repository.
2. **Build**: Compiles the application using Maven.
3. **Test**: Tests the methods using Maven clean test.

The Jenkinsfile defines the pipeline stages and can be configured in Jenkins to automate the CI/CD process.

