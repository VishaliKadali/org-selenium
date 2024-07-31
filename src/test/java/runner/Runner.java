package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/java/feature/Login.feature"},
glue={"steps","hooks"},
monochrome=true,publish=true,
plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports/cucumber.json"
    }
)

public class Runner extends AbstractTestNGCucumberTests{

	
	/*
	 * @DataProvider(parallel=true) public Object[][] scenarios() {
	 * return super.scenarios();
	 * 
	 * }
	 */
}
