package com.xworkz.patient.city;

import com.xworkz.patient.area.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityImpl implements City{
    @Override
    public void addCity(){
        System.out.println("Bengaluru");
        area.addArea();
    }
    @Autowired
    Area area;
}
