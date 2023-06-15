package services;


import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.ConfigurationReader;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;


public class Register {

    /*
    {
        "confirmPassword": "{{commonPassword}}",
        "disabled": true,
        "email": "{{name}}{{yopmail}}",
        "firstName": "{{$randomFirstName}}",
        "gdpr": true,
        "lastName": "{{$randomLastName}}",
        "linkedIn": "{{linkedIn}}{{name}}",
        "password": "{{commonPassword}}"
    }
    */


    Response response;
    Faker faker = new Faker();
    String email;
    String firstName;
    String lastName;
    String linkedIn;


    public void registerRequest() {
        String confirmPassword =ConfigurationReader.get("commonPassword");
        Boolean disabled =true;
        email =faker.internet().emailAddress();
        firstName =faker.name().firstName();
        Boolean gdpr =true;
        lastName =faker.name().lastName();
        linkedIn ="linkedin.com/in/"+firstName+lastName;



        Map<String, Object> body = new HashMap<>();
        body.put("confirmPassword", confirmPassword);
        body.put("disabled", disabled);
        body.put("email", email);
        body.put("firstName", firstName);
        body.put("gdpr", gdpr);
        body.put("lastName", lastName);
        body.put("linkedIn", linkedIn);
        body.put("password", confirmPassword);

        response = given().contentType(ContentType.JSON).
                body(body).log().all().
                post("http://54.194.180.243:9001/auth/register").prettyPeek();
    }


    public void verifyStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

}