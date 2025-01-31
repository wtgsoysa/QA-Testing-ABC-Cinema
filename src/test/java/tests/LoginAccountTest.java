package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.LoginAccountPage;
import testBase.TestBase;

public class LoginAccountTest extends TestBase {

    LoginAccountPage loginAccountPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod
    public void setUp() {
        initializerDriver();
        loginAccountPage = new LoginAccountPage(driver);
        createAccountPage = new CreateAccountPage(driver);
    }

    @Test(priority = 1)
    public void testLoginAccount() {
        System.out.println("\n--------------|| ABC_CINEMA_MAIN_WEBSITE_TEST ||---------------");
        System.out.println("User Authentication Test Suite");

        // Test Case 001: Login with correct credential
        System.out.println("\nTest Case ID: TC_Main_003");
        System.out.println("Test Scenario: Login with correct credentials.");

        createAccountPage.clickLoginButton();


        String loginPageExpectedHedaing = createAccountPage.getLoginPageHeading();
        String loginPageActualHeading = "Log in to your Account";

        if(loginPageActualHeading.equals(loginPageExpectedHedaing)) {
            System.out.println("Precondition: User Successfully Navigate to the login page");
        }
        else{
            System.out.println("Precondition: User Unsuccessfully Navigate to the login page");
        }

        loginAccountPage.loginEmailFiled("Test@test.com");
        loginAccountPage.loginPasswordField("Test1234");

        // click the login button
        loginAccountPage.loginButton();

        String welcomeUserExpectedText = loginAccountPage.welcomeUser();
        String  welcomeUserActualText ="Welcome, Test";

        if(welcomeUserActualText.equals(welcomeUserExpectedText)) {
            System.out.println("Actual Result: User Successfully Navigate to the welcome page");
            System.out.println("Status: PASS");
        }
        else{
            System.out.println("Actual Result: User Unsuccessfully Navigate to the welcome page");
            System.out.println("Status: FAIL");
        }

        loginAccountPage.logout();






        // Test Case 004: Login with incorrect credential
        System.out.println("\nTest Case ID: TC_Main_004");
        System.out.println("Test Scenario: Login with invalid email.");

        loginAccountPage.loginButton();






        String expectedErrorMessage = "Please enter a valid email address.";
        String actualErrorMessage = loginAccountPage.gerErrorMessage();

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Actual Result: Error message displayed - 'Please enter a valid email address.'");
            System.out.println("Status: PASS");
        } else {
            System.out.println("Actual Result: No proper error message displayed for invalid email format.");
            System.out.println("Status: FAIL");
        }









    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
