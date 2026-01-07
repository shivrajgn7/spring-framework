package com.xworkz.hospitalapp.service;

import com.xworkz.hospitalapp.dto.HospitalDTO;

public interface HospitalService {
    boolean save(HospitalDTO dto);

    HospitalDTO getById(int id);

    boolean updateById(int id, HospitalDTO dto);

    boolean deleteById(int id);
}
