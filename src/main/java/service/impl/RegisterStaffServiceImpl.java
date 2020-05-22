package service.impl;

import controller.model.RegisterStaffModel;
import service.RegisterStaffService;

public class RegisterStaffServiceImpl  implements RegisterStaffService {
    @Override
    public void register(RegisterStaffModel staffModel) {
        System.out.println(staffModel);
    }
}
