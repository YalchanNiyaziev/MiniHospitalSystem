package repository.impl;

import model.entity.Doctor;
import model.entity.MedicalExamination;
import model.entity.MedicalOperation;
import repository.MedicalOperationRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

public class MedicalOperationRepositoryImpl implements MedicalOperationRepository {
    @Override
    public void save(MedicalOperation medicalOperation) {
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(medicalOperation);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<MedicalOperation> getAllByPatient(String egn) {
        List<MedicalOperation> operationList=null;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery criteriaQuery = builder.createQuery();
        Root operation = criteriaQuery.from(MedicalOperation.class);
        Join patient = operation.join("patient");
        criteriaQuery.select(operation);
        criteriaQuery.where(builder.equal(patient.get("egn"),egn));

        Query query= entityManager.createQuery(criteriaQuery);
        try {
            operationList = query.getResultList();
        }
        catch (NoResultException e){
            System.out.println("Not found medical examinations with this egn");
        }
        entityManager.close();

        return operationList;
    }
}
