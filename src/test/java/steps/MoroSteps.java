package steps;

import actions.CommonActions;
import actions.MoroActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoroSteps {

    CommonActions commonActions;
    MoroActions moroActions;

    public MoroSteps(CommonActions commonActions, MoroActions moroActions) {
        this.commonActions = commonActions;
        this.moroActions = moroActions;
    }

    @Given("I am on Google website")
    public void iAmOnGoogleWebsite() {
        commonActions.goToUrl("https://www.google.com/");
    }

    @When("I type {string} into the Google search bar")
    public void iTypeIntoTheGoogleSearchBar(String str) {
        commonActions.searchItem(str);
        commonActions.clickOnSearchButton();
    }

    @And("I click on MoroSystems website")
    public void iClickOnWebsite() {
        commonActions.clickOnLinkByText();
    }

    @Then("I navigate to {string} section")
    public void iNavigateToSection(String str) {
        moroActions.clickOnLinkByText(str);
    }


}
