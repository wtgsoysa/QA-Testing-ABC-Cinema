package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
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
        System.out.println("\nTest Case ID: TC_Main_006");
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

    @Test (priority = 2)
    public void viewAllMoviesInTheatersTest(){

        // Test Case 007:
        System.out.println("\nTest Case ID: TC_Main_007");
        System.out.println("Test Scenario : View movie details page for \"Movies in Theaters\"");

        // Click the Movies Releasing Soon (View All)
        verifyMoviesPage.setMoviesInTheaterHeading();

        String expectedMoviesInTheatersViewAllHeading = verifyMoviesPage.getMoviesInTheaterHeading();
        String actualMoviesInTheatersViewAllHeading = "Movies in Theaters";

        if(actualMoviesInTheatersViewAllHeading.equals(expectedMoviesInTheatersViewAllHeading)){
            System.out.println("Navigate to 'Movies in Theaters' page Successfully");
        }
        else{
            System.out.println("Navigate to 'Movies in Theaters' page Failed");
        }

        // Get movies in both sections
        List<WebElement> moviesInTheatersViewAll = verifyMoviesPage.allMoviesInTheatersViewAll();
        List<WebElement> moviesReleasingSoonViewAll = verifyMoviesPage.getMoviesReleasingSection();

        // Verify if movies exist in "Movies in Theaters" section
        if (!moviesInTheatersViewAll.isEmpty()) {
            System.out.println("Actual Results : 'Movies in Theaters' section contains movies.");
            System.out.println("Status : Pass");
        } else {
            System.out.println("Actual Results : 'Movies in Theaters' section is empty.");
            System.out.println("Status : Failed");
        }





    }

    @Test (priority = 3)
    public void viewAllMoviesReleasingSoonTest(){

        // Test Case 007:
        System.out.println("\nTest Case ID: TC_Main_008");
        System.out.println("Test Scenario : View movie details page for \"Movies Releasing Soon\"");

        // Click the Movies Releasing Soon (View All)
        verifyMoviesPage.clickMoviesReleasingSoonViewAll();

        String expectedMoviesReleasingSoonAllHeading = verifyMoviesPage.getMoviesReleasingSoonViewAllHeading();
        String actualMoviesReleasingSoonViewAllHeading = "Movies Releasing Soon";

        if(actualMoviesReleasingSoonViewAllHeading.equals(expectedMoviesReleasingSoonAllHeading)){
            System.out.println("Navigate to 'Movies Releasing Soon' page Successfully");
        }
        else{
            System.out.println("Navigate to 'Movies Releasing Soon' page Failed");
        }

        // Get movies in both sections

        List<WebElement> moviesReleasingSoonViewAll = verifyMoviesPage.getMoviesReleasingSection();

        // Verify if movies exist in "Movies in Theaters" section
        if (!moviesReleasingSoonViewAll.isEmpty()) {
            System.out.println("Actual Results : 'Movies Releasing Soon' section contains movies.");
            System.out.println("Status : Pass");
        } else {
            System.out.println("Actual Results : 'Movies Releasing Soon' section is empty.");
            System.out.println("Status : Failed");
        }


    }

    @Test (priority = 4)
    public void moviePreviewTest() {

        // Test Case 007:
        System.out.println("\nTest Case ID: TC_Main_009");
        System.out.println("Test Scenario : View movie details page for \"Movies in Theaters\"");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



}
