# FirstRestAPI – Task 2

## Project Description

FirstRestAPI is a Spring Boot REST API application developed as part of Task 2.
The project demonstrates backend development using Spring Boot, REST architecture, CRUD operations, H2 Database, Swagger UI documentation, and a simple frontend interface for interacting with the API.

The application allows users to manage products through HTTP requests such as creating, retrieving, updating, and deleting products.

---

# Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Swagger / OpenAPI
* Maven
* HTML / Frontend Interface

---

# Features

* Create a product
* Get all products
* Get product by ID
* Update product
* Delete product
* H2 in-memory database
* Swagger API documentation
* Simple frontend interface connected to the backend

---

# API Endpoints

## Create Product

```http
POST /products
```

## Get All Products

```http
GET /products
```

## Get Product By ID

```http
GET /products/{id}
```

## Update Product

```http
PUT /products/{id}
```

## Delete Product

```http
DELETE /products/{id}
```

---

# Swagger UI

Swagger documentation is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# H2 Database Console

H2 console is available at:

```text
http://localhost:8080/h2-console
```

Example configuration:

```text
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password:
```

---

# Frontend

The project also includes a simple frontend interface that communicates with the REST API.

The frontend allows users to:

* View products
* Add products
* Update products
* Delete products

The frontend is connected directly to the Spring Boot backend.

---

# How to Run the Project

1. Clone the repository

```bash
git clone YOUR_GITHUB_LINK
```

2. Open the project in IntelliJ IDEA

3. Run the application

4. Open browser:

```text
http://localhost:8080
```

---

# Testing the API

The API was tested using:

* Swagger UI
* Browser
* H2 Database Console

All CRUD operations were successfully tested.

---

# Screenshots

This section contains screenshots demonstrating:

* Running application
* Swagger UI documentation
* H2 Database console
* CRUD operations
* Frontend interface
* Successful API responses
<img width="1895" height="931" alt="Screenshot 2026-05-24 200901" src="https://github.com/user-attachments/assets/e47fd04e-f44c-44f0-936a-8caadadb2a3b" />
<img width="1920" height="938" alt="Screenshot 2026-05-24 200952" src="https://github.com/user-attachments/assets/2c44a357-f35e-48ef-ab44-450564ed583e" />
<img width="1920" height="929" alt="Screenshot 2026-05-24 201036" src="https://github.com/user-attachments/assets/3d37cf9b-7b72-4df9-851b-32937b20a200" />
<img width="1920" height="888" alt="Screenshot 2026-05-24 201320" src="https://github.com/user-attachments/assets/c41758eb-0518-4c15-b99f-90536651cd3f" />
<img width="1920" height="931" alt="Screenshot 2026-05-24 201420" src="https://github.com/user-attachments/assets/b5d85844-9bce-48d7-9455-7d025f5ad430" />
<img width="1920" height="938" alt="Screenshot 2026-05-24 201451" src="https://github.com/user-attachments/assets/3f47905c-d1d6-44c0-8888-33cd25954791" />

<img width="1920" height="935" alt="Screenshot 2026-05-24 202045" src="https://github.com/user-attachments/assets/a6894da7-f15c-4f3d-9cd5-44e356b0a855" />
<img width="1920" height="935" alt="Screenshot 2026-05-24 201926" src="https://github.com/user-attachments/assets/1e4b69a1-c2f0-4d58-9d74-3d3a1096e430" />

Guenfaf Mohamed Zin Eddine 
74956
