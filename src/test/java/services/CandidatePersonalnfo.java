package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojo.PersonalInfo;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static utilities.Login_token.loginCandidateUserToken;

public class CandidatePersonalnfo extends PersonalInfo {
/*
    {
        "talriseUserId": 3540,
                "candidateId": 1703,
                "firstName": "serdar",
                "lastName": "ozsoy",
                "linkedIn": "linkedin.com/in/ozsoyserdar",
                "email": "serdar_ozsoy@msn.com",
                "countryPhoneCode": "+44",
                "mobile": "07877801727",
                "countryId": 3,
                "cityId": 11
    }
*/

@Test
    public void InfoManual(){

        String url = "https://apiserver2.app.talrise.com/api/candidate/personnelInfo";

        Map<String,Object> requestBody= new HashMap<>();
        requestBody.put("talriseUserId",3540);
        requestBody.put("candidateId",1703);
        requestBody.put("firstName","serdar");
        requestBody.put("lastName","ozsoy");
        requestBody.put("linkedIn","linkedin.com/in/ozsoyserdar");
        requestBody.put("mobile","07877801727");
        requestBody.put("countryId",3);
        requestBody.put("cityId",11);

        Response response = given().contentType(ContentType.JSON).headers
                ("Authorization","Bearer "+loginCandidateUserToken()).
                body(requestBody).log().all().put(url).prettyPeek();


        response.then().assertThat().statusCode(204);

    }

    @Test
    public void personalPojo(){
        String url = "https://apiserver2.app.talrise.com/api/candidate/personnelInfo";

        PersonalInfo personalInfo = new PersonalInfo(3540,1703,"serdar","ozsoy","linkedin.com/in/ozsoyserdar","serdar_ozsoy@msn.com","+44",
                "07877801727",3,11);

        Response response = given().contentType(ContentType.JSON).headers
                        ("Authorization","Bearer "+loginCandidateUserToken()).
                body(personalInfo).log().all().put(url).prettyPeek();

        response.then().assertThat().statusCode(204);

    }
}
