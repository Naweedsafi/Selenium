package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import utility.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		
				  features = {"src/test/java/features"}
				  
				, glue = {"stepDefinitions" }
				, monochrome = true
				, dryRun = false
				
				, strict =false 
				, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Test-Report/TestResult.html","pretty", "json:target/Test-Report/TestResult.json" }
				, tags = 
					{	
					//"@WhizportLinks"//+
			    //",@Smoke"+
				"@Regression"//+
			    //",@WhizportLinks"
					}
				)

public class Runner extends BasePage {	

	
}


