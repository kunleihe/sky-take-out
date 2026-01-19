# Sky Take Out

## Introduction
Sky Take Out is a comprehensive backend system designed for a food delivery platform. It provides a robust architecture for managing various aspects of a takeout business, including menu management, order processing, user management, and payment integration. The system is built using Java and the Spring Boot framework, ensuring scalability and maintainability.

## Project Structure
The project is organized into a multi-module Maven architecture:

- **sky-common**: Contains common utilities, constants, exception handlers, and base classes used across the application to ensure consistency and reduce code duplication.
- **sky-pojo**: Houses the Plain Old Java Objects, including Entities (database models), DTOs (Data Transfer Objects for data transmission), and VOs (View Objects for response data).
- **sky-server**: The core module containing the main business logic, controllers, services, and data access layers (Mappers). It handles the application startup and API endpoints.

## Technology Stack

### Backend Frameworks & Libraries
- **Spring Boot**: The primary framework for building the application.
- **MyBatis**: Persistence framework for SQL mapping and database interaction.
- **Spring MVC**: For building RESTful web services.
- **Spring Task**: For scheduling background tasks.
- **WebSocket**: For real-time communication (e.g., order notifications).

### Database & Caching
- **MySQL**: Relational database for storing application data.
- **Redis**: In-memory data structure store used for caching to improve performance.
- **Druid**: High-performance database connection pool.

### Tools & Utilities
- **Lombok**: For reducing boilerplate code (getters, setters, constructors).
- **FastJson**: For JSON serialization and deserialization.
- **PageHelper**: For easy implementation of database pagination.
- **Knife4j**: For API documentation generation.
- **Apache POI**: For handling Excel file imports and exports.

### Third-Party Integrations
- **Aliyun OSS**: Object Storage Service for storing and retrieving uploaded files (e.g., food images).
- **WeChat Pay**: Integration for processing payments via WeChat.
- **JWT (JSON Web Token)**: For secure user authentication and authorization.

## Key Features

### Management Interface (Admin)
- **Employee Management**: Manage internal users and their roles.
- **Category Management**: Organize food items into categories.
- **Dish & Setmeal Management**: Create, update, and manage menu items and combo meals.
- **Order Management**: View and process incoming orders, handle cancellations and refunds.
- **Report Generation**: Export business data and statistics to Excel.

### User Interface (Customer)
- **User Authentication**: Login via WeChat.
- **Browsing**: View categories, dishes, and setmeals.
- **Shopping Cart**: Add items to cart and manage selections.
- **Order Placement**: Create orders and make payments.
- **Address Book**: Manage delivery addresses.

## Setup and Run

### Prerequisites
- JDK 8 or later
- Maven 3.x
- MySQL Database
- Redis Server

### Configuration
1. Create a MySQL database and import the schema.
2. Update the `application.yml` or `application-dev.yml` in `sky-server` with your database credentials, Redis configuration, and third-party API keys (Aliyun OSS, WeChat).

### Build and Run
Build the project using Maven:
```shell
mvn clean package
```

Run the application:
```shell
java -jar sky-server/target/sky-server-1.0-SNAPSHOT.jar
```
