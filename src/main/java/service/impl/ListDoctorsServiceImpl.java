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
        ListDoctorsModel model2 = new ListDoctorsModel();
        model1.setId(9998);
        model1.setName("ivan Petrov");
        model1.setMedicalWard("Ortopedi");
        model1.setSpeciality("Knee");
        model2.setId(2222);
        model2.setName("Natsha Marinkova");
        model2.setMedicalWard("Hirurgiya");
        model2.setSpeciality("Heart");
        list.add(model1);
        list.add(model2);
        return list;
    }
}
