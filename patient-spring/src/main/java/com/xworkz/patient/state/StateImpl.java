package com.xworkz.patient.state;

import com.xworkz.patient.city.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StateImpl implements State {
    @Override
    public void addState(){
        System.out.println("Karnataka");
        city.addCity();
    }
    @Autowired
    City city;


}
