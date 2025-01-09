# Automation Web Testing Hadir App
This repository contains automation tests for the Hadir App, an online attendance management system. The framework is developed using Selenium, TestNG, and Cucumber. It follows the Page Object Model (POM) design pattern with Page Factory and integrates Extent Reports for comprehensive test reporting. The project aims to ensure the functionality, reliability, and scalability of core features such as login, attendance tracking, and leave management through Behavior-Driven Development (BDD).

## Features
- Automated Client Upliner testing for valid and invalid credentials
- Automated Absen Point testing for valid and invalid credentials


## Test Cases
https://docs.google.com/spreadsheets/d/1wGtg33cWFqGvQ2hplaqR1uOfdClnEwpafjgyjJEBQBw/edit?usp=sharing

## Demo Testing Video
 https://youtu.be/GmCyOJSLt2E



## Prerequisites
Make sure you have the following installed or configured before starting:

1. **Java Development Kit (JDK) 17 or higher**  
   - Download and install JDK from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.org/install/).  
   - Verify the installation by running the following command in your terminal:  
     ```bash
     java -version
     ```

2. **Apache Maven**  
   - Download and install Maven from [Maven Official Website](https://maven.apache.org/).  
   - Ensure `MAVEN_HOME` is set as an environment variable and Maven is added to your `PATH`.  
   - Verify the installation using:  
     ```bash
     mvn -version
     ```

3. **Google Chrome**  
   - Download and install Google Chrome from [Google Chrome Official Website](https://www.google.com/chrome/).  
   - Verify your Chrome version (optional):  
     ```bash
     google-chrome --version
     ```

4. **ChromeDriver**  
   - Download the ChromeDriver that matches your Chrome version from [ChromeDriver Downloads](https://sites.google.com/chromium.org/driver/).  
   - Add ChromeDriver to your `PATH`, or save it in a location accessible by your project.

5. **Integrated Development Environment (IDE)**  
   - It is recommended to use [IntelliJ IDEA](https://www.jetbrains.com/idea/) for development and debugging.

6. **Dependencies**  
   - Selenium WebDriver, TestNG, and Cucumber are defined in the `pom.xml` file. Dependencies will be automatically downloaded during the Maven build process.


## Installation Steps

Follow these steps to set up the project on your local machine:

1. **Clone the Repository**  
   Clone this repository to your local directory using the following command:  
   ```bash
   git clone https://github.com/Annasyabilla/Web-Automation-Hadir.git
   ```

2. **Open the Project in IntelliJ IDEA**  
   - Open IntelliJ IDEA and select **Open Project**.  
   - Navigate to the directory where the repository was cloned.  

3. **Install Project Dependencies**  
   Run the Maven command to download all required dependencies:  
   ```bash
   mvn clean install
   ```

4. **Set Up ChromeDriver**  
   - Download the ChromeDriver that matches your Chrome version.  
   - Ensure the path to ChromeDriver is configured in the `TestRunner` class or a configuration file, for example:  
     ```java
     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
     ```

5. **Run the Tests**  
   Execute the tests using the following Maven command:  
   ```bash
   mvn test
   ```

6. **View Test Reports**  
   - The reports will be available in the `target` directory once the tests are completed.  
   - Open the HTML report in your browser to view detailed test results.


