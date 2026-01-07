package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.dto.HospitalDTO;
import com.xworkz.hospitalapp.service.HospitalService;
import com.xworkz.hospitalapp.service.HospitalServiceImpl;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Main started");

        HospitalService hospitalService = new HospitalServiceImpl();


        System.out.println("Save Hospital started");

        HospitalDTO hospitalDTO = new HospitalDTO();
        hospitalDTO.setId(3);
        hospitalDTO.setHospitalName("Apollo Hospital");
        hospitalDTO.setLocation("Bangalore");
        hospitalDTO.setDoctorName("Dr. Kumar");
        hospitalDTO.setTotalBeds(250);
        hospitalDTO.setContactNumber(9988776655L);

//        boolean saved = hospitalService.save(hospitalDTO);
//        System.out.println(saved ? "Saved successfully" : "Save failed");

        HospitalDTO dto = new HospitalDTO();
        dto.setId(2);
        dto.setHospitalName("Apollo Hospital");
        dto.setLocation("Bangalore");
        dto.setDoctorName("Dr. Kumar");
        dto.setTotalBeds(250);
        dto.setContactNumber(9988776655L);

//        boolean saved1 = hospitalService.save(dto);
//        System.out.println(saved1 ? "Saved successfully" : "Save failed");
        System.out.println("Save Hospital ended");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Get By ID started");

        HospitalDTO dto2 = hospitalService.getById(1);
        if (dto2 != null) {
            System.out.println("Hos`pital details = " + dto2);
        } else {
            System.out.println("Hospital not found");
        }
        System.out.println("Get By ID ended");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Update By ID started");

        HospitalDTO updateDTO = new HospitalDTO();
        updateDTO.setHospitalName("Apollo Super Speciality");
        updateDTO.setLocation("Bangalore");
        updateDTO.setDoctorName("Dr. Ramesh");
        updateDTO.setTotalBeds(300);
        updateDTO.setContactNumber(9988776655L);

        boolean updated = hospitalService.updateById(1, updateDTO);
        System.out.println(updated ? "Updated successfully" : "Update failed");
        System.out.println("Update By ID ended");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Delete By ID started");
        boolean deleted = hospitalService.deleteById(1);
        System.out.println(deleted ? "Deleted successfully" : "Delete failed");
        System.out.println("Delete By ID ended");

        System.out.println("\nMain ended");
    }
}