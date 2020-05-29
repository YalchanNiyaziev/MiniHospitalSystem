package repository.impl;

import repository.AdministrativeStaffRepository;

import model.entity.AdministrativeStaff;
import model.entity.enums.AdministrativeStaffRole;
import repository.connection.ConnectionDB;
import javax.persistence.EntityManager;

public class AdministrativeStaffRepositoryImpl implements AdministrativeStaffRepository {

    @Override
    public void save(AdministrativeStaff staff) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(staff);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void update(AdministrativeStaff staff) {

    }

    @Override
    public AdministrativeStaff getStaffByRole(AdministrativeStaffRole role) {
        return null;
    }
}
