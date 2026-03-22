# 🚀 Spring Data JPA Example Project

This project demonstrates the use of **Spring Data JPA** for performing database operations efficiently using Java and Spring Boot.

---

## 📌 Features

* 📦 CRUD operations using Spring Data JPA
* 🔍 Custom query methods (Derived Queries)
* 📊 Fetch data using method naming conventions
* ⚡ Integration with PostgreSQL database
* 🧩 Clean layered architecture (Model → Repository)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

---

## 📂 Project Structure

```bash
src/
 └── main/
     ├── java/com/example/Spring_data_JPA_ex/
     │   ├── model/        # Entity classes (Student)
     │   ├── repo/         # Repository interfaces (StudentRepo)
     │   └── SpringDataJpaExApplication.java
     └── resources/
         └── application.properties
```

---

## 📊 Key Concepts Demonstrated

### 🔹 Entity Class

* Mapped Java class to database table using JPA annotations

### 🔹 Repository Interface

* Extended `JpaRepository` for built-in CRUD operations
* Used custom methods like:

  * `findByName(String name)`
  * `findByMarks(int marks)`
  * `findByMarksGreaterThan(int marks)`

---

## ⚙️ How to Run

1. Clone the repository

```bash
git clone https://github.com/ns3464026-cyber/Spring-data-JPA-Ex.git
```

2. Navigate to project folder

```bash
cd Spring-data-JPA-Ex
```

3. Configure database in `application.properties`

4. Run the application

```bash
mvn spring-boot:run
```

---

## 🧠 What I Learned

* How Spring Data JPA simplifies database operations
* Difference between JDBC, Hibernate, and JPA
* Writing clean and scalable backend code
* Using method naming conventions for query generation

---

## 🚀 Future Improvements

* Add REST API layer
* Implement pagination and sorting
* Add exception handling
* Integrate Swagger for API documentation

---

## 📫 Connect with Me

* 🔗 LinkedIn: https://www.linkedin.com/in/nikhil-sharma-02b046319
* 💻 GitHub: https://github.com/ns3464026-cyber

---

⭐ If you found this project helpful, consider giving it a star!
