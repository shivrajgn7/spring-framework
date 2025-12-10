package com.xworkz.classes;


import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@ToString
@Setter
@Configuration
public class Laptop {
    private int laptopId;
    private String laptopCName;

    public int getLaptopId() {
        return laptopId;
    }

    public String getLaptopCName() {
        return laptopCName;
    }
}
