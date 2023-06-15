package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Login;
import services.POJOLogin;

public class LoginStep_Defs {

    Login login = new Login();
    POJOLogin pojoLogin= new POJOLogin();

    @Given("User makes request for login with valid information")
    public void userMakesRequestForLoginWithValidInformation() {
       // login.loginWithValidInfo();
        pojoLogin.pojoLogin();
    }
    @Given("user makes request to login with {string} and {string}")
    public void userMakesRequestToLoginWithAnd(String email, String password) {
        login.loginWithParameter(email,password);
    }
    @Then("Verify login with status code {int}")
    public void verifyLoginWithStatusCode(int statusCode) {
       // login.verifyStatuscode(statusCode);
        pojoLogin.verifyPOJOlogin(statusCode);
    }
}
