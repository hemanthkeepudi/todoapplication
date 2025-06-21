# todoproject
#  Todo Application - Spring Boot

A simple yet powerful Todo application built with **Spring Boot**(Server Side Application), featuring user authentication and CRUD operations for managing tasks. This project demonstrates the core concepts of Spring Boot, Spring Security, Spring Data JPA, and Thymeleaf.

##  Features

-  Create, Read, Update, Delete (CRUD) Todo tasks
-  Clean and intuitive UI using Thymeleaf
-  Persistent data storage with JPA & Hibernate
-  Navigation flow:  
  - `index.html` – Todo dashboard

##  Tech Stack

- **Backend:** Spring Boot, Spring Security, Spring Data JPA, Hibernate
- **Frontend:** Thymeleaf, HTML/CSS
- **Database:** H2 (in-memory) / MySQL 
- **Build Tool:** Maven


---

##  How to Run the Application

Follow these steps to clone, configure, and run the Todo Application.

###  Prerequisites

Make sure the following are installed on your system:

* Java 17 or higher
* Maven
* Git
* MySQL 
---

###  Clone the Repository

```bash
git clone https://github.com/hemanthkeepudi/todoapplication.git
cd todoapplication
```

---

###  Configure the Database

#### Option 1: Use H2 (Default - In-Memory Database)

No additional configuration is required. The application is pre-configured to use the H2 database.

#### Option 2: Use MySQL 

1. Create a MySQL database named `todoapp`:

```sql
CREATE DATABASE todoapp;
```

2. Open the file: `src/main/resources/application.properties`
3. Replace the default H2 configuration with the following:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Replace `your_username` and `your_password` with your actual MySQL credentials.

---

###  Run the Application

Use the following command to start the application:

For Linux/macOS:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

---

###  Access the Application

Once the app is running, open your browser and go to:

```
http://localhost:8080
```

---

###  Default Login Credentials

The application uses Spring Security with the following default credentials:

* **Username:** `admin`
* **Password:** `admin`

You can update these credentials in the `application.properties` file.

---

Here's how the landing page look like:

![image](https://github.com/user-attachments/assets/b5d9ac3e-1c70-49a4-989c-d84ad96a0555)


