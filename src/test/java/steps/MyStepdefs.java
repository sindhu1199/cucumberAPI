package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("a user")
    public void aUser() {
        // create request

    }

    @When("updating the user")
    public void updatingTheUser() {
        // put request
    }

    @Then("the user is updated")
    public void theUserIsUpdated() {
        // assertion
    }

    @Given("creating a user")
    public void creatingAUser() {
    }

    @When("updating the user with invalid input")
    public void updatingTheUserWithInvalidInput() {
    }

    @Then("the user not to be updated")
    public void theUserNotToBeUpdated() {
    }

    @When("updating the user with invalid input {string} and <password>\"")
    public void updatingTheUserWithInvalidInputAndPassword(String arg0) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}