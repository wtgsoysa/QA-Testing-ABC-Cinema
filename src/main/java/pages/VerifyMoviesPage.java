package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class VerifyMoviesPage {

    WebDriver driver;

    // XPaths for headings
    private By moviesInTheaterHeading = By.xpath("//section[1]/div[1]/h2");
    private By moviesReleasingSoon = By.xpath("//section[2]/div[1]/h2");

    // Sections containing movie cards
    private By moviesInTheaterSection = By.xpath("/html/body/div/section[1]");
    private By moviesReleasingSection = By.xpath("/html/body/div/section[2]");

    private By MoviesInTheatersViewAll = By.xpath("/html/body/div[1]/section[1]/div[1]/p/a");
    private By MoviesReleasingSoonViewAll = By.xpath("/html/body/div[1]/section[2]/div[1]/p/a");

    private By getMovieInTheaterViewAllHeading = By.xpath("/html/body/div[1]/section[1]/div[1]/h2");
    private By getMovieReleasingSoonViewAllHeading = By.xpath("/html/body/div[1]/section[2]/div[1]/h2");

    private By getMoviesInTheatersViewAllSection = By.xpath("/html/body/div[1]/section[1]/div[2]");
    private By getMoviesReleasingSoonViewAllSection = By.xpath("/html/body/div[1]/section[2]/div[2]");

    // Constructor
    public VerifyMoviesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Get section headings
    public String getMoviesInTheaterHeading() {
        return driver.findElement(moviesInTheaterHeading).getText();
    }

    public String getMoviesReleasingSoon() {
        return driver.findElement(moviesReleasingSoon).getText();
    }

    // Get list of movie cards in 'Movies in Theaters' section
    public List<WebElement> getMoviesInTheaterSection() {
        return driver.findElements(moviesInTheaterSection);
    }

    // Get list of movie cards in 'Movies Releasing Soon' section
    public List<WebElement> getMoviesReleasingSection() {
        return driver.findElements(moviesReleasingSection);
    }

    public void setMoviesInTheaterHeading(){
        driver.findElement(moviesInTheaterHeading).click();
    }

    public void setMoviesReleasingSoon(){
        driver.findElement(moviesReleasingSoon).click();
    }

    public void setMoviesInTheaterSection(){
        driver.findElement(moviesInTheaterSection).click();
    }

    public void clickMoviesInTheatersViewAll(){
        driver.findElement(moviesInTheaterSection).click();
    }

    public void clickMoviesReleasingSoonViewAll(){
        driver.findElement(moviesReleasingSoon).click();
    }

    public String getMoviesInTheatersViewAllHeading() {
        return driver.findElement(moviesInTheaterSection).getText();
    }

    public String getMoviesReleasingSoonViewAllHeading() {
        return driver.findElement(getMovieReleasingSoonViewAllHeading).getText();
    }

    public List<WebElement>  allMoviesInTheatersViewAll(){
        return driver.findElements(moviesInTheaterSection);
    }

    public List<WebElement>  getMoviesInTheatersViewAllSection(){
        return driver.findElements(getMoviesReleasingSoonViewAllSection);
    }
}
