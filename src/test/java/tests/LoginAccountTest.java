package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.LoginAccountPage;
import testBase.TestBase;
import utils.ExtentManager;

import static testBase.TestBase.driver;

public class LoginAccountTest extends TestBase {

    private LoginAccountPage loginAccountPage;
    private CreateAccountPage createAccountPage;
    private ExtentTest test;

    @BeforeMethod
    public void setUp() {
        initializerDriver();
        loginAccountPage = new LoginAccountPage(driver);
        createAccountPage = new CreateAccountPage(driver);
    }

    @Test(priority = 1)
    public void testLoginAccount() {
        test = ExtentManager.createTest("Login Account Test - Valid and Invalid Credentials")
                .assignCategory("User Authentication");

        test.log(Status.INFO, "Starting Login with Correct Credentials Test");
        loginWithValidCredentials();

        test.log(Status.INFO, "Starting Login with Invalid Credentials Test");
        loginWithInvalidEmail();
    }

    @Test(priority = 2)
    public void resetPassword() {
        test = ExtentManager.createTest("Password Reset Test")
                .assignCategory("User Authentication");

        test.log(Status.INFO, "Starting Password Reset Test");
        resetPasswordWithValidEmail();
    }

    private void loginWithValidCredentials() {
        createAccountPage.clickLoginButton();

        // Verify Login Page Heading
        String expectedHeading = "Log in to your Account";
        String actualHeading = createAccountPage.getLoginPageHeading();
        logNavigationStatus(expectedHeading, actualHeading);

        loginAccountPage.loginEmailFiled("Test@test.com");
        loginAccountPage.loginPasswordField("Test1234");
        loginAccountPage.loginButton();

        // Verify Welcome Page
        String expectedWelcomeText = "Welcome, Test";
        String actualWelcomeText = loginAccountPage.welcomeUser();
        logNavigationStatus(expectedWelcomeText, actualWelcomeText);

        loginAccountPage.logout();
    }

    private void loginWithInvalidEmail() {
        loginAccountPage.loginButton();

        String expectedErrorMessage = "Please enter a valid email address.";
        String actualErrorMessage = loginAccountPage.gerErrorMessage();
        logErrorMessage(expectedErrorMessage, actualErrorMessage);
    }

    private void resetPasswordWithValidEmail() {
        createAccountPage.clickLoginButton();
        loginAccountPage.forgotPassword();

        String expectedResetPageHeading = "Reset Your Password";
        String actualResetPageHeading = loginAccountPage.getResetPageHeading();
        logNavigationStatus(expectedResetPageHeading, actualResetPageHeading);

        loginAccountPage.getResetEmailField("Test@test.com");
        loginAccountPage.getResetLinkSendButton();

        String expectedLoginPageHeading = "Log in to your Account";
        String actualLoginPageHeading = loginAccountPage.afterResetLoginPage();
        logNavigationStatus(expectedLoginPageHeading, actualLoginPageHeading);
    }

    private void logNavigationStatus(String expected, String actual) {
        if (expected.equals(actual)) {
            test.log(Status.PASS, "Successfully navigated: " + expected);
        } else {
            test.log(Status.FAIL, "Navigation failed: Expected '" + expected + "', but got '" + actual + "'");
        }
    }

    private void logErrorMessage(String expected, String actual) {
        if (expected.equals(actual)) {
            test.log(Status.PASS, "Error message displayed as expected: " + expected);
        } else {
            test.log(Status.FAIL, "Error message not displayed as expected. Expected: '" + expected + "', but got '" + actual + "'");
        }
    }

    @AfterMethod
    public void tearDown() {
        ExtentManager.flushReports();
        driver.quit();
    }
}
