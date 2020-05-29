package repository.impl;

import model.entity.MedicalStaff;
import repository.MedicalStaffRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;

public class MedicalStaffRepositoryImpl implements MedicalStaffRepository {
    @Override
    public void save(MedicalStaff medicalStaff) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(medicalStaff);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
