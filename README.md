# Bitcoin Investment Calculator

This is a Spring Boot application that acts as an investment calculator. It allows a user to input an amount of Bitcoin (in Satoshis) and, based on a future price prediction, calculates the future value in USD. The application integrates with a third-party API to fetch live Bitcoin price data.

This project serves as a learning tool to practice backend development principles, including API integration, data modeling, and a clean project structure.

## 🚀 Getting Started

To run this application, you will need:

* **Java 17** or a higher version (the project is configured for Java 17).
* **Maven** (the project includes a Maven Wrapper).
* **A text editor or IDE** (like IntelliJ IDEA or VS Code).

### Running the Application Locally

The project includes an embedded Tomcat server, so you can run the application directly from the command line.

1.  Open a terminal in the root directory of the project.
2.  Run the application using the Maven wrapper:
    * **On Windows:** `./mvnw.cmd spring-boot:run`
    * **On macOS/Linux:** `./mvnw spring-boot:run`
3.  Once the application is running, you can access the API at `http://localhost:8080/`.

### Accessing the H2 Database Console

This project uses an in-memory H2 database for local development. You can access the H2 web console to view and manage the database.

1.  Ensure the application is running locally.
2.  Open your browser and navigate to: `http://localhost:8080/h2-console`.
3.  Use the following credentials:
    * **JDBC URL:** `jdbc:h2:mem:demo_db`
    * **Username:** `sa`
    * **Password:** `password`

## 📦 API Endpoints

The application will expose the following REST endpoints:

* **GET `/calculate`**: A future endpoint that will perform the investment calculation.

## 🛠️ Project Structure & Key Concepts

This project demonstrates several key software development principles:

* **API Integration:** The application will make an HTTP request to a third-party service to get live Bitcoin price data.
* **Object-Oriented Programming (OOP):** The application will use classes to model the Bitcoin price data and the calculation logic.
* **Dependency Injection:** Spring automatically provides dependencies using constructor injection.
* **Separation of Concerns:** The project will be structured with distinct layers for controllers, services, and data models.
* **CRUD Operations:** (Optional for this project) The project structure can easily be expanded to include data persistence if needed in the future.

## ⚙️ CI/CD Pipeline

This project is configured with a GitHub Actions workflow to automatically deploy the application to a free Render web service every time a commit is pushed to the `main` branch.