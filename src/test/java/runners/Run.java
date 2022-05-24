package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report.json"},
        monochrome = true,
        publish = true,
        features = {"classpath:feat/feat.feature"},
        glue = {"runners"}
)
//html:target/cucumber-report/report.html
//junit:target/cucumber-report/report.xml
public class  Run  {

}
