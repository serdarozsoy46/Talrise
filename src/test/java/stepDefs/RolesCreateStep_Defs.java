package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Create_Roles;

public class RolesCreateStep_Defs {

    Create_Roles createRoles = new Create_Roles();

    @Given("user makes request to create {string} with authorization")
    public void userMakesRequestToCreateWithAuthorization(String role) {
       createRoles.createRoles(role);
    }

    @Then("verify the status code {int}")
    public void verifyTheStatusCode(int statusCode) {
        createRoles.verifyStatusCode(statusCode);
    }
}
