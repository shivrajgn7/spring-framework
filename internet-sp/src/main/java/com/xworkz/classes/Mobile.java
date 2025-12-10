package com.xworkz.classes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Mobile {
    private int id;
    private String company;
}
