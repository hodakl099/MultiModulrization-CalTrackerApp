 # Calories Tracker Application
# Introduction

The Calories Tracker Application is a modern, easy-to-use, feature-rich application designed to help users keep track of their calorie intake. It has been designed with usability in mind and follows the best practices in software development, including a clean architecture and multi-module structure.

Built using the Jetpack Compose Kotlin for Android, the app provides users with various categories of food data fetched from a freely accessible API. It also allows users to select different meal types like Dinner, Breakfast, Lunch, and Snacks.

This application has been built as a demo project for educational and demonstration purposes, demonstrating the use of various libraries and best practices in software development.
API

The app fetches food data from a freely accessible API (provide the API URL here). This API provides data in various food categories. Since it's a free API, you can use the same API in the source code provided in this project.
Libraries Used

The application uses several libraries and technologies, including:
```
    -Coil: An image loading library for Android backed by Kotlin Coroutines.
    -Coroutines: Kotlin's way of handling long-running tasks efficiently and effectively.
    -Dagger Hilt: A fully static, compile-time dependency injection library to simplify DI in your projects.
    -Google libraries: Various Google libraries have been used for better user interface and accessibility.
    -Kotlin: The main programming language for development.
    -Moshi: A modern JSON library for Kotlin and Java.
    -Retrofit: A type-safe HTTP client for Android and Java.
    -Hilt Testing: A library for simple and efficient testing in conjunction with Dagger Hilt.
    -Compose Testing: A library for testing Jetpack Compose UIs.
    -MockWebServer: A library for mocking web servers for testing HTTP clients.
    -CoroutinesTest: A library for testing Kotlin Coroutines.
    -JUnit: The most popular framework for testing Java code.
```
# Architecture

The project follows the principles of Clean Architecture, which separates code into layers with clear responsibilities and rules for interaction. It's a multi-module architecture designed to make the codebase easier to manage and maintain.
Getting Started

    Clone this repository.
    Open the project directory in Android Studio.
    Obtain your API key and add it in the project.
    Run the application.
