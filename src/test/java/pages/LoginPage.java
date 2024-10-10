package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@id='boton']");

    public LoginPage() {
        super();
    }

    public void navigateToUbika() {
        navigateTo("https://ategi.ubika.es:8501/publica/");
    }

    public void enterUsername() {
        write(usernameField, "dcarreno@fagorelectronica.com.co");
    }

    public void enterPassword() {
        write(passwordField, "MPxjsgo5");
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }
}
