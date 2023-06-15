package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojo.InnerPozit;
import pojo.Pozit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static io.restassured.RestAssured.*;
import static utilities.Login_token.loginCandidateUserToken;

public class CandidatePozition {
//    {
//        "positions": [
//        {
//            "positionId": 89
//        },
//    ]
//    }

    @Test
    public void pozitionWithMap(){

      String url = "https://apiserver2.app.talrise.com/api/candidate/positions";

        Map<String,Integer>innerMap = new HashMap<>();
        innerMap.put("positionId",89);

        List<Object>innerList=new ArrayList<>();
        innerList.add(innerMap);

        Map<String,Object>requestBody=new HashMap<>();
        requestBody.put("positions",innerList);

        Response response= given().contentType(ContentType.JSON).headers("Authorization","Bearer " +loginCandidateUserToken()).
                body(requestBody).log().all().put(url).prettyPeek();

        response.then().assertThat().statusCode(204);
    }

    @Test
    public void positionWithPojo(){

        String url = "https://apiserver2.app.talrise.com/api/candidate/positions";

        InnerPozit innerPozit = new InnerPozit(641);
        List<InnerPozit>innerList=new ArrayList<>();
        innerList.add(innerPozit);

        Pozit requestBody = new Pozit(innerList);

        Response response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + loginCandidateUserToken())
                .body(requestBody).log().all().put(url).prettyPeek();

        response.then().assertThat().statusCode(204);


    }
}



