package ar.org.proyectoFinal.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    private By pimMenu = By.xpath("//span[text()='PIM']");
    private By userMenu = By.cssSelector(".oxd-userdropdown-name");
    private By logoutButton = By.xpath("//a[text()='Logout']");
    private By header = By.cssSelector(".oxd-topbar-header-breadcrumb");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public PIMPage goToPIM() {
        click(pimMenu);
        return new PIMPage(driver);
    }

    public LoginPage logout() {
        click(userMenu);
        click(logoutButton);
        return new LoginPage(driver);
    }

    public boolean isOnDashboard() {
        return getCurrentUrl().contains("dashboard")
                && isElementVisible(header);
    }

    public String getHeaderText() {
        return getText(header);
    }

}
