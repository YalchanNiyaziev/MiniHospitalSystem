package repository.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDB {
    private ConnectionDB() {
    }
    public static EntityManager createEntityManager(){
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hospital");
        EntityManager entityManager =managerFactory.createEntityManager();
        return entityManager;
    }
}
