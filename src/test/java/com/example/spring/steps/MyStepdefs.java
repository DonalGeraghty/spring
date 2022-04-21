package com.example.spring.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I am an engineer")
    public void iAmAnEngineer() {
        System.out.println("I am an engineer");
    }

    @When("I got to work")
    public void iGotToWork() {
        System.out.println("I got to work");
    }

    @Then("I get paid")
    public void iGetPaid() {
        System.out.println("I get paid");
    }
}
