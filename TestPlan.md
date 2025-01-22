# ABC Cinema Test Plan

## Version Information

- **Version 1.0**: Initial requirements and test plan documented on 2025/01/22.
- **Author**: Thanuga Soysa

## Table of Contents
1. [Introduction](#1-introduction)
2. [Scope](#2-scope)
3. [Test Objectives](#3-test-objectives)
4. [Test Approach](#4-test-approach)
5. [Test Environment](#5-test-environment)
6. [Test Deliverables](#6-test-deliverables)
7. [Test Scenarios and Cases](#7-test-scenarios-and-cases)
    - [Main Website](#main-website)
    - [Admin Panel](#admin-panel)
8. [Non-Functional Requirements](#8-non-functional-requirements)
9. [Risks and Assumptions](#9-risks-and-assumptions)
10. [Approval](#10-approval)

---

## 1. Introduction
The purpose of this test plan is to define the approach, resources, and schedule for testing the ABC Cinema Project. The focus will be on ensuring that all functionalities work as expected, edge cases are handled, and non-functional requirements are met.

## 2. Scope
Testing covers both Main Website and Admin Panel functionalities:
- User authentication
- Movie browsing and ticket booking
- Admin functionalities for movie, user, ticket, and review management

## 3. Test Objectives
- Validate core functionalities like user authentication and movie management.
- Ensure robustness against edge cases.
- Meet performance, security, and usability standards.

## 4. Test Approach
- **Manual Testing** for critical workflows.
- **Automated Testing** for repetitive test cases.
- Focused testing on both Happy Paths and Edge Cases.

## 5. Test Environment
- **Frontend**: HTML, CSS, JSP, JavaScript
- **Backend**: Java Servlets, MariaDB
- **External APIs**: TMDB API for movie data
- **Browsers**: Chrome, Firefox, Edge

## 6. Test Deliverables
- Test Scenarios and Cases document
- Test Execution Results
- Defect Report
- Test Summary Report

## 7. Test Scenarios and Cases

### Main Website

#### User Authentication

**Happy Path**:
1. **User Registration**:
    - The user enters valid details (e.g., full name, valid email, password).
    - The system successfully registers the user and displays a confirmation message.
2. **User Login**:
    - The user enters correct credentials (email and password).
    - The system grants access and redirects the user to the homepage.
3. **Password Reset**:
    - The user requests a password reset by entering a registered email.
    - The system sends a password reset link via email, and the user resets their password.

**Edge Cases**:
1. **Registration with Existing Email**:
    - The user attempts to register with an email already in use.
    - The system displays an error message: "Email already registered."
2. **Invalid Email Format**:
    - The user enters an incorrectly formatted email during login (e.g., missing `@`).
    - The system displays an error message: "Invalid email format."
3. **Expired Password Reset Link**:
    - The user attempts to reset the password using an expired link.
    - The system displays an error message: "This link has expired. Please request a new one."

---

#### Movie Browsing

**Happy Path**:
1. **Movie Categories**:
    - Movies are displayed under "In Theaters" and "Coming Soon" sections.
2. **View Movie Details**:
    - The user selects a movie to view its detailed information (e.g., synopsis, duration, cast).

**Edge Cases**:
1. **No Movies in a Category**:
    - A category (e.g., "Coming Soon") has no movies.
    - The system displays a message: "No movies available in this category."
2. **Outdated Movie Data**:
    - A movie displays incorrect or outdated information due to sync issues with TMDB API.
    - The system logs the issue and updates the data on the next sync.

---

#### Ticket Booking

**Happy Path**:
1. **Select Showtime and Seat**:
    - The user selects a movie, chooses a showtime, and picks available seats.
    - The system highlights the selected seats and confirms the selection.
2. **Payment**:
    - The user enters payment details, completes the transaction, and receives a confirmation.

**Edge Cases**:
1. **Double-Booked Seats**:
    - Two users select the same seat simultaneously.
    - The system prevents double booking and prompts the second user to choose another seat.
2. **Payment Failure**:
    - The payment gateway encounters an error.
    - The system displays an error message: "Payment failed. Please try again."

---

### Admin Panel

#### Login

**Happy Path**:
1. The admin enters valid credentials (email and password).
2. The system grants access to the admin dashboard.

**Edge Cases**:
1. **Incorrect Credentials**:
    - The admin enters incorrect email or password.
    - The system displays an error message: "Invalid credentials."
2. **Server Timeout**:
    - A server issue prevents login.
    - The system displays an error message: "Unable to connect. Please try again later."

---

#### Movie Management

**Happy Path**:
1. **Search Movies**:
    - The admin searches for movies using the TMDB API.
    - Results are displayed, and the admin selects a movie to publish.
2. **Publish Movie**:
    - The admin publishes a movie and assigns it a category (e.g., "In Theaters").
3. **Edit/Delete Movie**:
    - The admin updates movie details or deletes a movie from the system.

**Edge Cases**:
1. **Publish Without Category**:
    - The admin attempts to publish a movie without selecting a category.
    - The system prompts: "Please select a category before publishing."
2. **Deleting Non-Existent Movies**:
    - The admin tries to delete a movie that has already been removed.
    - The system displays: "Movie not found."

---

#### User Management

**Happy Path**:
1. The admin views the list of registered users and generates a PDF report.
2. The admin deletes a user successfully.

**Edge Cases**:
1. **No Users in the System**:
    - The user list is empty.
    - The system displays: "No users found."
2. **PDF Generation Failure**:
    - A server issue prevents PDF generation.
    - The system displays: "Failed to generate PDF. Please try again."

---

#### Ticket Management

**Happy Path**:
1. The admin views booked tickets and generates a PDF report.
2. The admin deletes a ticket successfully.

**Edge Cases**:
1. **No Tickets Available**:
    - No tickets exist in the system.
    - The system displays: "No tickets found."
2. **Data Retrieval Failure**:
    - A backend error prevents data retrieval.
    - The system displays: "Error fetching ticket data."

---

#### Review Management

**Happy Path**:
1. The admin views all user reviews and generates a PDF report.
2. The admin deletes a review successfully.

**Edge Cases**:
1. **No Reviews Available**:
    - No reviews exist in the system.
    - The system displays: "No reviews available."
2. **Review Data Loading Error**:
    - The system encounters an error while loading reviews.
    - The system displays: "Error loading reviews. Please try again."

---

#### Logout

**Happy Path**:
1. The admin logs out, and the session ends successfully.

**Edge Cases**:
1. **Server Issues During Logout**:
    - The system encounters a server error during logout.
    - The admin is notified: "Logout failed. Please try again later."


## 8. Non-Functional Requirements
- **Performance**: Load time under 2 seconds for all operations.
- **Security**: Role-based access, encrypted sensitive data.
- **Usability**: Responsive design, clear error messages.
- **Reliability**: 99.9% uptime.

## 9. Risks and Assumptions
- **Risks**: Third-party API downtime, payment gateway issues.
- **Assumptions**: All APIs are functional and return valid responses.

## 10. Approval
- **Prepared By**: Thanuga Soysa
- **Reviewed By**: Thanuga Soysa
- **Date**: 2025/01/22
