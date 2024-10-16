package pages;

import org.openqa.selenium.By;

public class TenderPage extends BasePage {
    private By menuButton = By.xpath("//td[@title='menu']");
    private By tenderSpotButton = By.xpath("//tbody/tr[3]/td[1]/a[1]");
    private By botonSpotButton = By.cssSelector(".boton_spot");
    private By mode = By.cssSelector(".fas.fa-truck.boton_wizard");
    private By tipo = By.cssSelector(".form-check-input");
    private By createTenderButton = By.id("botonCrear");

    public void navigateToTenderSpot() {
        clickElement(menuButton);
        clickElement(tenderSpotButton);
    }

    public void createTender() {
        clickElementInIframe(0, botonSpotButton); // Clic en el botón "spot"
        clickElementInIframe(0, mode); // Selecciona el modo
        clickElementInIframe(0, tipo); // Selecciona el tipo
        clickElementInIframe(0, createTenderButton); // Clic en el botón de crear tender
    }
}

