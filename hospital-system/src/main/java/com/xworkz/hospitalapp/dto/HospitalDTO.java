package com.xworkz.hospitalapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDTO {

    private int id;
    private String hospitalName;
    private String location;
    private String doctorName;
    private int totalBeds;
    private long contactNumber;
}
