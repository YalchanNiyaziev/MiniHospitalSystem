package repository.impl;

import model.entity.Admin;
import repository.AdminRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;

public class AdminRepositoryImpl implements AdminRepository {

    @Override
    public void save(Admin admin) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(admin);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
