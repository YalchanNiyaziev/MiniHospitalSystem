package service.impl;

import controller.model.ListDoctorsModel;
import controller.model.ShowDoctorModel;
import service.ShowDoctorService;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShowDoctorServiceImpl implements ShowDoctorService {

    @Override
    public ShowDoctorModel getDoctorBYId(int id) {
        List<ShowDoctorModel> list = new ArrayList<>();
        ShowDoctorModel model1 = new ShowDoctorModel();
        ShowDoctorModel model2 = new ShowDoctorModel();
        model1.setId(9998);
        model1.setName("ivan Petrov");
        model1.setMedicalWard("Ortopedi");
        model1.setSpeciality("Knee");
        model1.setAge(45);
        model1.setDescription("dfsdfsdfsdf");
        model2.setId(2222);
        model2.setName("Natsha Marinkova");
        model2.setMedicalWard("Hirurgiya");
        model2.setSpeciality("Heart");
        model2.setAge(61);
        model2.setDescription("svsvsvsvdssdvs");
        list.add(model1);
        list.add(model2);

        for(ShowDoctorModel model:list){
            if(model.getId()==id)
                return model;
        }
        return null;
    }
}
