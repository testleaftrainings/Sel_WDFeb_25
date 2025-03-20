package runnerClass;

import io.cucumber.testng.CucumberOptions;
import stepDefinitions.CommonBase;



@CucumberOptions(features = {"src/test/resources/features"},
glue = {"stepDefinitions"},
dryRun = false,
publish = true,
tags="@createLead",
monochrome = true)

public class LeaftapsTC1 extends CommonBase{

	
	
}
