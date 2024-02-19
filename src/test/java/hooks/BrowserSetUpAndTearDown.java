package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import baseDriver.DriverSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BrowserSetUpAndTearDown {
	
	DriverSetUp context;
	public BrowserSetUpAndTearDown(DriverSetUp context) {
		this.context=context;
	}
	@Before
	public void startBrowser(Scenario scenario) {
		//String url = "https://parabank.parasoft.com/parabank/index.htm";
		context.driver = new ChromeDriver();
		context.driver.get("https://parabank.parasoft.com/parabank/index.htm");
		context.driver.manage().window().maximize();
		context.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
	
		context.driver.quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			File screenshotAs = ((TakesScreenshot)context.driver).getScreenshotAs(OutputType.FILE);
			// convert file to byte
			byte[] readFileToByteArray = FileUtils.readFileToByteArray(screenshotAs);
			scenario.attach(readFileToByteArray, "image/png", "image");	
		}
	}
	
	
	

}
