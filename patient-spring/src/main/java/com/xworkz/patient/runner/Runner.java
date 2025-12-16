package com.xworkz.patient.runner;

import com.xworkz.patient.Patient;
import com.xworkz.patient.config.CoreConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfig.class);
        Patient patient = applicationContext.getBean(Patient.class);
        patient.patientData();

    }
}
