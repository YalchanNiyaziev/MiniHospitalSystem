package service.impl;

import controller.model.RegisterStaffModel;
import model.entity.Address;
import model.entity.AdministrativeStaff;
import model.entity.enums.AdministrativeStaffRole;
import model.entity.enums.UserRole;
import repository.*;
import service.RegisterAdministrativeStaffService;

import javax.inject.Inject;

public class RegisterAdministrativeStaffServiceImpl implements RegisterAdministrativeStaffService {
    @Inject
    private AdministrativeStaffRepository administrativeStaffRepository;
    @Inject
    private UserRepository userRepository;
    @Inject
    private AddressRepository addressRepository;
    @Inject
    private PersonRepository personRepository;


    @Override
    public boolean register(RegisterStaffModel staffModel) {
        if (
                (
                        staffModel.getPassword().equals(staffModel.getConfirmPassword())
                                && !userRepository.contains(staffModel.getEmail())
                )
                        && !personRepository.contains(staffModel.getEgn())
        ) {
                AdministrativeStaff administrativeStaff=null;
                administrativeStaff = createManager(staffModel);
                System.out.println(administrativeStaff.getRole() + " " + administrativeStaff.getEgn() + " ");
            administrativeStaffRepository.save(administrativeStaff);
            return true;
        } else {
            return false;
        }
    }

    private AdministrativeStaff createManager(RegisterStaffModel staffModel) {
        AdministrativeStaff administrativeStaff = new AdministrativeStaff();
        Address address = createAddress(
                staffModel.getCity(),
                staffModel.getStreet(),
                staffModel.getStreetNum()
        );
        administrativeStaff.setName(staffModel.getName());
        administrativeStaff.setAddress(address);
        administrativeStaff.setEgn(staffModel.getEgn());
        administrativeStaff.setRole(AdministrativeStaffRole.MANAGER);
        administrativeStaff.setUserRole(UserRole.ADMINISTRATIVE_STAFF);
        administrativeStaff.setAge(Integer.parseInt(staffModel.getAge()));
        administrativeStaff.setPhone(staffModel.getPhone());
        administrativeStaff.setUsername(staffModel.getEmail());
        administrativeStaff.setPassword(staffModel.getPassword());
        return administrativeStaff;
    }

    private Address createAddress(String city, String street, int streetNum) {
        Address address;
        address = addressRepository.findAddressByLocation(city, street, streetNum);
        if (address == null) {
            address = new Address();
            address.setCity(city);
            address.setStreet(street);
            address.setNumber(streetNum);
            addressRepository.save(address);
        }
        return address;
    }
}
