package com.xworkz.patient.street;

import org.springframework.stereotype.Component;

@Component
public class StreetImpl implements Street{
    @Override
    public void addStreet() {
        System.out.println("6 th block 'A' main road 3rd cross");

    }
}
