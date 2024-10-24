package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.CreationTenderPage;
import pages.NewTenderPage;

public class UbikaSteps {

    private LoginPage loginPage = new LoginPage();
    private CreationTenderPage creationTenderPage = new CreationTenderPage(); // Corrige la variable para seguir la convención
    private NewTenderPage newTenderPage = new NewTenderPage(); // Agrega la instancia de NewTenderPage

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        loginPage.navigateToUbika();
    }

    @When("I log in")
    public void enterCredentials() {
        loginPage.fields();
        loginPage.clickLoginButton();
    }

    @And("I navigate to the tender creation page")
    public void navigateToTenderCreationPage() {
        creationTenderPage.navigateToTenderSpot();
        creationTenderPage.createTender();
    }

    @And("I create the tender")
    public void tenderCreation(){
        newTenderPage.conditions();
        newTenderPage.trip();
        newTenderPage.commodity();
        newTenderPage.proovedores();
    }
}
