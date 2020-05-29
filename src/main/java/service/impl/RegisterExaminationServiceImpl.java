package service.impl;

import controller.model.RegisterExaminationModel;
import model.entity.Address;
import model.entity.Doctor;
import model.entity.MedicalExamination;
import model.entity.Patient;
import repository.AddressRepository;
import repository.DoctorRepository;
import repository.MedicalExaminationRepository;
import repository.PatientRepository;
import service.RegisterExaminationService;
import javax.inject.Inject;
import java.time.LocalDate;

public class RegisterExaminationServiceImpl implements RegisterExaminationService {
    @Inject
    private PatientRepository patientRepository;
    @Inject
    private AddressRepository addressRepository;
    @Inject
    private MedicalExaminationRepository medicalExaminationRepository;
    @Inject
    private DoctorRepository doctorRepository;

    @Override
    public void registerExamination(RegisterExaminationModel registerExaminationModel) {
        long doctorId=registerExaminationModel.getIdDoctor();
        MedicalExamination medicalExamination = new MedicalExamination();
        Patient patient = createPatient(registerExaminationModel);
        Doctor doctor = doctorRepository.getDoctorById(doctorId);
        LocalDate date = LocalDate.parse(registerExaminationModel.getDate());
        medicalExamination.setDisease(registerExaminationModel.getDisease());
        medicalExamination.setMedicalOpinion(registerExaminationModel.getOpinion());
        medicalExamination.setDoctor(doctor);
        medicalExamination.setDate(date);
        medicalExamination.setPatient(patient);

        medicalExaminationRepository.save(medicalExamination);
    }

    private Patient createPatient(RegisterExaminationModel registerExaminationModel) {

        String patientEgn = registerExaminationModel.getEgn();
        Patient patient = null;
        Address address = createAddress(
                registerExaminationModel.getCity(),
                registerExaminationModel.getStreet(),
                registerExaminationModel.getStreetNum()
        );
        patient = patientRepository.getPatientByEgn(patientEgn);
        if (patient == null) {
            patient = new Patient();

            patient.setName(registerExaminationModel.getName());
            patient.setEgn(patientEgn);
            patient.setAddress(address);
            patient.setAge(registerExaminationModel.getAge());
            patient.setPhone(registerExaminationModel.getPhone());

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
}
