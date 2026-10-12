# ParaBank Selenium Hybrid Automation Framework 🚀

## 📌 Project Overview

This project is a **Hybrid Automation Testing Framework** developed to automate functional testing of the ParaBank web application using Selenium WebDriver with Java.

The framework combines reusable automation components, data-driven testing, structured test execution, logging, and reporting to improve test maintainability, reliability, and efficiency.

This project is being developed incrementally, with regular code updates and learning progress shared on GitHub.

## 🛠️ Technologies Used

* **Java** – Programming language
* **Selenium WebDriver** – Web browser automation
* **TestNG** – Test execution, annotations, and test organization
* **Maven** – Dependency management and build automation
* **Log4j** – Logging and debugging
* **Data-Driven Testing** – Testing with multiple sets of input data
* **Git & GitHub** – Version control and source code management
* **CI/CD** – Continuous integration and automated test execution
* **Docker** – Containerized test execution
* **Parallel Testing** – Executing multiple tests concurrently

*Note: CI/CD, Docker, and parallel testing are planned or in progress unless already implemented in the repository.*

## ✨ Key Features

* Automated functional test cases for the ParaBank web application
* Reusable test components and structured automation code
* Test execution and management using TestNG
* Logging support using Log4j
* Data-driven test execution
* Validation of application behavior and error scenarios
* Test reports for execution analysis
* CI/CD integration for automated test runs
* Docker support for consistent test environments
* Parallel execution to reduce overall testing time

## 🧪 Test Scenarios

The project covers scenarios such as:

* User login and validation
* Account overview validation
* Fund transfer functionality
* Forgot login information validation
* Loan application functionality
* Bill payment with valid data
* Bill payment with missing fields
* Account number matching validation

## ⚙️ Prerequisites

Ensure the following tools are installed:

* Java JDK 17 or compatible version
* Maven
* Git
* Google Chrome browser
* Compatible ChromeDriver or Selenium Manager support
* Docker, if running tests in containers

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/testwithrhucha/ParaBank_AutomationProject_selenium-hybrid-automation-framework.git
```

### 2. Navigate to the project directory

```bash
cd ParaBank_AutomationProject_selenium-hybrid-automation-framework
```

### 3. Install dependencies

```bash
mvn clean install
```

### 4. Execute the tests

To run the TestNG test suite configured through Maven:

```bash
mvn test
```

If your project uses a standalone TestNG XML suite, you may also execute it through your IDE or configure Maven to use that suite file.

## 📊 Reports and Logs

After test execution, review the generated TestNG reports and configured log files to analyze:

* Passed test cases
* Failed test cases
* Execution details
* Errors and debugging information

Report and log locations depend on the framework configuration.

## 🔄 CI/CD, Docker and Parallel Execution

These capabilities are part of the framework's development goals:

* **CI/CD:** Run automated tests through a configured pipeline.
* **Docker:** Support repeatable test execution in containerized environments.
* **Parallel Testing:** Configure TestNG to execute compatible tests concurrently.

Configuration and execution instructions will be documented as these features are implemented.

## 📁 Project Structure

The framework structure may include the following components, depending on the current implementation:

```text
ParaBankWebAutomation/
├── src/
│   ├── main/
│   └── test/
├── testng.xml
├── pom.xml
├── README.md
└── .gitignore
```

Page objects, test classes, utilities, configuration files, and test data are organized within the source folders according to the framework design.

## 🎯 Project Goals

* Strengthen Selenium automation skills using Java
* Build a maintainable hybrid automation framework
* Practice data-driven and parallel testing
* Integrate logging, reporting, and CI/CD tools
* Apply industry-relevant automation testing practices

## 👩‍💻 Author

**Rhucha Chougale**

GitHub: [@testwithrhucha](https://github.com/testwithrhucha)

Explore the repository to follow the development progress and upcoming improvements.

## 📌 Disclaimer

This project is intended for learning and practicing software test automation on the ParaBank demo application.

---

⭐ If you find this project useful, feel free to explore the repository and follow its progress!
