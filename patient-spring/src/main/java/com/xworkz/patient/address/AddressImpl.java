package com.xworkz.patient.address;

import com.xworkz.patient.country.Country;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AddressImpl implements Address {
    @Override
    public void getPatientAddress() {
        System.out.println("Patient address is invoked");
        country.addCountry();
    }

    @Autowired
    @Qualifier("asia")
    Country country;
}
