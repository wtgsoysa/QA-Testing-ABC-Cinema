# ABC Cinema Test Cases


## Main Website - User Authentication

### Test Case 001
- **Test Case ID:** TC_Main_001
- **Test Scenario:** Register with valid details.
- **Precondition:** User is on the Registration Page.
- **Test Steps:**
    1. Open the registration page.
    2. Fill in all required fields with valid data (name, email, password).
    3. Click the "Register" button.
- **Expected Results:** User is successfully registered and redirected to the login page.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 002
- **Test Case ID:** TC_Main_002
- **Test Scenario:** Register with an already existing email.
- **Precondition:** User is on the Registration page and the email already exists in the System.
- **Test Steps:**
    1. Open the registration page.
    2. Fill in all required fields with an existing email address.
    3. Click the "Register" button.
- **Expected Results:** User is shown an error message indicating the email is already in use.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 003
- **Test Case ID:** TC_Main_003
- **Test Scenario:** Login with correct credentials.
- **Precondition:** User has a valid account.
- **Test Steps:**
    1. Open the login page.
    2. Enter the valid credentials (Email, Password).
    3. Click the "Login" button.
- **Expected Results:** User is successfully logged in and redirected to the homepage.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 004
- **Test Case ID:** TC_Main_004
- **Test Scenario:** Login with invalid email format.
- **Precondition:** User has an invalid email.
- **Test Steps:**
    1. Open the login page.
    2. Enter the invalid email.
    3. Click the "Login" button.
- **Expected Results:** User is shown an error message indicating the invalid email.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 005
- **Test Case ID:** TC_Main_005
- **Test Scenario:** Password reset using a valid email.
- **Precondition:** User has forgotten the password to login.
- **Test Steps:**
    1. Click the "Forgotten Password" button.
    2. Redirect to the password reset page.
    3. Enter the registered email.
    4. Enter the new password and confirm the password.
    5. Click the "Submit" button.
    6. Redirect to the login page.
- **Expected Results:** User is able to reset the password and log in with the new credentials.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

## Movie Features

### Test Case 006
- **Test Case ID:** TC_Main_006
- **Test Scenario:** Display movies categorized as "Movies in Theaters" and "Movies Releasing Soon".
- **Precondition:** There are movies in the respective category.
- **Test Steps:**
    1. Open the homepage.
    2. Check the movie listings under "Movies in Theaters" and "Movies Releasing Soon".
    3. Verify with the movie titles.
- **Expected Results:** Movies are displayed under the correct categories with proper details.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 007
- **Test Case ID:** TC_Main_007
- **Test Scenario:** View movie details page for "Movies in Theaters".
- **Precondition:** User opens the "Movies" page.
- **Test Steps:**
    1. User clicks the "View More" button under "Movies in Theaters".
    2. User navigates to the "Movies in Theaters" section.
    3. Check the movies in the "Movies in Theaters" section are correct with movie titles.
- **Expected Results:** Display movies relevant to the "Movies in Theaters".
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 008
- **Test Case ID:** TC_Main_008
- **Test Scenario:** View movie details page for "Movies Releasing Soon".
- **Precondition:** User opens the "Movies" page.
- **Test Steps:**
    1. User clicks the "View More" button under "Movies Releasing Soon".
    2. User navigates to the "Movies Releasing Soon" section.
    3. Check the movies in the "Movies Releasing Soon" section are correct with movie titles.
- **Expected Results:** Display movies relevant to the "Movies Releasing Soon".
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 009
- **Test Case ID:** TC_Main_009
- **Test Scenario:** Click a Movie Card.
- **Precondition:** Movies are available in the 'Movies in Theater' Category.
- **Test Steps:**
    1. Open the homepage.
    2. Click the Movie Card in 'Movies in Theater'.
    3. Navigate to the 'Movie Preview' page
- **Expected Results:** Movie Preview Display in the 'Movie Booking' section.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 010
- **Test Case ID:** TC_Main_010
- **Test Scenario:** Click the 'Book Now' Button.
- **Precondition:** Selected movie preview display the page.
- **Test Steps:**
    1. Navigate to the 'Movie Preview Page'
    2. Click the 'Book Now' Button
    3. Navigate to the 'Booking' section
  
- **Expected Results:** Navigate to th 'Booking' section.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 011
- **Test Case ID:** TC_Main_011
- **Test Scenario:** Movie Booking without select the date.
- **Precondition:** User is book the ticket
- **Test Steps:**
    1. Navigate to a booking section.
    2. Select the location , Time 
    3. Select the seat
    4. Click the 'Continue to Payment' Button
- **Expected Results:** Display error message "Please select a date to watch the movie"
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 012
- **Test Case ID:** TC_Main_012
- **Test Scenario:** Click the 'Continue to Payment' button without select the seat
- **Precondition:** User in the booking section
- **Test Steps:**
    1. Navigate to a booking section.
    2. Select the location , Time , Date
    3. Click the 'Continue to Payment' Button
- **Expected Results:** Display error message "Please select a seat to watch the movie"
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 013
- **Test Case ID:** TC_Main_013
- **Test Scenario:** Purchase a movie ticket.
- **Precondition:** User is logged in and selects a movie with available showtimes.
- **Test Steps:**
    1. Open the movie details page.
    2. Select a showtime.
    3. Choose the number of tickets.
    4. Click the "Purchase" button.
    5. Complete the payment process.
- **Expected Results:** User successfully navigate to the 'Payment Summary Page'.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 014
- **Test Case ID:** TC_Main_014
- **Test Scenario:** Cancel a purchased ticket.
- **Precondition:** User has purchased a ticket.
- **Test Steps:**
    1. Open the "My Tickets" page.
    2. Select a ticket to cancel.
    3. Click the "Cancel" button.
- **Expected Results:** Ticket is successfully canceled and marked as refunded or void.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 015
- **Test Case ID:** TC_Main_015
- **Test Scenario:** Validate the reservation summary
- **Precondition:** Navigate to the 'Reservation Summary Page'
- **Test Steps:**
    1. Navigate to the 'Reservation' summary page.
    2. Enter the 'Full Name' , 'Mobile Number' , 'Email Address' , 'Card Information'
    3. Click the 'Continue' Button 
- **Expected Results:** Display 'Payment Success'
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 016
- **Test Case ID:** TC_Main_016
- **Test Scenario:** Apply a discount code during ticket purchase.
- **Precondition:** A valid discount code is available.
- **Test Steps:**
    1. Proceed to the payment page during ticket purchase.
    2. Enter the discount code.
    3. Verify the discount is applied to the total amount.
- **Expected Results:** Discount is successfully applied to the ticket price.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]





# Admin Test Cases Documentation

---

### Test Case 021
**Test Case ID:** TC_Admin_021  
**Test Scenario:** Admin logs in with correct credentials.  
**Precondition:** Admin account exists.  
**Test Steps:**
1. Navigate to the admin login page.
2. Enter valid admin credentials (username and password).
3. Click the "Login" button.  
   **Expected Results:** Admin successfully logs in and is redirected to the dashboard.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 022
**Test Case ID:** TC_Admin_022  
**Test Scenario:** Admin logs in with incorrect credentials.  
**Precondition:** Admin account exists.  
**Test Steps:**
1. Navigate to the admin login page.
2. Enter invalid admin credentials (wrong email or password).
3. Click the "Login" button.  
   **Expected Results:** Login fails, and an error message is displayed: "Invalid email or password."  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 023
**Test Case ID:** TC_Admin_023  
**Test Scenario:** Add a movie.  
**Precondition:** Admin is logged in.  
**Test Steps:**
1. Navigate to the "Movie Management" section.
2. Click the "Add Movie" button.
3. Check that the navigation page is correct: “Add Your Movie Details.”  
   **Expected Results:** Navigate to “Add Your Movie Details” page successfully.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 024
**Test Case ID:** TC_Admin_024  
**Test Scenario:** Add a Movie by Title.  
**Precondition:** Open the “Add Your Movie Details.”  
**Test Steps:**
1. Navigate to the “Add Your Movie Details.”
2. Search for a movie by title.
3. Click the “Search” Button.  
   **Expected Results:** Display the movie data, and the movie title matches the searched movie title.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 025
**Test Case ID:** TC_Admin_025  
**Test Scenario:** Verify the search movie details.  
**Precondition:** Admin needs to search for a movie by title.  
**Test Steps:**
1. Search for a movie by title.
2. Verify the details (Movie Title, Duration, Parental Control, IMDB, Movie Description, Movie genres).  
   **Expected Results:** Preview details (Movie Title, Duration, Parental Control, IMDB, Movie Description, Movie genres) are correct.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 026
**Test Case ID:** TC_Admin_026  
**Test Scenario:** Select the movie category and publish.  
**Precondition:** Search for a movie by title.  
**Test Steps:**
1. Search for a movie by title.
2. Select the dropdown menu options:
- Screening Now Home
- Coming Soon Home
- Screening Now Main
- Coming Soon Main
3. Click the “Publish Movie” Button.  
   **Expected Results:** Publish Movie Card displays in the Movie Management or Main website's relevant section selected by admin.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 027
**Test Case ID:** TC_Admin_027  
**Test Scenario:** Verify the “Discard” Button.  
**Precondition:** Search for a movie by title.  
**Test Steps:**
1. Search for a movie by title.
2. Click the “Discard” Button.
3. Verify that all searched movie details are removed.  
   **Expected Results:** Search movie details are successfully removed.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 028
**Test Case ID:** TC_Admin_028  
**Test Scenario:** Edit details of an existing movie.  
**Precondition:** Admin is logged in, and movies exist in the system.  
**Test Steps:**
1. Navigate to the "Movie Management" section.
2. Select a movie listing and click the "Edit" button.
3. Navigate to the “Edit Movie Status.”
4. Update the movie status.
5. Click the “Update Status” button.  
   **Expected Results:** Successfully update the “Movie Status.”  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 029
**Test Case ID:** TC_Admin_029  
**Test Scenario:** Delete an existing movie.  
**Precondition:** Admin is logged in, and movies exist in the system.  
**Test Steps:**
1. Navigate to the "Movie Management" section.
2. Select a movie and click the "Delete" button.  
   **Expected Results:** Movie is successfully deleted from this section.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 030
**Test Case ID:** TC_Admin_030  
**Test Scenario:** Display all registered users.  
**Precondition:** Admin is logged in, and users exist in the system.  
**Test Steps:**
1. Navigate to the "User Management" section.
2. View the list of all registered users.  
   **Expected Results:** All user details are displayed in a paginated table.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 031
**Test Case ID:** TC_Admin_031  
**Test Scenario:** Attempt to generate a report when no users exist in the system.  
**Precondition:** Admin is logged in, and no users exist.  
**Test Steps:**
1. Navigate to the "User Management" section.
2. Click the "Generate Report" button.  
   **Expected Results:** Report generation fails, and an error message is displayed: "No user data available to generate a report."  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 032
**Test Case ID:** TC_Admin_032  
**Test Scenario:** Delete an existing user.  
**Precondition:** Admin is logged in, and users exist in the system.  
**Test Steps:**
1. Navigate to the "User Management" section.
2. Select a user and click the "Delete" button.
3. Confirm the deletion.  
   **Expected Results:** User is successfully deleted, and a confirmation message is displayed.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 033
**Test Case ID:** TC_Admin_033  
**Test Scenario:** View all booked tickets.  
**Precondition:** Admin is logged in, and tickets are booked.  
**Test Steps:**
1. Navigate to the "Ticket Management" section.
2. View the list of all booked tickets.  
   **Expected Results:** All booked tickets are displayed.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 034
**Test Case ID:** TC_Admin_034  
**Test Scenario:** Attempt to generate a ticket report when no tickets are booked.  
**Precondition:** No tickets are booked.  
**Test Steps:**
1. Navigate to the "Ticket Management" section.
2. Click the "Generate Report" button.  
   **Expected Results:** Report generation fails, and an error message is displayed: "No ticket data available to generate a report."  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 035
**Test Case ID:** TC_Admin_035  
**Test Scenario:** Delete booking.  
**Precondition:** Admin is logged in, and users exist in the system.  
**Test Steps:**
1. Navigate to the "Ticket Management" section.
2. Select a ticket and click the "Delete" button.  
   **Expected Results:** Ticket is successfully deleted, and a confirmation message is displayed.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 036
**Test Case ID:** TC_Admin_036  
**Test Scenario:** Display all reviews.  
**Precondition:** Admin is logged in.  
**Test Steps:**
1. Navigate to the “Review Management” section.
2. View the list of all reviews.  
   **Expected Results:** All review details are displayed in a paginated table.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 037
**Test Case ID:** TC_Admin_037  
**Test Scenario:** Attempt to generate a report.  
**Precondition:** Admin is logged in.  
**Test Steps:**
1. Navigate to the "Review Management" section.
2. Generate a report.  
   **Expected Results:** Successfully generate a report and download.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

### Test Case 038
**Test Case ID:** TC_Admin_038  
**Test Scenario:** Delete a review.  
**Precondition:** Admin is logged in.  
**Test Steps:**
1. Navigate to the "Review Management" section.
2. Select a review and click "Delete."  
   **Expected Results:** Successfully delete the review.  
   **Actual Result:** [After Execution]  
   **Status:** [Pass / Fail]  
   **Remarks:** [Any Observation]

---

