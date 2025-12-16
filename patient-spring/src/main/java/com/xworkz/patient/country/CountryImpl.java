package com.xworkz.patient.country;

import com.xworkz.patient.state.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryImpl implements Country{
    @Override
    public void addCountry() {
        System.out.println("INDIA");
        state.addState();
    }
    @Autowired
    State state;
}
