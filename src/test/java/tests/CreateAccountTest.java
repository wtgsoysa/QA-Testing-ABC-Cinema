package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import testBase.TestBase;
import utils.ExtentManager;

import static testBase.TestBase.driver;

public class CreateAccountTest extends TestBase {
    CreateAccountPage createAccountPage;
    ExtentTest test;

    @BeforeMethod
    public void setUp() {
        initializerDriver();
        createAccountPage = new CreateAccountPage(driver);
    }

    @Test(priority = 1)
    public void createAccountValidDetails() {
        test = ExtentManager.createTest("Create Account Test - Valid Details").assignCategory("User Authentication");

        test.log(Status.INFO, "Navigating to the login page");
        createAccountPage.clickLoginButton();
        createAccountPage.clickSignUpButton();

        String expectedHeading = "Create an Account";
        String actualHeading = createAccountPage.getRegisterPageHeading();

        if (actualHeading.equals(expectedHeading)) {
            test.log(Status.PASS, "Successfully navigated to the Registration Page.");
        } else {
            test.log(Status.FAIL, "Failed to navigate to the Registration Page.");
            Assert.fail();
        }

        createAccountPage.enterUsername("Test");
        createAccountPage.enterEmail("Test@test.com");
        createAccountPage.enterPassword("Test1234");

        test.log(Status.INFO, "Entering valid registration details and submitting the form");
        createAccountPage.clickCreateButton();

        String expectedLoginHeading = "Log in to your Account";
        String actualLoginHeading = createAccountPage.getRegisterPageHeading();

        if (actualLoginHeading.equals(expectedLoginHeading)) {
            test.log(Status.PASS, "User successfully registered and redirected to the login page.");
        } else {
            test.log(Status.FAIL, "User registration failed.");
            Assert.fail();
        }
    }

    @Test(priority = 2)
    public void createAccountExistingEmail() {
        test = ExtentManager.createTest("Create Account Test - Existing Email").assignCategory("User Authentication");

        test.log(Status.INFO, "Navigating to the registration page");
        createAccountPage.clickSignUpButton();

        String expectedHeading = "Create an Account";
        String actualHeading = createAccountPage.getRegisterPageHeading();

        if (actualHeading.equals(expectedHeading)) {
            test.log(Status.PASS, "Successfully navigated to the Registration Page.");
        } else {
            test.log(Status.FAIL, "Failed to navigate to the Registration Page.");
            Assert.fail();
        }

        createAccountPage.enterUsername("Test");
        createAccountPage.enterEmail("Test@test.com"); // Existing email
        createAccountPage.enterPassword("Test1234");

        test.log(Status.INFO, "Entering already registered email and submitting the form");
        createAccountPage.clickCreateButton();

        if (createAccountPage.isErrorMessageDisplayed()) {
            test.log(Status.PASS, "Error message displayed: Email is already in use.");
        } else {
            test.log(Status.FAIL, "No error message displayed. User could register with an existing email.");
            Assert.fail();
        }
    }

    @AfterMethod
    public void tearDown() {
        ExtentManager.flushReports();
        driver.quit();
    }
}
