package com.example.spring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Scope("prototype")
public class Salary {

    private int ammount;
}
