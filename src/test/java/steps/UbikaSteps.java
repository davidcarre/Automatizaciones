package steps;

import io.cucumber.java.en.*;
import pages.Pagprincipal;

public class UbikaSteps {

    private Pagprincipal ubika = new Pagprincipal();

    @Given("I want to access the page")
    public void navigateToUbika() {
        ubika.navigateToUbika();
    }

    @When("I enter the email")
    public void enterEmail() {
        ubika.enterUsername(System.getenv("UBIKA_USERNAME"));
    }

    @And("I enter the password")
    public void enterPassword() {
        ubika.enterPassword(System.getenv("UBIKA_PASSWORD"));
    }

    @And("I click login")
    public void clickLogin() {
        ubika.clickLoginButton();
    }

    @And("I enter the menu")
    public void clickMenu() {
        ubika.showMenu();
    }

    @And("I click tender spot")
    public void clickTenderSpot() {
        ubika.enterTenderSpot();
    }

    @And("I click tender")
    public void clickk() {
        ubika.createButton1();
    }

    
}
