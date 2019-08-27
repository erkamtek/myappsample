package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @Then("^I click should see the userform page$")
    public void ıClickShouldSeeTheUserformPage() throws Throwable {
        System.out.println("User should see the userform page");
        throw new PendingException();
    }

    @Given("^I navigate to the login page$")
    public void ıNavigateToTheLoginPage() throws Throwable {
        System.out.println("User navigate the login page");
        throw new PendingException();
    }

    @And("^I enter the username as admin and password as admin$")
    public void ıEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        System.out.println("User enter username and password");
        throw new PendingException();
    }

    @And("I click to login button$")
    public void ıClickToLoginButton() throws Throwable {
        System.out.println("User click to login button");
        throw new PendingException();
    }

    @And("^I enter the following  for Login$")
    public void ıEnterTheFollowingForLogin(DataTable table) throws Throwable {




        throw new PendingException();
    }
}
