package com.xworkz.patient.country;

import org.springframework.stereotype.Component;

@Component("asia")
public class AsiaImpl implements Country{
    @Override
    public void addCountry() {
        System.out.println("Asia is invoked");
    }
}
