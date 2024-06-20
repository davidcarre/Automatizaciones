package steps;

import io.cucumber.java.en.*;
import pages.Pagprincipal;

public class UbikaSteps {

    Pagprincipal ubika = new Pagprincipal();

    @Given("Yo quiero acceder a la pagina")
    public void navegarUbika() {
        ubika.navigateToUbika();
    }

    @When("Escribo email")
    public void enterTextEmail() {
        ubika.enterText("dcarreno@fagorelectronica.com.co");
    }

    @And("Escribo password")
    public void enterTextPass() {
        ubika.enterPassword("MPxjsgo5");
    }

    @And("clickar login")
    public void clickEntrar() {
        ubika.clickLoginButton();
    }

    @And("Entro al menu")
    public void clickMenu() {
        ubika.showMenu();
    }

    @And("click en tender spot")
    public void clickTender() {
        ubika.enterTS();
    }

    @And("click en crear")
    public void clickCrearSpot() {
        ubika.createTender();
    }
}
