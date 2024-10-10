package pages;

import java.time.Duration;
import org.openqa.selenium.By;

public class PagPrincipal extends BasePage {
    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    private By loginButton = By.xpath("//button[@id='boton']");
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By menuButton = By.xpath("//td[@title='menu']");
    private By tenderSpotButton = By.xpath("//tbody/tr[3]/td[1]/a[1]");
    private By botonSpotButton = By.cssSelector(".boton_spot"); // Cambiado a cssSelector
    private By mode = By.cssSelector(".fas.fa-truck.boton_wizard"); // Cambiado a cssSelector para múltiples clases
    private By tipo = By.cssSelector(".form-check-input");
    private By create = By.id("botonCrear");




    public PagPrincipal() {
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
        clickElementInIframe(0, botonSpotButton); 
    }

    public void tenderSelected() {
        clickElementInIframe(0, mode);
    }

    public void type(){
        clickElementInIframe(0, tipo);
    }
    public void creation(){
        clickElementInIframe(0, create);
    }


}