package repository.impl;

import model.entity.Doctor;
import model.entity.MedicalStaff;
import model.entity.enums.MedicalWardType;
import repository.MedicalStaffRepository;
import repository.connection.ConnectionDB;
import javax.persistence.EntityManager;
import java.util.List;

public class MedicalStaffRepositoryImpl implements MedicalStaffRepository {
    @Override
    public void save(MedicalStaff medicalStaff) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(medicalStaff);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void update(MedicalStaff medicalStaff) {

    }

    @Override
    public MedicalStaff getStaffById(long staffId) {
        MedicalStaff medicalStaff;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        medicalStaff=entityManager.find(MedicalStaff.class,staffId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return medicalStaff;
    }

    @Override
    public List<MedicalStaff> getAllByWard(MedicalWardType ward) {
        List<MedicalStaff> medicalStaffs;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        medicalStaffs=entityManager.createQuery("FROM MedicalStaff WHERE medicalWard = :ward").setParameter("ward",ward).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return medicalStaffs;
    }
}
