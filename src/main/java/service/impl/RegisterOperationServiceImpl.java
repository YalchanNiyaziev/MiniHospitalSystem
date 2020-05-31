package service.impl;

import controller.model.RegisterOperationModel;
import controller.model.SelectTeamModel;
import model.entity.*;
import model.entity.enums.MedicalWardType;
import repository.*;
import service.RegisterOperationService;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegisterOperationServiceImpl implements RegisterOperationService {
    @Inject
    private DoctorRepository doctorRepository;
    @Inject
    private MedicalStaffRepository medicalStaffRepository;
    @Inject
    private MedicalOperationRepository medicalOperationRepository;
    @Inject
    private AddressRepository addressRepository;
    @Inject
    private PatientRepository patientRepository;

    @Override
    public List<SelectTeamModel> getAllStaffByWard(long doctorId) {
        List<SelectTeamModel> modelList=null;
        MedicalWardType ward = findWardByDoctor(doctorId);
        List<MedicalStaff> medicalStaffs = medicalStaffRepository.getAllByWard(ward);
        if(medicalStaffs != null){
            modelList = new ArrayList<>();
            for (MedicalStaff medicalStaff : medicalStaffs){
                SelectTeamModel model = new SelectTeamModel();
                model.setEgn(medicalStaff.getEgn());
                model.setName(medicalStaff.getName());
                model.setMedicalStaffId(medicalStaff.getId());
                model.setSpecialization(medicalStaff.getSpecialization().toString());
                modelList.add(model);
            }
        }
        return modelList;
    }

    @Override
    public void registerOperation(RegisterOperationModel registerOperationModel, String[] medicalStaffs) {
        long doctorId=registerOperationModel.getIdDoctor();
        MedicalOperation medicalOperation = new MedicalOperation();
        Patient patient = createPatient(registerOperationModel);
        Set<MedicalStaff> team= createOperationTeam(medicalStaffs);
        Doctor doctor = doctorRepository.getDoctorById(doctorId);
        LocalDate date = LocalDate.parse(registerOperationModel.getDate());

        medicalOperation.setProcedureConclusion(registerOperationModel.getConclusion());
        medicalOperation.setProcedureDescription(registerOperationModel.getDescription());
        medicalOperation.setDoctor(doctor);
        medicalOperation.setDate(date);
        medicalOperation.setPatient(patient);
        medicalOperation.setTeam(team);
        medicalOperationRepository.save(medicalOperation);

    }

    private Set<MedicalStaff> createOperationTeam(String[] medicalStaffs) {
        Set<MedicalStaff> team = new HashSet<>();
        for(String staffId : medicalStaffs){
            MedicalStaff staff = medicalStaffRepository.getStaffById(Long.parseLong(staffId));
            team.add(staff);
        }
        return team;
    }

    private Patient createPatient(RegisterOperationModel registerOperationModel) {
        String patientEgn = registerOperationModel.getEgn();
        Patient patient = null;
        Address address = createAddress(
                registerOperationModel.getCity(),
                registerOperationModel.getStreet(),
                registerOperationModel.getStreetNum()
        );

        patient = patientRepository.getPatientByEgn(patientEgn);
        if (patient == null) {
            patient = new Patient();

            patient.setName(registerOperationModel.getName());
            patient.setEgn(patientEgn);
            patient.setAddress(address);
            patient.setAge(registerOperationModel.getAge());
            patient.setPhone(registerOperationModel.getPhone());

            patientRepository.save(patient);
        }
        else {
            patient.setAddress(address);
            patientRepository.update(patient);
        }
        return patient;
    }


    private Address createAddress(String city, String street, int streetNumber) {
        Address address = null;
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

    private MedicalWardType findWardByDoctor(long doctorId) {
        Doctor doctor =doctorRepository.getDoctorById(doctorId);
        return doctor.getMedicalWard();
    }


}
