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

    //Click the movie card
    private By clickMovieCard = By.xpath("/html/body/div[1]/section[1]/div[2]/a[1]/div/img");

    private By getTheMovieTitle = By.xpath("/html/body/div[1]/section/div/div/div[2]/p[1]");

    //Click the 'Book Now' Button
    private By clickBookNowButton = By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/a[2]");
    private By bookingSection = By.xpath("/html/body/div[1]/section/section/p");

    private By selectSeat  = By.xpath("//*[@id=\"D10\"]");
    private By clickContinuePayment = By.xpath("/html/body/div[1]/section/section/div[5]/button[2]");

    private By datePicker = By.xpath("//*[@id=\"showDate\"]");

    private By reservationSummary = By.xpath("/html/body/div[1]/div/p[1]");

    //Complete the payment
    private By paymentName = By.xpath("//*[@id=\"name\"]");
    private By paymentMobileNumber = By.xpath("//*[@id=\"mobile\"]");
    private By paymentEmail = By.xpath("//*[@id=\"email\"]");
    private By paymentCardNumber = By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input");
    private By paymentDate = By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[1]/span/span/input");
    private By payementCVC = By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input");
    private By paymentCheckBox = By.xpath("//*[@id=\"terms\"]");
    private By paymentContinue = By.xpath("//*[@id=\"continue-button\"]");




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

    public void clickMovieCard(){
        driver.findElement(clickMovieCard).click();
    }

    public String getTheMovieTitle() {
        return driver.findElement(getTheMovieTitle).getText();
    }

    public void clickBookNowButton(){
        driver.findElement(clickBookNowButton).click();
    }

    public String getBookingSection() {
        return driver.findElement(bookingSection).getText();
    }

    public void selectSeat(){
        driver.findElement(selectSeat).click();
    }

    public void clickContinuePayment(){
        driver.findElement(clickContinuePayment).click();
    }

    public void selectDatePicker(String date){
        driver.findElement(datePicker).sendKeys(date);
    }

    public String getReservationSummary() {
        return driver.findElement(reservationSummary).getText();
    }

    public void payementName(String name){
        driver.findElement(paymentName).sendKeys(name);
    }

    public void payementMobileNumber(String mobile){
        driver.findElement(paymentMobileNumber).sendKeys(mobile);
    }

    public void payementEmail(String email){
        driver.findElement(paymentEmail).sendKeys(email);
    }

    public void payementCardNumber(String card){
        driver.findElement(paymentCardNumber).sendKeys(card);
    }

    public void payementDate(String date){
        driver.findElement(paymentDate).sendKeys(date);
    }

    public void payementCVC(String cv){
        driver.findElement(payementCVC).sendKeys(cv);
    }

    public void payementCheckBox(){
        driver.findElement(paymentCheckBox).click();
    }

    public void payementContinue(){
        driver.findElement(paymentContinue).click();
    }
}
