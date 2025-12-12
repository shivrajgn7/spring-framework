package com.xworkz.dependency.laptop;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Company {
    @Autowired
    OS os;


}
