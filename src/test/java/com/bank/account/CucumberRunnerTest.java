package com.bank.account;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
					monochrome = true,
					dryRun = true,
					plugin = {"pretty", "html:target/cucumber"}
				)
public class CucumberRunnerTest {

}
