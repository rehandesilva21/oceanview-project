# Ocean View Resort Room Reservation System Architecture & Technical Summary

## 🏗️ System Architecture

| Category                 | Description                                | Evidence in Project                                           |
|--------------------------|--------------------------------------------|--------------------------------------------------------------|
| System Architecture      | Three-tier distributed web application     | React frontend (presentation), Java Servlets (business logic), MySQL database (data layer) |
| Application Type         | Distributed web-based reservation system   | Client–server communication over HTTP using JSON            |
| Frontend Technology      | React.js, HTML5, CSS3, JavaScript (ES6+)  | Component-based UI, staff Help section, forms               |
| Backend Technology       | Java, Java Servlets, JDBC                  | Servlet controllers, DAO classes                             |
| Communication            | REST-style APIs using HTTP and JSON        | Fetch API used in React                                      |
| Design Pattern – MVC     | Separation of concerns between UI, logic, and data | React (View), Servlets (Controller), Models/DAOs (Model) |
| Design Pattern – DAO     | Encapsulation of database access logic     | UserDAO, ReservationDAO, RoomDAO                             |
| Design Pattern – Singleton | Centralized database connection management | Database connection utility                                   |
| Utility Pattern          | Reusable helper logic                      | Password hashing utility                                      |

---

## 🧠 Object-Oriented Programming (OOP) Concepts Used

| OOP Concept         | Description                                    | Evidence                                     |
|--------------------|-----------------------------------------------|---------------------------------------------|
| Encapsulation       | Data fields are hidden and accessed via methods | Private fields with getters/setters in model classes |
| Abstraction         | Separation of business logic from persistence  | DAO layer abstracts database operations     |
| Modularity           | System divided into independent components    | Separate packages for models, DAOs, servlets |
| Reusability          | Common logic reused across system             | Utility classes and shared DAO methods      |
| Separation of Concerns | Each class has a single responsibility       | Controllers, models, DAOs handled independently |

---

## 🗂️ Data Structures Used

| Data Structure      | Usage                                      | Example                                    |
|--------------------|--------------------------------------------|--------------------------------------------|
| Objects (Classes)  | Represent real-world entities              | User, Reservation, Room                     |
| Lists / Collections | Store and process multiple records        | List<Reservation>                           |
| Strings            | Handle user input and system messages      | Usernames, room types                        |
| Date/Time Objects  | Manage check-in and check-out dates        | Billing duration calculation                |

---

## 🔐 Security Techniques Applied

| Security Aspect     | Implementation                             |
|-------------------|---------------------------------------------|
| Authentication     | Username and password login                 |
| Password Protection | One-way password hashing                    |
| SQL Injection Prevention | JDBC Prepared Statements                 |
| Session Management | HTTP sessions                               |
| Input Validation   | Client-side (React) and server-side (Servlets) |

---

## 🌐 Distributed System Characteristics

| Aspect             | Implementation                              |
|-------------------|---------------------------------------------|
| Client             | React web application                        |
| Server             | Java Servlet-based backend                    |
| Data Layer         | MySQL relational database                     |
| Communication      | HTTP requests with JSON payloads             |
| Access Control     | Session-based authentication                  |


<img width="3360" height="1754" alt="image" src="https://github.com/user-attachments/assets/b92e68ad-8c38-4b03-973b-8981ae51253a" />

<img width="3360" height="1754" alt="image" src="https://github.com/user-attachments/assets/2ed63492-356f-4533-9976-d8b5a95e8f63" />

<img width="3360" height="1754" alt="image" src="https://github.com/user-attachments/assets/7da476bc-18e0-4b67-afcf-6cf328c3ce02" />
