package repository.impl;

import repository.PatientRepository;
import model.entity.Patient;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
public class PatientRepositoryImpl implements PatientRepository {
    @Override
    public void save(Patient patient) {
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(patient);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void update(Patient patient) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(patient);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Patient getPatientById(long id) {
        return null;
    }

    @Override
    public Patient getPatientByEgn(String egn) {
        Patient patient=null;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery();
        Root patientRoot = criteriaQuery.from(Patient.class);
        criteriaQuery.select(patientRoot);
        criteriaQuery.where(builder.equal(patientRoot.get("egn"),egn));
        Query query= entityManager.createQuery(criteriaQuery);
        try {
            patient = (Patient) query.getSingleResult();
        }
        catch (NoResultException e){
            System.out.println("Not fount patient with this egn");
        }
        entityManager.close();
        return patient;
    }
}
