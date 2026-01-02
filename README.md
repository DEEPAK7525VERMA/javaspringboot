# Spring Boot Learning Playground

This repository is where I practice and experiment with **Java + Spring Boot** while learning.

My goal is to understand core Spring concepts by building small features, fixing bugs, and writing simple APIs — step by step.

---

## ✨ What I have practiced so far

- Creating REST APIs with `@RestController`
- Handling requests using `GET`, `POST`, `PUT`, `DELETE`
- Connecting Spring Boot with a database (H2 / MySQL / PostgreSQL)
- Basic CRUD operations using Spring Data JPA
- Exception handling and `ResponseEntity`
- Validation using `@Valid`
- Learning Java concepts while building projects

---

## 🧠 What I learned: DTOs (Data Transfer Objects)

DTOs are simple classes used to **transfer data between layers** — especially between the controller and service.  
They help keep the application clean and secure by:

- 🚫 Not exposing entity (database) objects directly to the client  
- 🔒 Hiding fields that should not be visible  
- 🧩 Sending only the necessary data  
- 🔁 Keeping APIs stable even if internal database structure changes  
- ✅ Adding validation rules without modifying entities  

### Simple Example

```java
// DTO - used for API requests/responses
public class UserDto {
    private String name;
    private String email;
}

// Entity - mapped to the database
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
}
```

👉 In controllers, I convert **Entity ↔ DTO** instead of exposing the entity directly.  
This improves security, readability, and maintainability.

---

## ▶️ How to run the project

1. Clone the repo  
   ```bash
   git clone <repo-url>
   ```

2. Open the project in your IDE (IntelliJ / VS Code / Eclipse)

3. Run the Spring Boot application  
   ```bash
   mvn spring-boot:run
   ```

4. Test the APIs using Postman or a browser.

---

## 🧩 Today’s Progress

- Practiced LeetCode for ~1 hour  
- Continued learning Spring Boot concepts  
- Keeping the coding streak alive 💪

---

Thanks for reading — this repo is my learning playground, so expect lots of experiments and improvements!
