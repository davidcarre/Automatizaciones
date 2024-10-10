package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.TenderPage;

public class UbikaSteps {

    private LoginPage loginPage = new LoginPage();
    private TenderPage TenderPage = new TenderPage();

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        loginPage.navigateToUbika();
    }

    @When("I enter the email and password")
    public void enterCredentials() {
        loginPage.enterUsername();
        loginPage.enterPassword();
    }

    @And("I click login")
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @And("I navigate to the tender creation page")
    public void navigateToTenderCreationPage() {
        TenderPage.navigateToTenderSpot();
        TenderPage.createTender();

    }

    @Then("I should see the tender creation page")
    public void validateTenderCreationPage() {

    }

}
