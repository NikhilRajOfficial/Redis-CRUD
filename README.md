# Redis-CRUD
# CRUD Operations with Redis in Spring Boot

## 📌 Project Overview
This project demonstrates how to perform CRUD (Create, Read, Update, Delete) operations using **Spring Boot** and **Redis** as an in-memory data store. The application is designed to store and manage product details efficiently using Redis' key-value storage capabilities.

## 🔧 Technologies Used
- **Spring Boot**
- **Spring Data Redis**
- **Jedis (Redis Client for Java)**
- **Redis Server**
- **Java 17+**

## 📦 Dependencies
Add the following dependencies to your `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

## ⚙️ Configuration
To configure Redis, ensure that you have **Redis Server** installed and running locally. The application connects to Redis on **localhost:6379**. If needed, modify the configuration accordingly in the `application.properties` file:
```properties
spring.redis.host=localhost
spring.redis.port=6379
```

## 🚀 Running the Application
1. **Start Redis Server:**  
   If Redis is not installed, download and start it using:
   ```sh
   redis-server
   ```

2. **Build and Run the Application:**  
   Use the following command to start the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

## 📌 API Endpoints
| HTTP Method | Endpoint | Description |
|------------|---------|-------------|
| `POST` | `/product` | Add a new product |
| `GET` | `/product/allProduct` | Retrieve all products |
| `GET` | `/product/allProduct/{id}` | Get a product by ID |
| `DELETE` | `/product/allProduct/{id}` | Delete a product by ID |

## 🔄 How It Works
1. **Saving Data**: When a product is saved, it is stored in Redis with a key `Product`.
2. **Retrieving Data**: Data is fetched from Redis using hash operations.
3. **Deleting Data**: When a product is deleted, Redis removes it from the store.

## 🛠 Expected Output
- **Adding a Product:**
  ```json
  {
    "productId": 1,
    "productName": "Laptop",
    "quantity": 10,
    "price": 75000
  }
  ```
- **Fetching All Products:**
  ```json
  [
    {
      "productId": 1,
      "productName": "Laptop",
      "quantity": 10,
      "price": 75000
    }
  ]
  ```
- **Deleting a Product:**
  ```json
  "Deleted Successfully"
  ```

## 🤝 Contributing
- Feel free to fork the repository and submit pull requests for improvements.
- If you find any issues, report them in the issues section.

## 📜 License
This project is open-source and can be used freely. However, contributions and improvements are always welcome!

---
🚀 **Happy Coding!**

