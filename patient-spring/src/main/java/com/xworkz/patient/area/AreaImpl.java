package com.xworkz.patient.area;

import com.xworkz.patient.street.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AreaImpl implements Area{
    @Override
    public void addArea(){
        System.out.println("Rajajinagara");
        street.addStreet();
    }
    @Autowired
    Street street;
}
