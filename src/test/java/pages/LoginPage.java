package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@id='boton']");

    public void enterUsername(String username) {
        write(usernameField, username);
    }

    public void enterPassword(String password) {
        write(passwordField, password);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }
}
