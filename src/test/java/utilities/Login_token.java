package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Login_token {

    public static String loginCandidateUserToken() {
        Map<String,String> requestMap=new HashMap<>();
        requestMap.put("email", "serdar_ozsoy@msn.com");
        requestMap.put("password","Test123456!");

        String url="http://54.194.180.243:9001/api/auth/login";

        Response response = given().when().contentType(ContentType.JSON).body(requestMap).post(url);
        return response.jsonPath().getString("data.token");
    }
}
