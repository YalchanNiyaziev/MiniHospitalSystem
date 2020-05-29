package repository.impl;

import repository.PersonRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public boolean contains(String personEGN) {
        boolean isExists = false;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            if (entityManager.createQuery("FROM Person WHERE egn = :prsnEGN").setParameter("prsnEGN", personEGN).getSingleResult()!=null)
                isExists = true;
        }
        catch (NoResultException e){
            System.out.println("The person with this -> "+personEGN+" does not exist.");
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return isExists;

    }
}
