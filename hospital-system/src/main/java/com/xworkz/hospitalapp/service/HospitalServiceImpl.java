package com.xworkz.hospitalapp.service;

import com.xworkz.hospitalapp.dao.HospitalDAO;

import com.xworkz.hospitalapp.dao.HospitalDAOImpl;
import com.xworkz.hospitalapp.dto.HospitalDTO;
import com.xworkz.hospitalapp.entity.HospitalEntity;
import org.springframework.beans.BeanUtils;

public class HospitalServiceImpl implements HospitalService {

    HospitalDAO dao = new HospitalDAOImpl();


    public boolean validate(HospitalDTO dto) {

        if (dto == null) return false;

        if (dto.getHospitalName() == null || dto.getHospitalName().length() < 3)
            return false;

        if (dto.getLocation() == null || dto.getLocation().length() < 2)
            return false;

        if (dto.getDoctorName() == null || dto.getDoctorName().length() < 3)
            return false;

        if (dto.getTotalBeds() <= 0)
            return false;

        if (String.valueOf(dto.getContactNumber()).length() != 10)
            return false;

        return true;
    }

    @Override
    public boolean save(HospitalDTO dto) {

        if (!validate(dto)) {
            System.out.println("Hospital validation failed");
            return false;
        }

        HospitalEntity entity = new HospitalEntity();
        BeanUtils.copyProperties(dto, entity);

        return dao.save(entity);
    }

    @Override
    public HospitalDTO getById(int id) {

        if (id <= 0) {
            System.out.println("Invalid hospital ID");
            return null;
        }

        HospitalEntity entity = dao.getById(id);
        if (entity == null) {
            return null;
        }

        HospitalDTO dto = new HospitalDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public boolean updateById(int id, HospitalDTO dto) {

        if (id <= 0 || !validate(dto)) {
            System.out.println("Hospital update validation failed");
            return false;
        }

        HospitalEntity entity = new HospitalEntity();
        BeanUtils.copyProperties(dto, entity);

        return dao.updateById(id, entity);
    }

    @Override
    public boolean deleteById(int id) {

        if (id <= 0) {
            System.out.println("Invalid hospital ID");
            return false;
        }

        return dao.deleteById(id);
    }

}
