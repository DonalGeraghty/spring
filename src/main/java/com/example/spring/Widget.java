package com.example.spring;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
@Data
public class Widget {
    private final String name;
    private final int id;
}
