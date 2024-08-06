package in.Lic.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\balap\\eclipse-workspace\\browser\\AugestTask\\src\\test\\resources\\Feature\\Lic.feature",
                   glue= ("in.Insurance.StepDefinition"),
                   dryRun=false,
                   monochrome=true,
                   plugin= ("html:target//cucumber//report.html")
                     )
public class TestRunner {

}
