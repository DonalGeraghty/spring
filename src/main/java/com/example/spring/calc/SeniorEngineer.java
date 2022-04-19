package com.example.spring.calc;

import com.example.spring.Salary;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SeniorEngineer {

    @Autowired
    private Salary salary;

    public void setAmount(int amount){
        this.salary.setAmmount(amount);
    }
}
