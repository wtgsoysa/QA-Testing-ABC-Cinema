package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    WebDriver driver;

    //Locators
    private By loginButton = By.xpath("/html/body/div[1]/nav[1]/div/div[2]/a");
    private By signUpButton = By.xpath("/html/body/div[1]/div/p/a");
    private By registerPageHeading = By.xpath("/html/body/div[1]/p");
    private By usernameField = By.xpath("//*[@id=\"name\"]");
    private By emailField = By.xpath("//*[@id=\"email\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By createButton = By.xpath("/html/body/div[1]/form/button");
    private By loginPageHeading = By.xpath("/html/body/div[1]/p");

    // Constructor
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public String getRegisterPageHeading() {
        return driver.findElement(registerPageHeading).getText();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickCreateButton() {
        driver.findElement(createButton).click();
    }

    public String getLoginPageHeading() {
        return driver.findElement(loginPageHeading).getText();
    }



}
