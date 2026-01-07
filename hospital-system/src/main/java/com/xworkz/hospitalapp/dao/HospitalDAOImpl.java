package com.xworkz.hospitalapp.dao;

import com.xworkz.hospitalapp.entity.HospitalEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HospitalDAOImpl implements HospitalDAO {

    @Override
    public boolean save(HospitalEntity entity) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(HospitalEntity.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);
        transaction.commit();

        return true;
    }

    @Override
    public HospitalEntity getById(int id) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(HospitalEntity.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        HospitalEntity entity = session.get(HospitalEntity.class, id);

        return entity;
    }

    @Override
    public boolean updateById(int id, HospitalEntity newEntity) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(HospitalEntity.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        HospitalEntity existing = session.get(HospitalEntity.class, id);

        if (existing != null) {
            existing.setHospitalName(newEntity.getHospitalName());
            existing.setLocation(newEntity.getLocation());
            existing.setDoctorName(newEntity.getDoctorName());
            existing.setTotalBeds(newEntity.getTotalBeds());
            existing.setContactNumber(newEntity.getContactNumber());

            session.update(existing);
            transaction.commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(HospitalEntity.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        HospitalEntity entity = session.get(HospitalEntity.class, id);

        if (entity != null) {
            session.delete(entity);
            transaction.commit();
            return true;
        }
        return false;
    }
}
