package TestCCB.CCB;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\Feature",
		glue = "StepDeinitions",
		plugin = {"html:target/reportHomepage","json:target/Homepage-report-json.json"}
		//monochrome =true
		)
public class RunCucumberTest {
}