# Automated Testing Suite for DemoQA Online Book Shop

## Project Overview

This Maven project automates the testing of the DemoQA Online Shop (https://demoqa.com/books), including tests for:
- Login functionality
- Logout functionality
- Verification the number of the books against the expected 

## Prerequisites

Ensure the following are installed:
- Java Development Kit (JDK).
- Maven Project
- WebDriver for your browser (for example ChromeDriver for Google Chrome) with the proper version otherwise you will receive an error related to incompability of the version.


## Setup Instructions

1. Clone the Repository, git clone <https://github.com/georgekitsos21/Upstream/>

2. Mvn clean install and install maven dependencies, then reload the project.

3. Configure WebDriver, System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

4. Download the WebDriver executable for your browser and add it to your system's PATH. Alternatively, specify its location in the BaseTests class
    

## Running the Tests

1. Run the testng.xml file to run all the suite in the meantime and check the outcome.

2. Using an IDE and select the test that you want to test first.

    - Open the project in your IDE (i.e. IntelliJ)
    - Be sure that you did all the previous related to Prerequisites and set up unstructions.
    - Navigate to `src/test/java/tests`.
    - Right-click on a test class (e.g., LoginTests) and select `Run`.
    - Right-lcik on a different the class(e.g. BookTests) and select `Run`

## Test Details

### LoginTests

- Purpose: Verify user login and log out.
- File: `src/test/java/tests/LoginTests.java`

### BooksListTest

- Purpose: Verify book list
- File: `src/test/java/tests/BooksTests.java`

## Notes

- Test credentials: `username: upstream`, `password: Asd123!`.

## Troubleshooting

- Ensure WebDriver is in your PATH or correctly specified.
- Confirm the website (https://demoqa.com/books) is accessible.
- Check Maven dependencies with `mvn clean install`.
