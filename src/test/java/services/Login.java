package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Login {


    static String token;
    static String email;
    String firstName;
    String linkedIn;
    Response response;
    public void loginWithValidInfo(){

        /*
        {
  "email": "ayazilitas@gmail.com",
  "password": "Test123456!"
}
         */

        String body="        {\n" +
                "  \"email\": \"serdar_ozsoy@msn.com\",\n" +
                "  \"password\": \"Test123456!\"\n" +
                "}";

        response= given().contentType(ContentType.JSON).
                body(body).log().all().
                when().post("/auth/login").prettyPeek();

        token=response.jsonPath().getString("data.token");
        email=response.jsonPath().getString("data.email");
        firstName=response.jsonPath().getString("data.firstName");
        linkedIn=response.jsonPath().getString("data.linkedIn");
    }

    public void verifyStatuscode(int StatusCode){

        Assert.assertEquals(StatusCode,response.statusCode());
       // Assert.assertEquals(StatusCode,response.statusCode());
         Assert.assertNotNull(response.jsonPath().getString("data.token"));
       // Assert.assertNotNull(token)
    Assert.assertEquals("serdar",response.jsonPath().getString("data.firstName"));
    Assert.assertEquals("serdar_ozsoy@msn.com",response.jsonPath().getString("data.email"));
    Assert.assertEquals("linkedin.com/in/ozsoyserdar",response.jsonPath().getString("data.linkedIn"));

    }

    public void loginWithParameter(String email, String passWord){
        Map<String, Object> body= new HashMap<>();
        body.put("email",email);
        body.put("password",passWord);

        response= given().contentType(ContentType.JSON).
                body(body).log().all().
                with().post("auth/login").prettyPeek();




    }
}
