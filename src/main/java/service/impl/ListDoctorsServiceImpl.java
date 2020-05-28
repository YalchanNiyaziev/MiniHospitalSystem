package service.impl;

import controller.model.ListDoctorsModel;
import model.entity.Doctor;
import repository.DoctorRepository;
import service.ListDoctorsService;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class ListDoctorsServiceImpl implements ListDoctorsService {

    @Inject
    private DoctorRepository doctorRepository;


    @Override
    public List<ListDoctorsModel> getAllDoctors() {
        List<ListDoctorsModel> listDoctorsModel = new ArrayList<>();
        List<Doctor> listDoctor = doctorRepository.getAllDoctor();

        for(Doctor doctor: listDoctor){
            ListDoctorsModel model = new ListDoctorsModel();
            model.setName(doctor.getName());
            model.setMedicalWard(doctor.getMedicalWard().toString());
            model.setSpeciality(doctor.getSpecialization().toString());
            model.setId((int)doctor.getId());
            listDoctorsModel.add(model);
        }
        return listDoctorsModel;
    }
}
