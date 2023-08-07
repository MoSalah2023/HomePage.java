package runner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(
//        features = "src/test/resources",
//        glue = "steps",
//        plugin = {"pretty", "html:target/cucumber-reports"}
////        tags = "@void"
//)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps"
)
public class TestRunner extends TestBase {

}
