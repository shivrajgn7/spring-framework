package com.xworkz.patient;

import com.xworkz.patient.address.Address;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@ToString
@Component
public class Patient {
    @Value("45")
    private int patientId;
    @Value("Veeresh")
    private String patientName;

    @Autowired
    Address address;

    public void patientData(){
        System.out.println("Patient data");
        System.out.println("ID :"+patientId);
        System.out.println("name :" +patientName);
        address.getPatientAddress();
    }

}
