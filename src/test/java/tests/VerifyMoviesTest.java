package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.VerifyMoviesPage;
import testBase.TestBase;

import java.util.List;

public class VerifyMoviesTest extends TestBase {
    VerifyMoviesPage verifyMoviesPage;
    @BeforeMethod
    public void setup(){
        initializerDriver();
        verifyMoviesPage = new VerifyMoviesPage(driver);
    }

    @Test(priority = 1)
    public void verifyMoviesTest11(){
        System.out.println("\n--------------|| ABC_CINEMA_MAIN_WEBSITE_TEST ||---------------");
        System.out.println("Movies Category Test Suite");

        // Test Case 006:
        System.out.println("\nTest Case ID: TC_Main_001");
        System.out.println("Test Scenario: Display movies categorized as \"Movies in Theaters\" and \"Movies Releasing Soon\".");

        String expectedMovieInTheatersHeading = verifyMoviesPage.getMoviesInTheaterHeading();
        String actualMoviesInTheatersHeading = "Movies in Theaters";

        if(expectedMovieInTheatersHeading.equals(actualMoviesInTheatersHeading)){
            System.out.println("Navigate to 'Movies in Theaters' page Successfully");
        }
        else{
            System.out.println("Navigate to 'Movies in Theaters' page Failed");
        }

        // Get movies in both sections
        List<WebElement> moviesInTheaters = verifyMoviesPage.getMoviesInTheaterSection();
        List<WebElement> moviesReleasingSoon = verifyMoviesPage.getMoviesReleasingSection();

        // Verify if movies exist in "Movies in Theaters" section
        if (!moviesInTheaters.isEmpty()) {
            System.out.println("Actual Results : 'Movies in Theaters' section contains movies.");
            System.out.println("Status : Pass");
        } else {
            System.out.println("Actual Results : 'Movies in Theaters' section is empty.");
            System.out.println("Status : Failed");
        }

        // Verify if movies exist in "Movies Releasing Soon" section
        if (!moviesReleasingSoon.isEmpty()) {
            System.out.println("Actual Results : 'Movies Releasing Soon' section contains movies.");
            System.out.println("Status : Pass");
        } else {
            System.out.println("Actual Results : 'Movies Releasing Soon' section is empty.");
            System.out.println("Status : Failed");
        }





    }



}
