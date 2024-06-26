# Automated Testing Suite for DemoQA Online Shop

## Project Overview

This Maven project automates the testing of the DemoQA Online Shop (https://demoqa.com/books), including tests for:
- Login functionality
- Logout functionality
- Verification of the book list against an expected list

## Prerequisites

Ensure the following are installed:
- Java Development Kit (JDK).
- Maven Project
- WebDriver for your browser (for example ChromeDriver for Google Chrome)

## Setup Instructions

1. Clone the Repository

    git clone <https://github.com/georgekitsos21/Upstream_test/>

2. Install Maven Dependencies

    mvn clean install

3. Configure WebDriver   System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

4. Download the WebDriver executable for your browser and add it to your system's PATH. Alternatively, specify its location in the BaseTests class
    


## Running the Tests

1.run the testng.xml file to run all the tests in the meantime.

2. Using an IDE and select the test that you want to test.

    - Open the project in your IDE.
    - Navigate to `src/test/java/tests`.
    - Right-click on a test class (e.g., `LoginTest.java`) and select `Run`.

## Test Details

### LoginTests

- Purpose: Verify user login and log out.
- File: `src/test/java/tests/LoginTests.java`

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
