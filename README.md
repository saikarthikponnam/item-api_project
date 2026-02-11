# Item Management REST API

## Overview
This is a simple Spring Boot backend application that provides a RESTful API to manage items.

The application allows:
- Adding a new item
- Retrieving a single item by ID

Data is stored in-memory using an ArrayList.

---

## Tech Stack
- Java 21
- Spring Boot 3
- Maven
- In-memory storage (ArrayList)

---

## How to Run the Application

1. Clone the repository
2. Navigate to the project folder
3. Run:

   mvn spring-boot:run

4. The application will start on:

   http://localhost:8080

---

## API Endpoints

### 1️⃣ Add a New Item

POST /api/v1/items

Request Body (JSON):

{
"name": "Laptop",
"description": "Gaming Laptop",
"price": 75000
}

Response:
Returns the created item with generated ID and timestamp.

---

### 2️⃣ Get Item by ID

GET /api/v1/items/{id}

Example:
GET /api/v1/items/1

Response:
Returns the item if found.
Returns 404 if item not found.

---

## Validation
- Name must not be blank
- Description must not be blank
- Price must be positive

---

## Notes
- Data is stored in-memory (ArrayList)
- Data will reset when application restarts
