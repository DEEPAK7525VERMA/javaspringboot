# Spring Boot Learning Playground

This repository is where I practice and experiment with **Java + Spring Boot** while learning.  
My goal is to understand core Spring concepts by building small features, fixing bugs, and writing simple APIs — step by step.

---

## ✨ What I have practiced so far

- Creating REST APIs with `@RestController`
- Handling requests using **GET, POST, PUT, DELETE**
- Connecting Spring Boot with a database (H2 / MySQL / PostgreSQL)
- Basic CRUD operations using Spring Data JPA
- Exception handling and `ResponseEntity`
- Validation using `@Valid`
- Learning Java concepts while building projects

---

## 📐 Understanding MVC Architecture (Model–View–Controller)

Spring Boot follows the **MVC pattern**, which helps organize code cleanly:

- **Model** — Represents the data and business logic (Entities, DTOs, Service layer, Repository layer)  
- **View** — What the user sees (in REST APIs, the *view* is usually JSON, not HTML)  
- **Controller** — Handles incoming requests (Receives data → calls services → returns results)

👉 This separation makes the project easier to test, maintain, and extend.

---

## 🧠 What I learned: DTOs (Data Transfer Objects)

DTOs are simple classes used to **transfer data between layers**. They help keep applications clean by:

- 🚫 Not exposing database entities directly  
- 🔒 Hiding sensitive fields  
- 🧩 Sending only the required data  
- 🔁 Keeping APIs stable if the DB structure changes  
- ✅ Allowing validation without touching entities  

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

👉 I convert **Entity ↔ DTO** instead of exposing the entity directly.

---

## 🌍 Understanding @RestController and @GetMapping

### 🔹 `@RestController`

`@RestController` tells Spring:

> “This class will handle HTTP requests and return JSON responses.”

It is basically:

```
@Controller + @ResponseBody
```

So instead of returning HTML pages, it returns **JSON data**.

---

### 🔹 `@GetMapping`

`@GetMapping` is used to handle **HTTP GET requests** — usually used to:

- fetch data  
- check API status  
- return simple responses  

Meaning:

> “When someone visits `/hello`, run this method.”

---

## 👨‍💻 Example: Simple REST API (Complete Working Code)

### `HelloController.java`

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Simple GET endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot! 👋";
    }
}
```

### `SpringBootLearningPlaygroundApplication.java`

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearningPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningPlaygroundApplication.class, args);
    }
}
```

➡️ Now when you run the app and open:

```
http://localhost:8080/hello
```

You will see:

```
Hello from Spring Boot! 👋
```

---

## ▶️ How to run the project

1. Clone the repo
```bash
git clone <repo-url>
```

2. Open the project in your IDE  

3. Run the application
```bash
mvn spring-boot:run
```

4. Test APIs using a browser or Postman.

---

## 🧩 Today’s Progress

- Practiced LeetCode for ~1 hour  
- Continued learning Spring Boot concepts  
- Keeping the coding streak alive 💪  

---

Thanks for reading — this repo is my learning playground, so expect lots of experiments and improvements!
