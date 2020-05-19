package service.impl;

import controller.model.ListDoctorsModel;
import service.ListDoctorsService;

import javax.annotation.ManagedBean;
import java.util.ArrayList;
import java.util.List;

//@ManagedBean
public class ListDoctorsServiceImpl implements ListDoctorsService {

    @Override
    public List<ListDoctorsModel> getAllDoctors() {
        List<ListDoctorsModel> list = new ArrayList<>();
        ListDoctorsModel model1 = new ListDoctorsModel();
        model1.setId(1);
        model1.setName("ivan Petrov");
        model1.setMedicalWard("Ortopedi");
        model1.setSpeciality("Knee");
        list.add(model1);
        return list;
    }
}
