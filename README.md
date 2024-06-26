# Automated Testing Suite for DemoQA Online Shop

## Project Overview

This Maven project automates the testing of the DemoQA Online Shop (https://demoqa.com/books), including tests for:
- Login functionality
- Logout functionality
- Verification of the book list against an expected list

## Prerequisites

Ensure the following are installed:
- Java Development Kit (JDK).
- Apache Maven
- WebDriver for your browser (for example ChromeDriver for Google Chrome)

## Setup Instructions

1. Clone the Repository

    git clone <https://github.com/georgekitsos21/Upstream_test/>

2. Install Maven Dependencies

    mvn clean install

3. Configure WebDriver

    Download the WebDriver executable for your browser and add it to your system's PATH. Alternatively, specify its location in `BaseTest.java`:
    
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

## Running the Tests

1. Using Maven

    mvn test

2. Using an IDE

    - Open the project in your IDE.
    - Navigate to `src/test/java/tests`.
    - Right-click on a test class (e.g., `LoginTest.java`) and select `Run`.

## Test Details

### LoginTest

- Purpose: Verify user login.
- File: `src/test/java/tests/LoginTest.java`

### LogoutTest

- Purpose: Verify user logout.
- File: `src/test/java/tests/LogoutTest.java`

### BooksListTest

- Purpose: Verify book list against `books.csv`.
- File: `src/test/java/tests/BooksListTest.java`
- Data: `src/test/resources/books.csv`

## Notes

- Test credentials: `username: upstream`, `password: Asd123!`.

## Troubleshooting

- Ensure WebDriver is in your PATH or correctly specified.
- Confirm the website (https://demoqa.com/books) is accessible.
- Check Maven dependencies with `mvn clean install`.
