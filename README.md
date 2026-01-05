# Web-Based Online Voting System  
### Review 2 – Final Submission (Java Web Project)

## 📌 Project Overview
The **Web-Based Online Voting System** is a Java web application designed to provide a secure and reliable platform for conducting online voting.  
It allows **admins** to manage candidates and view results, while **users** can register, log in, and cast their vote securely (only once).

This project is developed as part of **GUVI / HCL – Java Web Based Projects (Review 2 – Final Submission)** and focuses on robustness, validation, modularity, and clean integration of components.

---

## 🎯 Objectives
- Implement all **core functionalities** of a Java web-based system
- Ensure **secure and validated user interactions**
- Demonstrate **Servlet–JSP–JDBC integration**
- Apply **good coding practices** and modular design
- Improve the project based on **Review-1 feedback**

---

## 🧩 Core Features

### 👤 User Module
- User Registration with validation
- Secure Login using session management
- Vote casting (restricted to **one vote per user**)
- Logout functionality

### 🛠️ Admin Module
- Add candidates
- View election results
- Centralized control for election data

### 🔐 Security & Validation
- Server-side validation in Servlets
- Client-side validation using HTML attributes
- Session-based authentication
- Prevention of duplicate voting

---

## ⚙️ Technologies Used
- **Java (JDK 17+)**
- **Jakarta Servlets**
- **JSP**
- **JDBC**
- **MySQL**
- **Apache Tomcat 10+**
- **Maven**
- **HikariCP (Connection Pooling)**

---

## 🗂️ Project Structure
Online-Voting-System-Java-New
│
├── pom.xml
├── README.md
└── src
└── main
├── java
│ └── com
│ └── voting
│ ├── admin
│ ├── user
│ └── db
└── webapp
└── WEB-INF
└── web.xml

yaml
Copy code

---

## 🔗 Integration of Components
- **Servlets** handle business logic and request processing
- **JSPs** manage presentation and user interaction
- **JDBC** connects the application with MySQL database
- **DBConnect utility** centralizes database connectivity
- **AppListener** initializes resources during application startup

---

## 🧪 Error Handling & Robustness
- Try–catch blocks for database and runtime exceptions
- Graceful redirection on errors instead of application crash
- Validation for null and invalid inputs
- Safe session handling to avoid unauthorized access

---

## 💡 Innovation / Extra Effort
- Vote-once enforcement logic
- Centralized database connection management
- Clean separation of concerns (MVC-style)
- Connection pooling for better performance

---

## 🚀 How to Run the Project

### 1️⃣ Prerequisites
- Java JDK installed
- Apache Tomcat 10+
- MySQL Server
- Maven

### 2️⃣ Database Setup
- Create a MySQL database
- Update database credentials in configuration if required

### 3️⃣ Run
- Import project as **Maven Project** in IDE
- Deploy on Apache Tomcat
- Access via browser:
http://localhost:8080/OnlineVotingSystem

## 🔗 GitHub Repository
> This repository contains the complete source code, documentation, and project structure for Review-2 evaluation.
