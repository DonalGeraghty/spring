package com.example.spring;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Planet {
    private final String name;
    private final List<Moon> moons;

    public void addMoon(Moon moon) {
        this.moons.add(moon);
    }
}
