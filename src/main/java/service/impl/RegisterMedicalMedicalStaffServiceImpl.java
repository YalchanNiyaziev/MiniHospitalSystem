package service.impl;

import controller.model.RegisterStaffModel;
import service.RegisterMedicalStaffService;

public class RegisterMedicalMedicalStaffServiceImpl implements RegisterMedicalStaffService {
    @Override
    public void register(RegisterStaffModel staffModel) {
        System.out.println(staffModel);
    }
}
