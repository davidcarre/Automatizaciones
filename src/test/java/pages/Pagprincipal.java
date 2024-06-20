package pages;

import org.openqa.selenium.By;

public class Pagprincipal extends BasePage {

    private By searchButton = By.xpath("//button[@id='boton']");
    private By searchText = By.xpath("//input[@id='username']");
    private By searchPass = By.xpath("//input[@id='password']");
    private By clickMenu = By.xpath("//td[@title='menu']");
    private By clickTs = By.xpath("//*[@id='menu_modulos']/div[2]/table/tbody/tr[2]/td");
    private By create = By.className("boton_spot");  // Localización por clase

    public Pagprincipal() {
        super(driver);
    }

    public void navigateToUbika() {
        navigateTo("https://ategi.ubika.es:8501/publica/");
    }

    public void enterText(String text) {
        write(searchText, text);
    }

    public void enterPassword(String text) {
        write(searchPass, text);
    }

    public void clickLoginButton() {
        clickElement(searchButton);
    }

    public void showMenu() {
        clickElement(clickMenu);
    }

    public void enterTS() {
        clickElement(clickTs);
    }

    public void createTender() {
        clickElement(create);
    }
}
