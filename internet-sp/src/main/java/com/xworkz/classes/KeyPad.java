package com.xworkz.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@AllArgsConstructor
public class KeyPad {
    private int noKeys;
    private String company;
    private float value;
}
