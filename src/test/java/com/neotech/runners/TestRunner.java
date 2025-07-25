package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// We may specify the path to the feature files 
		features = "src/test/resources/features/",  // path to the feature files
		
		// we may specify the path to the step definitions 
		glue = "com.neotech.steps", // path to the step definitions
		
		// we may use dry run to check for syntax errors 
		dryRun = true, // if true, it will not run the tests, just check for syntax errors 
		
		// we may set monochrome to true for better readability in the console 
		monochrome = true, // if true, it will not print the console output in color 
		
		tags = "@HW4" // we can specify tags to run specific tests 
		
		)

public class TestRunner {

}
