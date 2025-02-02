package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.VerifyMoviesPage;
import testBase.TestBase;
import utils.ExtentManager;

import java.util.List;

public class VerifyMoviesTest extends TestBase {
    VerifyMoviesPage verifyMoviesPage;
    ExtentTest test;

    @BeforeMethod
    public void setup() {
        initializerDriver();
        verifyMoviesPage = new VerifyMoviesPage(driver);
    }

    @Test(priority = 1)
    public void verifyMoviesTest11() {
        test = ExtentManager.createTest("Movies in Theaters and Movies Releasing Soon Test").assignCategory("Movies Category");

        test.log(Status.INFO, "Verifying Movies in Theaters and Movies Releasing Soon categories");

        String expectedMovieInTheatersHeading = "Movies in Theaters";
        String actualMovieInTheatersHeading = verifyMoviesPage.getMoviesInTheaterHeading();

        if (actualMovieInTheatersHeading.equals(expectedMovieInTheatersHeading)) {
            test.log(Status.PASS, "'Movies in Theaters' heading displayed correctly.");
        } else {
            test.log(Status.FAIL, "'Movies in Theaters' heading mismatch.");
            Assert.fail();
        }

        List<WebElement> moviesInTheaters = verifyMoviesPage.getMoviesInTheaterSection();
        if (!moviesInTheaters.isEmpty()) {
            test.log(Status.PASS, "'Movies in Theaters' section contains movies.");
        } else {
            test.log(Status.FAIL, "'Movies in Theaters' section is empty.");
            Assert.fail();
        }

        List<WebElement> moviesReleasingSoon = verifyMoviesPage.getMoviesReleasingSection();
        if (!moviesReleasingSoon.isEmpty()) {
            test.log(Status.PASS, "'Movies Releasing Soon' section contains movies.");
        } else {
            test.log(Status.FAIL, "'Movies Releasing Soon' section is empty.");
            Assert.fail();
        }
    }

    @Test(priority = 2)
    public void viewAllMoviesInTheatersTest() {
        test = ExtentManager.createTest("View All Movies in Theaters Test").assignCategory("Movies Category");

        test.log(Status.INFO, "Verifying the View All functionality for Movies in Theaters");

        verifyMoviesPage.setMoviesInTheaterHeading();

        String expectedMoviesInTheatersViewAllHeading = "Movies in Theaters";
        String actualMoviesInTheatersViewAllHeading = verifyMoviesPage.getMoviesInTheaterHeading();

        if (actualMoviesInTheatersViewAllHeading.equals(expectedMoviesInTheatersViewAllHeading)) {
            test.log(Status.PASS, "'Movies in Theaters' page navigated successfully.");
        } else {
            test.log(Status.FAIL, "'Movies in Theaters' page navigation failed.");
            Assert.fail();
        }

        List<WebElement> moviesInTheatersViewAll = verifyMoviesPage.allMoviesInTheatersViewAll();
        if (!moviesInTheatersViewAll.isEmpty()) {
            test.log(Status.PASS, "'Movies in Theaters' section contains movies.");
        } else {
            test.log(Status.FAIL, "'Movies in Theaters' section is empty.");
            Assert.fail();
        }
    }

    @Test(priority = 3)
    public void viewAllMoviesReleasingSoonTest() {
        test = ExtentManager.createTest("View All Movies Releasing Soon Test").assignCategory("Movies Category");

        test.log(Status.INFO, "Verifying the View All functionality for Movies Releasing Soon");

        verifyMoviesPage.clickMoviesReleasingSoonViewAll();

        String expectedMoviesReleasingSoonAllHeading = "Movies Releasing Soon";
        String actualMoviesReleasingSoonViewAllHeading = verifyMoviesPage.getMoviesReleasingSoonViewAllHeading();

        if (actualMoviesReleasingSoonViewAllHeading.equals(expectedMoviesReleasingSoonAllHeading)) {
            test.log(Status.PASS, "'Movies Releasing Soon' page navigated successfully.");
        } else {
            test.log(Status.FAIL, "'Movies Releasing Soon' page navigation failed.");
            Assert.fail();
        }

        List<WebElement> moviesReleasingSoonViewAll = verifyMoviesPage.getMoviesReleasingSection();
        if (!moviesReleasingSoonViewAll.isEmpty()) {
            test.log(Status.PASS, "'Movies Releasing Soon' section contains movies.");
        } else {
            test.log(Status.FAIL, "'Movies Releasing Soon' section is empty.");
            Assert.fail();
        }
    }

    @Test(priority = 4)
    public void moviePreviewTest() {
        test = ExtentManager.createTest("Movie Preview Test").assignCategory("Movie Details");

        test.log(Status.INFO, "Verifying movie preview functionality.");

        verifyMoviesPage.clickMovieCard();

        String expectedMovieTitle = "Wicked";
        String actualMovieTitle = verifyMoviesPage.getTheMovieTitle();

        if (actualMovieTitle.equals(expectedMovieTitle)) {
            test.log(Status.PASS, "Navigated to Movie Preview page successfully.");
        } else {
            test.log(Status.FAIL, "Navigation to Movie Preview page failed.");
            Assert.fail();
        }

        test.log(Status.INFO, "Verifying the 'Book Now' button functionality.");
        verifyMoviesPage.clickBookNowButton();

        String expectedBookNowSection = "Select Your Seats Here";
        String actualBookNowSection = verifyMoviesPage.getBookingSection();

        if (actualBookNowSection.equals(expectedBookNowSection)) {
            test.log(Status.PASS, "Navigated to 'Booking' section successfully.");
        } else {
            test.log(Status.FAIL, "Navigation to 'Booking' section failed.");
            Assert.fail();
        }
    }

    @AfterMethod
    public void tearDown() {
        ExtentManager.flushReports();
        driver.quit();
    }
}
