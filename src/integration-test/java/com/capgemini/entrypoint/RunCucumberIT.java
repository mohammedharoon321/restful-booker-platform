package com.capgemini.entrypoint;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber/html", "json:target/cucumber/json/cucumber.json",
        "junit:target/cucumber/junit/cucumber.xml"})
public class RunCucumberIT {

}