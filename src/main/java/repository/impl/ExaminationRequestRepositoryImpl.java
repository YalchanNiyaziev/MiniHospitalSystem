package repository.impl;

import model.entity.ExaminationRequest;
import model.entity.enums.StatusType;
import repository.ExaminationRequestRepository;
import repository.connection.ConnectionDB;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;


public class ExaminationRequestRepositoryImpl implements ExaminationRequestRepository {
    @Override
    public void save(ExaminationRequest examinationRequest) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(examinationRequest);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void update(ExaminationRequest examinationRequest) {
        EntityManager entityManager = ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(examinationRequest);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public ExaminationRequest getExaminationReqById(long id) {
        ExaminationRequest examinationRequest;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        entityManager.getTransaction().begin();
        examinationRequest=entityManager.find(ExaminationRequest.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return examinationRequest;
    }

    @Override
    public List<ExaminationRequest> getExaminationsByDoctor(long doctorId) {
        List<ExaminationRequest> examinationRequests=null;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery criteriaQuery = builder.createQuery();
        Root examinationRequest = criteriaQuery.from(ExaminationRequest.class);
        Join doctor = examinationRequest.join("doctor");
        criteriaQuery.select(examinationRequest);
        criteriaQuery.where(builder.equal(doctor.get("id"),doctorId));
        Query query= entityManager.createQuery(criteriaQuery);
        try {
            examinationRequests = query.getResultList();
        }
        catch (NoResultException e){
            System.out.println("Not found examination request by doctor id");
        }
        entityManager.close();

        return examinationRequests;
    }

    @Override
    public List<ExaminationRequest> getPendingExaminationsByDoctor(long doctorId) {
        List<ExaminationRequest> examinationRequests=null;
        EntityManager entityManager =ConnectionDB.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery();
        Root examinationRequest = criteriaQuery.from(ExaminationRequest.class);
        Join doctor = examinationRequest.join("doctor");
        criteriaQuery.select(examinationRequest);
        criteriaQuery.where(
                builder.and(
                    builder.equal(doctor.get("id"),doctorId),
                    builder.equal(examinationRequest.get("status"), StatusType.PENDING)
                           )
                    );
        Query query= entityManager.createQuery(criteriaQuery);
        try {
            examinationRequests = query.getResultList();
        }
        catch (NoResultException e){
            System.out.println("Not found pending examination request by doctor id");
        }
        entityManager.close();

        return examinationRequests;

    }
}
