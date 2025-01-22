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

## Version History
- **Version 1.0**: Initial requirements documented on `Date`.
