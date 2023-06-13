package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		
		features={"src/test/java/feature/Addtocart.feature",
				"src/test/java/feature/database.feature",
				"src/test/java/feature/database2.feature",
				"src/test/java/feature/Login.feature",
				"src/test/java/feature/Login1.feature",
				"src/test/java/feature/manageproducts.feature",
				"src/test/java/feature/update.feature"
				},
		
			glue="stepdefinition",
			dryRun = false ,
		     plugin= {"pretty", "html:target/cucumber-reports.html"},
		    	//	tags=  "@ValidCredentials",
		        monochrome=true
		        )

public class TestRunner  extends AbstractTestNGCucumberTests
{
	

	

}
