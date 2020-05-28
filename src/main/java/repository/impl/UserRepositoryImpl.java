package repository.impl;

import model.entity.User;
import repository.UserRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUsers() {
        List<User> userList;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery();
        Root users = criteriaQuery.from(User.class);
        criteriaQuery.select(users);
        Query query = entityManager.createQuery(criteriaQuery);
        userList = query.getResultList();
        entityManager.close();
        return userList;

    }

    @Override
    public User getUserByUsername(String username) {
        User finalUser=null;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery();
        Root user = criteriaQuery.from(User.class);
        criteriaQuery.select(user);
        criteriaQuery.where(builder.equal(user.get("username"),username));
        Query query = entityManager.createQuery(criteriaQuery);
        try {
            finalUser = (User) query.getSingleResult();
        }
        catch (NoResultException e){
            System.out.println("The user does not exist");
        }
        return finalUser;
    }


    @Override
    public User getUserByUsernameAndPassword(String username, String password) {
        User user = null;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            user = (User) entityManager.createQuery("FROM User WHERE username = :email AND password = :pass")
                    .setParameter("email", username)
                    .setParameter("pass",password)
                    .getSingleResult();
        } catch (NoResultException e) {
            System.out.println("The user does not exist");
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    @Override
    public boolean contains(String username) {
        if(getUserByUsername(username)==null)
            return false;
        return true;
    }

    @Override
    public void updatePassword(User user) {

    }
}
