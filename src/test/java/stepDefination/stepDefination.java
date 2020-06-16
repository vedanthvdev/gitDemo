package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


	@RunWith(Cucumber.class)
		public class stepDefination {

    @Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        throw new PendingException();
        //go to login page
        
    }

    @When("^user logs in username and password$")
    public void user_logs_in_username_and_password() throws Throwable {
        throw new PendingException();
        //Login
        
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        throw new PendingException();
        //validate home page
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();
        //validate cards
    }

}