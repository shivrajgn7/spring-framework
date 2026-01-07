package com.xworkz.hospitalapp.dao;

import com.xworkz.hospitalapp.entity.HospitalEntity;

public interface HospitalDAO {

    boolean save(HospitalEntity entity);

    HospitalEntity getById(int id);

    boolean updateById(int id, HospitalEntity entity);

    boolean deleteById(int id);
}
