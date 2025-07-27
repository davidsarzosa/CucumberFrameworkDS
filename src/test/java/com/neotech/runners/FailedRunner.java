package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// we may specify the path to the feature files
		features = "@target/failed.txt", // path to the failed scenarios

		// we may specify the path to the step definitions
		glue = "com.neotech.steps", // path to the step definitions

		plugin = { "rerun:target/failed.txt" // generates a rerun file for failed tests

		}

)

public class FailedRunner {

}
