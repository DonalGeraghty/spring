package com.example.spring.engineer;

import com.example.spring.JuniorEngineer;
import com.example.spring.calc.SeniorEngineer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EngineerTest1 {

    @Autowired
    private JuniorEngineer juniorEngineer;
    @Autowired
    private SeniorEngineer seniorEngineer;

    @Test
    void engineerTest() {
        juniorEngineer.setAmount(100);
        System.out.println("juniorEngineer: " + juniorEngineer.getSalary().getAmmount());
        seniorEngineer.setAmount(200);
        System.out.println("seniorEngineer: " + seniorEngineer.getSalary().getAmmount());
        System.out.println("juniorEngineer: " + juniorEngineer.getSalary().getAmmount());
    }
}
