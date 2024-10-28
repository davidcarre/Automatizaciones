package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class OfferPage extends BasePage {
    private By cotice = By.id("continuar");
    private By Go = By.xpath("//span[text()='EMPEZAR']");

    public void offers() {
        clickElement(cotice);
        clickElement(Go);
    }

}
