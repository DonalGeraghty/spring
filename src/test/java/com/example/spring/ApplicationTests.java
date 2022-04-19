package com.example.spring;

import com.example.spring.calc.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Value("${fruits}")
    private List<String> fruits;

    @Autowired
    Calculator calculator;

    @Test
    void fruitTest() {
        System.out.println(fruits);
    }

    @Test
    void calculatorTest() {
        int sum = calculator.Adder(1, 2);
        System.out.println(sum);
    }

    @Test
    void planetTest() {
        System.out.println("PLANET");
        Moon moon = Moon.builder().name("Deimos").build();
        List<Moon> moons = new ArrayList<>();
        moons.add(moon);
        Planet planet = Planet.builder().name("mars").moons(moons).build();
        System.out.println(planet);
    }

    @Test
    void widgetTest() {
        System.out.println("WIDGET");
        Widget widget = Widget.builder().name("foo").id(1).build();
        System.out.println(widget.toString());
    }
}
