package steps;

import io.cucumber.java.en.*;
import pages.PagPrincipal;

public class UbikaSteps {

    private PagPrincipal ubika = new PagPrincipal();

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

    @And("I select tender")
    public void choose(){
        ubika.tenderSelected();
    }

    @And("I select configuration")
    public void tipo1(){
        ubika.type();
    }
    
    @And("I create tender")
    public void crear(){
        ubika.creation();
    }

    @Then("I will be see a tittle tender")
    public void validation(){
        
    }
}