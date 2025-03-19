package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src/test/resources/features"},
glue = {"stepDefinitions"},
dryRun = false,
publish = true,
tags="@createLead",
monochrome = true)

public class LeaftapsTC1 extends AbstractTestNGCucumberTests{

	
	
}
