package services;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class Create_Roles {

    Response response;

    public void createRoles(String role){

        response = RestAssured.given().contentType(ContentType.JSON).header("Authorization","Bearer " +Login.token).
                when().post("http://54.194.180.243:9002/api/user/"+role+"/create").prettyPeek();
    }

    public void verifyStatusCode(int StatusCode) {
       Assert.assertEquals(StatusCode,response.statusCode());
    }
}
