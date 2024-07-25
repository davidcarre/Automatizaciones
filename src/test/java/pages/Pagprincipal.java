package pages;

import org.openqa.selenium.By;

public class Pagprincipal extends BasePage {

    private By loginButton = By.xpath("//button[@id='boton']");
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By menuButton = By.xpath("//td[@title='menu']");
    private By tenderSpotButton = By.xpath("//tbody/tr[3]/td[1]/a[1]");
    private By createButton = By.xpath("//tr[@id='4187']//i[@title='Eliminar']");
    //private By iframeLocator = By.id("myIframe"); // Reemplaza con el ID correcto del iframe

    public Pagprincipal() {
        super();
    }

    public void navigateToUbika() {
        navigateTo("https://ategi.ubika.es:8501/publica/");
    }

    public void enterUsername(String username) {
        write(usernameField, "dcarreno@fagorelectronica.com.co");
    }

    public void enterPassword(String password) {
        write(passwordField, "MPxjsgo5");
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public void showMenu() {
        clickElement(menuButton);
    }

    public void enterTenderSpot() {
        clickElement(tenderSpotButton);
    }
    public void createButton1() {
        clickElement(createButton);
    }
    
}
