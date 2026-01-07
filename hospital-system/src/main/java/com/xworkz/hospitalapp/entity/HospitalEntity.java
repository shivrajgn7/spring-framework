package com.xworkz.hospitalapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HospitalEntity {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "hospital_name")
    private String hospitalName;
    @Column(name = "location")
    private String location;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "total_beds")
    private int totalBeds;
    @Column(name = "contact_number")
    private long contactNumber;
}
