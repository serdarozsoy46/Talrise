package stepDefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import static io.restassured.RestAssured.*;
import utilities.ConfigurationReader;

public class Hooks {

    @Before
    public void setUp(){
        baseURI = ConfigurationReader.get("url");
    }

    @After
    public void tearDown(){
        reset(); //UI'daki close ile ayni
    }

}
