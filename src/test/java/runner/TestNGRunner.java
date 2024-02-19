package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/features",glue= {"stepDefinition","hooks"},monochrome = true,dryRun = !true,snippets = SnippetType.CAMELCASE,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
//	@DataProvider(parallel=true)
//	public Object[][] scenariObjects(){
//		return super.scenarios();
//	}

}
