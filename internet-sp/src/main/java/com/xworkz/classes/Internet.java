package com.xworkz.classes;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Internet {
    private String internetName;
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }

    public String getInternetName() {
        return internetName;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "internetName='" + internetName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
