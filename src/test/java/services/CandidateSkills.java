package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojo.InnerSkill;
import pojo.Skills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static utilities.Login_token.loginCandidateUserToken;

public class CandidateSkills {
/*    {
        "skills": [
        {
            "experienceYearsId": 35,
                "toolId": 2714
        }
    ]
    }*/

    @Test
    public void SkillsWithMap(){

        String url = "https://apiserver2.app.talrise.com/api/candidate/positions";

        Map<String,Integer> innerMap = new HashMap<>();
        innerMap.put("experienceYearsId",35);
        innerMap.put("toolId",2714);

        List<Object>innerList=new ArrayList<>();
        innerList.add(innerMap);

        Map<String,Object>requestBody=new HashMap<>();
        requestBody.put("skills",innerList);

        Response response= given().contentType(ContentType.JSON).headers("Authorization","Bearer " +loginCandidateUserToken()).
                body(requestBody).log().all().put(url).prettyPeek();

        response.then().assertThat().statusCode(204);
    }



    @Test
    public void skillsWithPojo(){

        String url = "https://apiserver2.app.talrise.com/api/candidate/skills";

        InnerSkill innerSkill = new InnerSkill(35,2714);
        List<InnerSkill>innerSkillList = new ArrayList<>();
        innerSkillList.add(innerSkill);

        Skills requestBody = new Skills(innerSkillList);

        Response response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + loginCandidateUserToken())
                .body(requestBody).log().all().put(url).prettyPeek();


        response.then().assertThat().statusCode(204);


    }
}
