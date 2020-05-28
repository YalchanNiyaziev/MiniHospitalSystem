package repository.impl;

import repository.AddressRepository;
import model.entity.Address;
import repository.connection.ConnectionDB;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


public class AddressRepositoryImpl implements AddressRepository {

        @Override
        public void save(Address address) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(address);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

        @Override
        public Address findAddressByLocation(String city, String street, int streetNum) {
        Address address=null;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        try{
            address =(Address) entityManager.createQuery("FROM Address WHERE city = :city and street= :street and number = :streetNum ")
                    .setParameter("city", city)
                    .setParameter("street",street)
                    .setParameter("streetNum",streetNum).getSingleResult();
        }
        catch (NoResultException e){
            System.out.println("Invalid address");
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return address;
    }
}
