package com.example.spring;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = "src/test/java/com/example/spring"
)
@RunWith(Cucumber.class)
public class CucumberRunner {
}