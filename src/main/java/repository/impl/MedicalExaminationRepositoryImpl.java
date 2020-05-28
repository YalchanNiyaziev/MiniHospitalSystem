package repository.impl;

import model.entity.MedicalExamination;
import repository.MedicalExaminationRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

public class MedicalExaminationRepositoryImpl implements MedicalExaminationRepository {
    @Override
    public void save(MedicalExamination examination) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.merge(examination);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<MedicalExamination> getAllExaminationsByEgn(String egn) {
        List<MedicalExamination> examinationList=null;
        EntityManager entityManager = ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery criteriaQuery = builder.createQuery();
        Root examination = criteriaQuery.from(MedicalExamination.class);
        Join patient = examination.join("patient");
        criteriaQuery.select(examination);
        criteriaQuery.where(builder.equal(patient.get("egn"),egn));

        Query query= entityManager.createQuery(criteriaQuery);
        try {
            examinationList = query.getResultList();
        }
        catch (NoResultException e){
            System.out.println("Not found medical examinations with this egn");
        }
        entityManager.close();

        return examinationList;
    }

}
