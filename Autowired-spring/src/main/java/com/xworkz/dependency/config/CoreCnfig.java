package com.xworkz.dependency.config;

import com.xworkz.dependency.laptop.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.dependency")
public class CoreCnfig {


    Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }
}
