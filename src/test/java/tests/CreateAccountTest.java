package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import testBase.TestBase;

import static testBase.TestBase.driver;

public class CreateAccountTest extends TestBase {

    CreateAccountPage createAccountPage;

    @BeforeMethod
    public void setUp() {
        initializerDriver();
        createAccountPage = new CreateAccountPage(driver);
    }

    @Test(priority = 1)
    public void createAccountValidDetails() {

        System.out.println("\n--------------|| ABC_CINEMA_MAIN_WEBSITE_TEST ||---------------");
        System.out.println("User Authentication Test Suite");

        // Test Case 001: Register with valid details
        System.out.println("\nTest Case ID: TC_Main_001");
        System.out.println("Test Scenario: Register with valid details");

        createAccountPage.clickLoginButton();
        createAccountPage.clickSignUpButton();

        String createAccountPageExpectedHeading = "Create an Account";
        String createAccountPageActualHeading = createAccountPage.getRegisterPageHeading();

        if (createAccountPageActualHeading.equals(createAccountPageExpectedHeading)) {
            System.out.println("Precondition: Successfully navigated to the Registration Page.");
        } else {
            System.out.println("Precondition: Failed to navigate to the Registration Page.");
        }

        // Filling in the registration details
        createAccountPage.enterUsername("Test");
        createAccountPage.enterEmail("Test@test.com");
        createAccountPage.enterPassword("Test1234");

        // Clicking the Create Account Button
        createAccountPage.clickCreateButton();

        String loginPageExpectedHeading = "Log in to your Account";
        String loginPageActualHeading = createAccountPage.getRegisterPageHeading();

        if (loginPageActualHeading.equals(loginPageExpectedHeading)) {
            System.out.println("Actual Result: User successfully registered and redirected to the login page.");
        } else {
            System.out.println("Actual Result: Registration failed, user was not redirected to the login page.");
        }

        //--------------------------------------------------------------------------------------------------------------------

        // Test Case 002: Register with an already existing email
        System.out.println("\nTest Case ID: TC_Main_002");
        System.out.println("Test Scenario: Register with an already existing email");

        createAccountPage.clickSignUpButton();

        if (createAccountPageActualHeading.equals(createAccountPageExpectedHeading)) {
            System.out.println("Precondition: Successfully navigated to the Registration Page.");
        } else {
            System.out.println("Precondition: Failed to navigate to the Registration Page.");
        }

        // Filling in the registration details with an existing email
        createAccountPage.enterUsername("Test");
        createAccountPage.enterEmail("Test@test.com");
        createAccountPage.enterPassword("Test1234");

        // Clicking the Create Account Button
        createAccountPage.clickCreateButton();

        if (loginPageActualHeading.equals(loginPageExpectedHeading)) {
            System.out.println("Actual Result: Error message not displayed. User can register already used Email.");
        } else {
            System.out.println("Actual Result: User was shown an error message indicating the email is already in use.");
        }
    }
}
