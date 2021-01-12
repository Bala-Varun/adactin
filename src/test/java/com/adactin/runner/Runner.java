package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com.featurefile",
		glue = {"com\\adactin\\stepdefintion"})
		
	
public class Runner {

}
	