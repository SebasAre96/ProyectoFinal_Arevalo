package ar.org.proyectoFinal.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By errorMessage = By.cssSelector(".oxd-alert-content-text");

    private static final String URL = "https://opensource-demo.orangehrmlive.com";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goTo() {
        driver.get(URL);
        return this;
    }

    public LoginPage enterUserName(String username) {
        type(usernameField, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        type(passwordField, password);
        return this;
    }

    public DashboardPage clickLogin() {
        click(loginButton);
        return new DashboardPage(driver);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public DashboardPage loginAs(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        return clickLogin();
    }

    public boolean isErrorDisplayed() {
        return isElementVisible(errorMessage);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }

    public boolean isOnLoginPage() {
        return isElementVisible(loginButton);
    }

    public boolean isLoginButtonDisplayed() {
        return isElementVisible(loginButton);
    }


}
