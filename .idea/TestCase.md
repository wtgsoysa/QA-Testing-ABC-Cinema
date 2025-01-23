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
- **Test Scenario:** Search for a movie by title.
- **Precondition:** Movies are available in the database.
- **Test Steps:**
    1. Open the homepage.
    2. Enter the movie title in the search bar.
    3. Click the "Search" button.
- **Expected Results:** The movie is displayed if it exists; otherwise, a "No Results Found" message appears.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 010
- **Test Case ID:** TC_Main_010
- **Test Scenario:** Filter movies by genre.
- **Precondition:** Movies are categorized by genre in the database.
- **Test Steps:**
    1. Open the "Movies" page.
    2. Select a genre from the filter options.
    3. Verify the displayed movies match the selected genre.
- **Expected Results:** Movies are filtered and displayed according to the selected genre.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 011
- **Test Case ID:** TC_Main_011
- **Test Scenario:** Add a movie to the watchlist.
- **Precondition:** User is logged in.
- **Test Steps:**
    1. Navigate to a movie details page.
    2. Click the "Add to Watchlist" button.
- **Expected Results:** Movie is added to the user's watchlist.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 012
- **Test Case ID:** TC_Main_012
- **Test Scenario:** Remove a movie from the watchlist.
- **Precondition:** User is logged in and has movies in their watchlist.
- **Test Steps:**
    1. Open the "Watchlist" page.
    2. Click the "Remove" button next to a movie.
- **Expected Results:** Movie is removed from the user's watchlist.
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
- **Expected Results:** User successfully purchases the ticket and receives a confirmation.
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
- **Test Scenario:** View promotions on the homepage.
- **Precondition:** Active promotions exist in the system.
- **Test Steps:**
    1. Open the homepage.
    2. Scroll to the "Promotions" section.
- **Expected Results:** Promotions are displayed with correct details.
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

### Test Case 017
- **Test Case ID:** TC_Main_017
- **Test Scenario:** View user profile details.
- **Precondition:** User is logged in.
- **Test Steps:**
    1. Open the "Profile" page.
    2. Verify the displayed user details are accurate.
- **Expected Results:** User profile details are displayed correctly.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 018
- **Test Case ID:** TC_Main_018
- **Test Scenario:** Update user profile information.
- **Precondition:** User is logged in.
- **Test Steps:**
    1. Open the "Profile" page.
    2. Edit the user information.
    3. Save the changes.
- **Expected Results:** User profile information is updated successfully.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 019
- **Test Case ID:** TC_Main_019
- **Test Scenario:** View booking history.
- **Precondition:** User has made previous bookings.
- **Test Steps:**
    1. Open the "Booking History" page.
    2. Verify the displayed history matches the user's previous bookings.
- **Expected Results:** Booking history is displayed accurately.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]

### Test Case 020
- **Test Case ID:** TC_Main_020
- **Test Scenario:** Contact customer support.
- **Precondition:** User requires assistance.
- **Test Steps:**
    1. Open the "Contact Us" page.
    2. Fill in the support form with details.
    3. Submit the form.
- **Expected Results:** Support request is submitted successfully, and the user receives a confirmation.
- **Actual Result:** [After Execution]
- **Status:** [Pass / Fail]
- **Remarks:** [Any Observation]