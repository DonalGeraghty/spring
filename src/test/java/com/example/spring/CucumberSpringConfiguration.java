package com.example.spring;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = RunCucumberTest.class)
public class CucumberSpringConfiguration {

}
