package service.impl;

import controller.model.RegisterStaffModel;
import model.entity.enums.UserRole;
import repository.AddressRepository;
import repository.MedicalStaffRepository;
import repository.PersonRepository;
import repository.UserRepository;
import service.RegisterMedicalStaffService;
import model.entity.*;
import model.entity.enums.HealthProfessionalRole;
import model.entity.enums.MedicalSpecializationType;
import model.entity.enums.MedicalWardType;

import javax.inject.Inject;

public class RegisterMedicalMedicalStaffServiceImpl implements RegisterMedicalStaffService {
    @Inject
    private MedicalStaffRepository medicalStaffRepository;
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
        ){
            MedicalStaff medicalStaff;
            if (isDoctor(staffModel.getRole())) {
                medicalStaff = createDoctor(staffModel);
                System.out.println(medicalStaff.getMedicalWard() + " " + medicalStaff.getSpecialization() + " ");
            } else {
                medicalStaff = createHealthProf(staffModel);
                System.out.println(medicalStaff.getMedicalWard() + " " + medicalStaff.getSpecialization() + " ");

            }
            medicalStaffRepository.save(medicalStaff);
            return true;
        } else {
            return false;
        }
    }

    private boolean isDoctor(String staffRole) {
        if (staffRole.toLowerCase().equals("doctor"))
            return true;
        return false;
    }

    private Doctor createDoctor(RegisterStaffModel staffModel) {
        int specializationNum = Integer.parseInt(staffModel.getSpeciality());
        int wardNum = Integer.parseInt(staffModel.getWard());
        Doctor doctor = new Doctor();
        Address address = getAddressByLocation(
                staffModel.getCity(),
                staffModel.getStreet(),
                staffModel.getStreetNum()
        );
        MedicalStaffSchedule schedule = new MedicalStaffSchedule();
        doctor.setUserRole(UserRole.DOCTOR);
        doctor.setName(staffModel.getName());
        doctor.setAge(Integer.parseInt(staffModel.getAge()));
        doctor.setPhone(staffModel.getPhone());
        doctor.setEgn(staffModel.getEgn());
        doctor.setHead(false);
        doctor.setDescription("");
        doctor.setSpecialization(MedicalSpecializationType.values()[specializationNum]);
        doctor.setMedicalWard(MedicalWardType.values()[wardNum]);
        doctor.setAddress(address);
        doctor.setSchedule(schedule);
        doctor.setUsername(staffModel.getEmail());
        doctor.setPassword(staffModel.getPassword());
        return doctor;
    }

    private HealthProfessional createHealthProf(RegisterStaffModel staffModel) {
        int specializationNum = Integer.parseInt(staffModel.getSpeciality());
        int wardNum = Integer.parseInt(staffModel.getWard());
        int roleNum = Integer.parseInt(staffModel.getRole());
        Address address = getAddressByLocation(
                staffModel.getCity(),
                staffModel.getStreet(),
                staffModel.getStreetNum()
        );
        HealthProfessional healthProfessional = new HealthProfessional();
        MedicalStaffSchedule schedule = new MedicalStaffSchedule();


        healthProfessional.setUserRole(UserRole.HEALTH_PROFESSIONAL);
        healthProfessional.setName(staffModel.getName());
        healthProfessional.setEgn(staffModel.getEgn());
        healthProfessional.setAge(Integer.parseInt(staffModel.getAge()));
        healthProfessional.setRole(HealthProfessionalRole.values()[roleNum]);
        healthProfessional.setSpecialization(MedicalSpecializationType.values()[specializationNum]);
        healthProfessional.setMedicalWard(MedicalWardType.values()[wardNum]);
        healthProfessional.setAddress(address);
        healthProfessional.setPhone(staffModel.getPhone());
        healthProfessional.setSchedule(schedule);
        healthProfessional.setUsername(staffModel.getEmail());
        healthProfessional.setPassword(staffModel.getPassword());
        healthProfessional.setPhone(staffModel.getPhone());

        return healthProfessional;
    }

    private Address getAddressByLocation(String city, String street, int streetNumber) {
        Address address;
        address = addressRepository.findAddressByLocation(city, street, streetNumber);
        if (address == null) {
            address = new Address();
            address.setCity(city);
            address.setStreet(street);
            address.setNumber(streetNumber);
            addressRepository.save(address);
        }
        return address;
    }
}
