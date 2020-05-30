package repository.impl;

import repository.DoctorRepository;
import repository.connection.ConnectionDB;
import model.entity.Doctor;
import model.entity.enums.MedicalWardType;
import javax.persistence.EntityManager;
import java.util.List;

public class DoctorRepositoryImpl implements DoctorRepository {

    @Override
    public void save(Doctor doctor) {
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(doctor);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void update(Doctor doctor) {
            EntityManager entityManager = ConnectionDB.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(doctor);
            entityManager.getTransaction().commit();
            entityManager.close();

    }

    @Override
    public Doctor getDoctorById(long id) {
        Doctor doctor;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        doctor=entityManager.find(Doctor.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return doctor;
    }

    @Override
    public List<Doctor> getAllDoctor() {
        List<Doctor> doctors;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        doctors=entityManager.createQuery("FROM Doctor").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return doctors;
    }

    @Override
    public List<Doctor> getDoctorsByWard(MedicalWardType ward) {
        List<Doctor> doctors;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        doctors=entityManager.createQuery("FROM Doctor WHERE medicalWard = :ward").setParameter("ward",ward).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return doctors;
    }
}
