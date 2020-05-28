package service.impl;

import controller.model.ListDoctorsModel;
import controller.model.ShowDoctorModel;
import model.entity.Doctor;
import repository.DoctorRepository;
import service.ShowDoctorService;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShowDoctorServiceImpl implements ShowDoctorService {


    @Inject
    private DoctorRepository doctorRepository;

    @Override
    public ShowDoctorModel getDoctorById(int id) {
        ShowDoctorModel model = new ShowDoctorModel();
        Doctor doctor = doctorRepository.getDoctorById(id);
        model.setId(doctor.getId());
        model.setAge(doctor.getAge());
        model.setDescription(doctor.getDescription());
        model.setSpeciality(doctor.getSpecialization().toString());
        model.setMedicalWard(doctor.getMedicalWard().toString());
        model.setName(doctor.getName());
        return model;
    }
}
