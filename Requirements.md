# ABC Cinema Requirements Document

## Main Website

### Functional Requirements
1. **User Authentication**
#### Happy Path:
    - Users can create an account with Name,Email,Password.
    - Login functionality with Email,Password.
    - Password recovery feature (via email).
    - Set a new password with change password.

#### Edge Cases:
- **Registration**:
    - Email already in use: Show an error message ("Email is already registered").
    - Weak password: Prevent registration and prompt user to meet password requirements.
    - Invalid email format: Display an error ("Please enter a valid email address").

- **Login**:
   - Invalid email/password: Display a generic error ("Invalid credentials").
   - Account locked: Inform the user ("Your account has been locked. Please contact support").
   - Slow response or server timeout: Show a retry option with a message ("Unable to log in. Please try again later").

- **Password Reset**:
   - Invalid email provided for password reset: Show an error message.
   - Expired reset link: Inform the user and provide an option to request a new link.
   - Reset attempt with an old password: Prevent submission and show an appropriate message.

---
   
2. **Movie Browsing**
#### Happy Path:
    - Display movies in the catergorie (Movies in Theaters , Movies Relasing Soon).
    - View all movies (Movies in Theaters , Movies Relasing Soon)
    - Movies Click functionality and preview movie.

#### Edge Cases:
- **Movie Categories**:
   - No movies available in a category: Display a "No movies found" message.
   - Outdated movie data from the database: Ensure real-time updates.
   
---

3. **Ticket Booking**
#### Happy Path:
    - Users can select a movie, showtime, and seat.
    - Add multiple tickets to the cart.
    - Checkout process with a payment gateway.

#### Edge Cases:
- **Seat Selection**:
    - User selects a seat that has just been booked by another user: Inform them the seat is no longer available.
    - Attempt to book more seats than available: Show an error ("Exceeds maximum capacity").

---

4. **Payment Processing**
#### Happy Path:
    - Users can view reservation summary.
    - Fill user details.(Full Name , Mobile , Email , Card Details )

#### Edge Cases:
- **Payment Issues**:
    - Invalid card details: Show an appropriate error.
    - Duplicate payment: Detect and prevent charging the user twice.

---

5. **Movie Experience**
#### Happy Path:
    - Users can rate movies they have watched.
    - Users can view average ratings and reviews for each movie.

#### Edge Cases:
- **Rating Issues**:
   - Attempt to rate a movie without logging in: Prompt for login.
   - Submitting a rating without selecting a value: Display an error.
  
---

6. **Locations**
#### Happy Path:
    - Users can view a list of cinema locations.
 

#### Edge Cases:
- **Location Issues**:
   - No locations available: Display a message ("No locations found").
   - Incorrect or partial location data: Ensure graceful handling with fallback values.

---

7. **About US**
#### Happy Path:
    - Users can access the "About Us" page from the main menu.
    - The page displays information about the company, vision, and contact details.


#### Edge Cases:
- **AboutUs Issues**:
   - Missing or incomplete information on the page:

---



### Non-Functional Requirements
1. **Performance**
    - The website should handle up to 100 concurrent users.
    - Page load time should be under 2 seconds.

2. **Security**
    - Data encryption for passwords and payment details.
    - Secure authentication with salted and hashed passwords.

3. **Usability**
    - The website must be responsive and mobile-friendly.
    - Provide tooltips and guidance for first-time users.

---

## Admin Website

1. **Login**
#### Happy Path:
    - Admin can log in with a valid email and password.
    - Admin is redirected to the Admin Panel Home after successful login.
  

#### Edge Cases:
- **Login Issues**:
    - Invalid Login Credentials: Display an error message ("Invalid credentials").
    - Server Timeout: Display a retry option ("Unable to log in. Please try again later").

---

2. **Movie Management**
#### Happy Path:
    - Admin can search for a movie from TMDB API using a search bar.
    - Movie details (Name, IMDB rating, Duration, Parental Guidance, Description) are displayed in a preview.
    - Admin can select one of the four categories:
        ( Screen Home Now , Coming Soon Home , Screen Now Main , Coming Soon Main )
    - Admin can publish the movie, which updates the Admin Home with a movie card (status: published).
    - Admin can edit the movie category or delete the movie from the published list.



#### Edge Cases:
- **Search Issues**:
    - Invalid Login Credentials: Display an error message ("Invalid credentials").
    - Server Timeout: Display a retry option ("Unable to log in. Please try again later").


- **Publishing Issues**:
    - Failure to publish movie due to server issues: Show a retry option.
    - Missing category selection: Prompt the admin to select a category before publishing.


- **Edit/Delete Issues**:
    - Attempt to edit a non-existent movie: Prevent action and notify the admin
    - Failure to delete a movie: Show an error message and log the issue.

---

3. **User Management**
#### Happy Path:
    - Admin can view a list of all registered users, including details (Name, Email, Registration Date).
    - Admin can generate a PDF report of the user list.
    - Admin can delete a user, which removes them from the system.


#### Edge Cases:
- **User List Issues:**:
    - No users registered: Display a "No users found" message.
    - Failed to retrieve the user list: Show an error ("Unable to load user data").


- **PDF Generation Issues:**:
    - Failure to generate the report: Notify the admin and provide a retry option.

- **Delete Issues:**:
    - Attempt to delete a user already removed: Prevent action and notify the admin.

     
___

4. **Ticket Management**
#### Happy Path:
    - Admin can view a list of all booked tickets.
    - Admin can generate a PDF report of the ticket list
    - Admin can delete tickets from the system.


#### Edge Cases:
- **Ticket List Issues:**
    - No tickets available: Display a "No tickets found" message.
    - Failed to retrieve ticket data: Notify the admin.


- **PDF Generation Issues:**:
    - Failure to generate the report: Notify the admin and provide a retry option.

- **Delete Issues:**
    - Attempt to delete a ticket already removed: Prevent action and notify the admin.


___

5. **Review Management**
#### Happy Path:
    - Admin can view all reviews submitted by users.
    - Admin can generate a PDF report of all reviews.
    - Admin can delete reviews from the system.


#### Edge Cases:
- **Review List Issues:**
    - No reviews available: Display a "No reviews found" message.
    - Failed to load review data: Notify the admin.


- **PDF Generation Issues:**:
    - Failure to generate the report: Notify the admin and provide a retry option.

- **Delete Issues:**
    - Attempt to delete a review already removed: Prevent action and notify the admin.

___

5. **Logout**
#### Happy Path:
    - Admin can log out of the system and return to the login page
   


#### Edge Cases:
- **Logout Issues:**
    - Logout attempt during a server issue: Notify the admin and ensure a retry option.



___

### Non-Functional Requirements
1. **Performance**
    - Admin Panel should handle up to 50 concurrent admin users.
    - Actions like movie publishing, user deletion, and report generation should take less than 2 seconds.

2. **Security**
    - Implement secure authentication with salted and hashed passwords.
    - Ensure role-based access control: Only admins can access this panel.
    - Sensitive operations (delete, publish) should require confirmation.

3. **Usability**
    - Provide clear messages for errors, successes, and confirmations.
    - The Admin Panel should be responsive and compatible with mobile and desktop views.
    - Include tooltips and guides for first-time admins.

4. **Reliability
    - The Admin Panel should maintain 99.9% uptime.
    - Ensure graceful degradation for third-party dependencies (e.g., TMDB API).
   
5. **Scalability**
    - The system should scale to support more movie categories or additional management features.
---













## Version History
- **Version 1.0**: Initial requirements documented on `2025/01/22`.
