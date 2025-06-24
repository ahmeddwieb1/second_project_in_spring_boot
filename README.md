# Myprodect Spring Boot Project

This is a simple Spring Boot application for managing products, built with Java 17, Spring Boot, and MySQL.  
The project demonstrates a typical layered structure with Entity, Repository, Controller, and Application classes.

## Project Structure

```
src/main/java/org/codewithramy/myprodect/
│
├── Controller/
│     └── ProductRestController.java
│
├── entites/
│     └── Product.java
│
├── repos/
│     └── Prodectrepo.java
│
└── MyprodectApplication.java
```

### Class Overview

- **Product.java** (`entites`)
  - This class represents a product entity. It contains fields such as `id`, `name`, `price`, etc., and is mapped to the products table in the database using JPA annotations.

- **Prodectrepo.java** (`repos`)
  - This is a Spring Data JPA repository interface for accessing and managing `Product` entities in the database. It provides CRUD operations without the need for implementation.

- **ProductRestController.java** (`Controller`)
  - This REST controller exposes HTTP endpoints to perform CRUD operations on products. Typical endpoints include:
    - `GET /products` — List all products
    - `POST /products` — Add a new product
    - `PUT /products/{id}` — Update existing product
    - `DELETE /products/{id}` — Delete a product by ID

- **MyprodectApplication.java**
  - The main class to bootstrap and launch the Spring Boot application.

## How to Run

1. **Configure the Database**
   - Make sure you have a MySQL server running.
   - Update your database connection settings (username, password, URL) in `src/main/resources/application.properties`.

2. **Build and Run the Application**
   - Using Maven, run:
     ```
     mvn spring-boot:run
     ```
   - The application will start on [http://localhost:8080](http://localhost:8080).

## Example API Usage

- **Get all products**
  ```
  GET http://localhost:8080/products
  ```

- **Add a new product**
  ```
  POST http://localhost:8080/products
  Content-Type: application/json

  {
    "name": "Sample Product",
    "price": 100.0
  }
  ```

- **Update a product**
  ```
  PUT http://localhost:8080/products/{id}
  Content-Type: application/json

  {
    "name": "Updated Product",
    "price": 120.0
  }
  ```

- **Delete a product**
  ```
  DELETE http://localhost:8080/products/{id}
  ```

---

## Notes

- You can use tools like Postman or curl to test the API endpoints.
- The project follows a layered architecture making it easy to extend and maintain.
- Make sure to create the database schema before running the application if not using auto-ddl.

---

**Author:** [ahmeddwieb1](https://github.com/ahmeddwieb1
