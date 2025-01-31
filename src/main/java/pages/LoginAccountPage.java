package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAccountPage {

    WebDriver driver;


    private By loginEmailFiled = By.xpath("//*[@id=\"email\"]");
    private By loginPasswordField = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.xpath("/html/body/div/form/button");
    private By forgotPasswordButton = By.xpath("/html/body/div[1]/form/div/a");
    private By welcomeUser = By.xpath("/html/body/div[1]/nav[1]/div/div[2]/span");
    private By logout = By.xpath("/html/body/div[1]/nav[1]/div/div[2]/a");
    private By errorMessage = By.xpath("/html/body/div[1]");


    //Reset Password section
    private By forgotPassword = By.xpath("/html/body/div[1]/form/div/a");
    private By resetPageHeading = By.xpath("/html/body/div[1]/p");
    private By resetEmailField = By.xpath("//*[@id=\"email\"]");
    private By resetLinkSendButton = By.xpath("/html/body/div[1]/a/div");
    private By afterResetLoginPage = By.xpath("/html/body/h1");

    public LoginAccountPage(WebDriver driver) {
        this.driver = driver;
    }



    public void loginEmailFiled(String login_email) {
        driver.findElement(loginEmailFiled).sendKeys(login_email);
    }

    public void loginPasswordField(String login_password) {
        driver.findElement(loginPasswordField).sendKeys(login_password);
    }

    public void loginButton() {
        driver.findElement(loginButton).click();
    }

    public String welcomeUser() {
        return driver.findElement(welcomeUser).getText();
    }

    public void logout() {
        driver.findElement(logout).click();
    }

    public String gerErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void forgotPassword() {
        driver.findElement(forgotPassword).click();
    }

    public String getResetPageHeading() {
        return driver.findElement(resetPageHeading).getText();
    }

    public void getResetEmailField(String reset_email) {
        driver.findElement(resetEmailField).sendKeys(reset_email);
    }

    public void getResetLinkSendButton() {
        driver.findElement(resetLinkSendButton).click();
    }

    public String afterResetLoginPage() {
        return driver.findElement(afterResetLoginPage).getText();
    }


}
