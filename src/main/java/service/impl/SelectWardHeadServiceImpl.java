package service.impl;

import controller.model.SelectWardHeadModel;
import model.entity.Doctor;
import model.entity.enums.MedicalWardType;
import repository.DoctorRepository;
import service.SelectWardHeadService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class SelectWardHeadServiceImpl implements SelectWardHeadService {

    @Inject
    private DoctorRepository doctorRepository;

    @Override
    public List<SelectWardHeadModel> getAllDoctorsByWard(int wardNum) {
        List<SelectWardHeadModel> modelList = null;
        MedicalWardType medicalWard = MedicalWardType.values()[wardNum];
        List<Doctor> doctorList = doctorRepository.getDoctorsByWard(medicalWard);
        if (doctorList != null) {
            modelList = new ArrayList<>();
            for (Doctor doctor : doctorList) {
                SelectWardHeadModel selectWardHeadModel = new SelectWardHeadModel();
                selectWardHeadModel.setName(doctor.getName());
                selectWardHeadModel.setEgn(doctor.getEgn());
                selectWardHeadModel.setSpecialization(doctor.getSpecialization().toString());
                selectWardHeadModel.setDoctorId(doctor.getId());
                selectWardHeadModel.setHead(doctor.isHead());
                modelList.add(selectWardHeadModel);
            }
        }
        return modelList;
    }

    @Override
    public void selectHead(long newHeadId, long currentHeadId) {
        Doctor currentHead = doctorRepository.getDoctorById(currentHeadId);
        if (currentHead != null) {
            currentHead.setHead(false);
            doctorRepository.update(currentHead);
        }
        Doctor newHead = doctorRepository.getDoctorById(newHeadId);
        newHead.setHead(true);
        doctorRepository.update(newHead);
    }
}
