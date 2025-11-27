Web-Based Online Voting System (JSP + Servlets + JDBC + MySQL)

A simple, structured, and secure online voting system built using Java Servlets, JSP, JDBC, and MySQL, following the MVC pattern.
This is the Review 1 submission, covering:

✔ Core Java + OOP
✔ Project structure
✔ Servlet basics
✔ JDBC connectivity
✔ Database design
✔ DAO layer implementation

⭐ 1. Features (Review 1 Scope)
👤 User Module

Register new user

Login using email & password

Secure session handling

Redirect to home page after login

🗃 Database Integration (JDBC)

MySQL database connection using JDBC

DAO pattern for clean data handling

SQL schema included inside /sql/db.sql

🧱 Core Java + OOP

POJO class for User

Separation of concerns (Model → DAO → Servlet → JSP)

⭐ 2. Project Folder Structure
OnlineVotingSystem/
│
├── src/
│   ├── dao/
│   │   └── UserDAO.java
│   ├── model/
│   │   └── User.java
│   ├── servlet/
│   │   ├── LoginServlet.java
│   │   ├── RegisterServlet.java
│   │   └── LogoutServlet.java
│   └── util/
│       └── DBConnection.java
│
├── WebContent/
│   ├── index.jsp
│   ├── register.jsp
│   ├── home.jsp
│   ├── error.jsp
│   ├── css/style.css
│   └── WEB-INF/
│       ├── web.xml
│       └── lib/   (Place MySQL Connector JAR here)
│
├── sql/
│   └── db.sql
│
├── README.md
├── .classpath
└── .project

⭐ 3. Technology Stack
Layer	Technology
Front-End	JSP, HTML, CSS
Backend	Java Servlets
Database	MySQL 8.x
JDBC Driver	mysql-connector-java
Server	Apache Tomcat 9
IDE	Eclipse
⭐ 4. Database Setup

1️⃣ Start MySQL
2️⃣ Open MySQL shell:

mysql -u root -p


3️⃣ Run the SQL file:

SOURCE sql/db.sql;


This creates:

users table

Default structure needed for Review 1

⭐ 5. Configure JDBC Connection

Open:

src/util/DBConnection.java


Update the credentials:

URL  = jdbc:mysql://localhost:3306/vote_db?useSSL=false
USER = root
PASS = your_mysql_password

⭐ 6. Add MySQL Connector JAR

Download:

mysql-connector-j-8.x.x.jar

Place it inside:

WebContent/WEB-INF/lib/


(Add to Build Path if Eclipse asks)

⭐ 7. How to Run the Project (Eclipse)

Open Eclipse

File → Import → Existing Project into Workspace

Select the OnlineVotingSystem folder

Right-click project → Properties → Target Runtime → Add Tomcat 9

Right-click project → Run As → Run on Server

Project URL:

http://localhost:8080/OnlineVotingSystem/
