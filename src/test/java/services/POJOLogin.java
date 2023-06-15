package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import org.junit.Test;
import pojo.LoginPOJO;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class POJOLogin {

    Response response;
    String firstName;
    String lastName;
@Test
    public void pojoLogin() {

        String email = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("commanPassword");

         LoginPOJO loginPOJO = new LoginPOJO(email,password);

  response = RestAssured.given().contentType(ContentType.JSON)
                .body(loginPOJO).log().all().post("auth/login").prettyPeek();

        firstName = response.jsonPath().getString("data.firstName");
        lastName = response.jsonPath().getString("data.lastName");

    }

    public void verifyPOJOlogin(int statusCode) {

        Assert.assertEquals(statusCode, response.statusCode());
        Assert.assertEquals("serdar", firstName);
        Assert.assertEquals("ozsoy", lastName);
    }



}