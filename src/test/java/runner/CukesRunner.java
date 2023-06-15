package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // plugin = "",
        features = "src/test/resources/features",
        glue = "stepDefs",
        dryRun = false,
        tags = ""

)

public class CukesRunner {

}
