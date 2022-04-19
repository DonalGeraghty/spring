package com.example.spring.calc;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int Adder(int num1, int num2) {
        return num1 + num2;
    }
}
