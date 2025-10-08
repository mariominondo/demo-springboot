# Bitcoin Investment Calculator Learning Path - To-Do List

This document tracks our progress in building a Bitcoin investment calculator with Spring Boot.

## ✅ Completed Tasks

* **Project Setup:** Created a basic Spring Boot project with Spring Web dependency.
* **"Hello World" API:** Wrote a simple REST endpoint that returns a string.
* **Dockerization:** Created a `Dockerfile` to containerize the application for deployment.
* **CI/CD Pipeline:** Set up a GitHub Actions workflow to automatically deploy to Render.
* **Test with JUnit:** Wrote a JUnit test to verify the "Hello World" endpoint.
* **Troubleshooting:** Fixed build errors related to Docker images, Maven, and Java versions.
* **Run Locally:** Tested the application on your local machine.
* **Refactor to a Service Layer:** Separated business logic from the controller.
* **Refactor to a New Project Concept:** Switched to building a Bitcoin calculator.

## 🚀 Next Up

* **API Integration:** Make an HTTP request to a third-party service to get live Bitcoin price data.
* **Data Models:** Create a `BitcoinPrice` data model to hold the data from the API.
* **Calculation Logic:** Implement the logic to calculate the future value based on user input and price predictions.
* **New API Endpoint:** Create a new API endpoint to accept the user's input and return the calculation result.
* **Unit & Integration Tests:** Write tests for the new service and controller logic.
* **Update CI/CD:** Ensure the new code and tests are running correctly on Render.