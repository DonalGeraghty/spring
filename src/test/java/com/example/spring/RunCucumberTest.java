package com.example.spring;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = {"com.example.spring"}
)
@RunWith(Cucumber.class)
public class RunCucumberTest {
}