# JWT Authentication باستخدام Spring Boot

## 📌 Overview

This project demonstrates JWT (JSON Web Token) authentication using Spring Boot. It includes login functionality, token generation, and access to protected routes.

---

## 🔐 Features

* User Login with username and password
* JWT Token Generation
* Protected API endpoint
* Token validation using middleware

---

## 🧩 Technologies Used

* Spring Boot
* Spring Security
* JJWT Library
* Postman (for API testing)

---

## 🚪 API Endpoints

### 1. Login

* **URL**: `/login`
* **Method**: POST
* **Body**:

```json
{
  "username": "user123",
  "password": "password123"
}
```
<img width="884" height="649" alt="Screenshot 2026-04-16 182158" src="https://github.com/user-attachments/assets/805e7b3d-5be5-4d1e-9ec9-28beaeb965c8" />

* **Response**:

```json
{
  "token": "your_jwt_token"
}
```

---

### 2. Protected Route

* **URL**: `/protected`
* **Method**: GET
* **Header**:

<img width="871" height="583" alt="Screenshot 2026-04-16 182435" src="https://github.com/user-attachments/assets/c94dde4e-b4f3-4949-a27d-81b7afe90360" />

```
Authorization: Bearer <token>
```

* **Response**:

```
You have accessed a protected route!
```
<img width="927" height="748" alt="Screenshot 2026-04-16 183517" src="https://github.com/user-attachments/assets/76b3fbdf-a984-471f-960b-05155e696c7d" />

---

## 🧪 Testing with Postman

1. Send POST request to `/login` → receive JWT token
2. Use token in Authorization header
3. Access `/protected` route

---

## 📸 Screenshots

* Login request & token response
* Protected route without token (401)
* Protected route with token (success)

---

## 🎯 Conclusion

This project demonstrates secure authentication using JWT and how to protect routes in a Spring Boot application.
