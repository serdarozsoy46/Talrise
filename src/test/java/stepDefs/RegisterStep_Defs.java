package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Register;

public class RegisterStep_Defs {

    Register register = new Register();

    @Given("User makes request for registration with valid information")
    public void user_makes_request_for_registration_with_valid_information() {
        // Write code here that turns the phrase above into concrete actions
        register.registerRequest();
    }

    @Then("User receives response and verify register with status code {int}")
    public void userReceivesResponseAndVerifyRegisterWithStatusCode(int statusCode) {
        register.verifyStatusCode(statusCode);
    }



}
