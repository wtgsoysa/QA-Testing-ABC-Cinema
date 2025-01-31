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

    @Test(priority =1)
    public void createAccount() {

        System.out.println("\n --------------|| ABC_CINEMA_MAIN_WEBSITE_TEST ||---------------");
        System.out.println("User Authentication");
        System.out.println("\nTest Case   : 001");
        System.out.println("Test Scenario : User Register with Valid Details ");

        createAccountPage.clickLoginButton();
        createAccountPage.clickSignUpButton();

        String createAccountPageExpectedHeading = createAccountPage.getRegisterPageHeading();
        String createAccountPageActualHeading = "Create an Account";

        if(createAccountPageActualHeading.equals(createAccountPageExpectedHeading)) {
            System.out.println("Pre-Condition : Successfully navigate to the Registration Page");
        }
        else {
            System.out.println("Pre-Condition : Failed navigating to the Registration Page");
        }



        createAccountPage.enterUsername("Test");
        createAccountPage.enterEmail("Test@test.com");
        createAccountPage.enterPassword("Test1234");

        // Click the Create Account Button
        createAccountPage.clickCreateButton();

        String loginPageExpectedHeading = createAccountPage.getRegisterPageHeading();
        String loginPageActualHeading = "Log in to your Account";

        if(loginPageActualHeading.equals(loginPageExpectedHeading)) {
            System.out.println("Actual Result : Successfully Registered and Redirect to the 'login' page");
        }
        else {
            System.out.println("Actual Result : Failed Registered and Redirect to the 'login' page");
        }



    }


}
