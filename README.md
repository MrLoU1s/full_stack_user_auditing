# full_stack_user_auditing

A full-stack application demonstrating user auditing for "created by" and "modified by" fields in post forms. This project combines a React frontend and a Spring Boot backend to provide a seamless user experience and robust audit tracking.

## Features

- 🌐 **Frontend (React)**

  - User-friendly interface for creating and viewing posts.
  - Real-time updates and form validation.
  - Organized component structure (`PostForm`, `PostList`).
  - Service layer for API communication (`postService.js`).

- ⚙️ **Backend (Spring Boot)**
  - RESTful API for managing posts.
  - Entity auditing: automatically tracks who created and last modified each post.
  - Secure and configurable with Spring Security and CORS support.
  - DTOs and service layers for clean architecture.

## Project Structure

- `full-stack-user-audit-frontend/` – React app (components, services, styles).
- `src/main/java/com/muiyurocodes/full_stack_user_auditing/` – Spring Boot backend (controllers, entities, repositories, services, configuration).

## Getting Started

1. **Backend:**
   - Navigate to the project root and run:  
      `./mvnw spring-boot:run`
2. **Frontend:**
   - Navigate to `full-stack-user-audit-frontend/` and run:  
      `npm install`  
      `npm start`

## Purpose

This project is ideal for learning or demonstrating how to implement user auditing in a modern full-stack application using React and Spring Boot.
