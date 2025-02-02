# ABC Cinema Main Website - Test Reports

This document provides an overview of the automation test reports for the **ABC Cinema Main Website**. It includes details of the executed test cases, their results, and associated screenshots.


## Test Reports with Screenshots

### Test Report for Create Account - Valid Details

#### Screenshot:
![Create Account - Valid Details](![Create Account Test.png](![CreateAccountTest.png](src/main/java/utils/images/CreateAccountTest.png)

#### Report:
The account creation with valid details was successful. The user was redirected to the homepage after account creation.

---

### Test Report for Login Account - Valid and Invalid Credentials

#### Screenshot:
![Login Account Test](![CreateAccountTest.png](src/main/java/utils/images/CreateAccountTest.png)

#### Report:
- The valid login test passed, and the user was redirected to the homepage.
- The invalid login test also passed, displaying an error message, and the user was not logged in.

---

### Test Report for Movies in Theaters and Movies Releasing Soon

#### Screenshot:
![Movies In Theaters Test](![Movies Theaters and Releasing Soon Test.png](src/main/java/utils/images/Movies%20Theaters%20and%20Releasing%20Soon%20Test.png)

#### Report:
Both the "Movies in Theaters" and "Movies Releasing Soon" sections displayed the correct movie information, including titles, release dates, and posters.

---

### Test Report for Create Account - Existing Email

#### Screenshot:
![Existing Email Test](![Create Account Test.png](src/main/java/utils/images/Create%20Account%20Test.png)

#### Report:
Attempting to create an account with an existing email showed an error message indicating that the email is already in use.

---

### Test Report for Password Reset

#### Screenshot:
![Password Reset Test](![PasswordResetTest.png](src/main/java/utils/images/PasswordResetTest.png)

#### Report:
The password reset functionality worked as expected. A password reset email was received, and the user was able to log in with the new password.

---

### Test Report for View All Movies in Theaters

#### Screenshot:
![View Movies in Theaters](![ViewAllMoveisInTheatersTest.png](src/main/java/utils/images/ViewAllMoveisInTheatersTest.png)

#### Report:
All movies currently playing in theaters were displayed correctly with their titles, release dates, and poster images.

---

### Test Report for View All Movies Releasing Soon

#### Screenshot:
![View Movies Releasing Soon](![ViewAllMovisReleasingSoonTest.png](src/main/java/utils/images/ViewAllMovisReleasingSoonTest.png)

#### Report:
All movies releasing soon were listed correctly with their titles, release dates, and posters.

---

## Summary

The tests for the **ABC Cinema Main Website** were executed successfully, with all features functioning as expected. Key functionalities such as account creation, login, movie management, and password reset were thoroughly validated.

---

## Future Test Plan

- **UI Enhancements**: Add additional UI testing to ensure that all elements are properly aligned and responsive.
- **Performance Testing**: Test for high traffic during peak times to ensure the website remains stable.
- **Security Testing**: Conduct penetration testing to identify and fix any security vulnerabilities.

For more details or issues, please refer to the test case results above.

---

**Date of Report Generation**: 03/02/2025  
**Tested by**: Thanuga Soysa 
**Project Version**: v1.0