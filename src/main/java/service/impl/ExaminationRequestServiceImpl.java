package service.impl;

import controller.model.ExaminationRequestModel;
import model.entity.Address;
import model.entity.Doctor;
import model.entity.ExaminationRequest;
import model.entity.Patient;
import model.entity.enums.StatusType;
import repository.AddressRepository;
import repository.DoctorRepository;
import repository.ExaminationRequestRepository;
import service.ExaminationRequestService;

import javax.inject.Inject;
import java.time.LocalDate;
import java.time.LocalTime;

public class ExaminationRequestServiceImpl implements ExaminationRequestService {

        @Inject
        private ExaminationRequestRepository examinationRequestRepository;
        @Inject
        private DoctorRepository doctorRepository;
        @Inject
        private AddressRepository addressRepository;

        @Override
        public void makeExaminationRequest(ExaminationRequestModel examinationRequestModel) {
            ExaminationRequest examinationRequest = new ExaminationRequest();
            Patient patient = createPatient(examinationRequestModel);
            Doctor doctor = getDoctorById(examinationRequestModel.getDoctorId());
            LocalDate date = LocalDate.parse(examinationRequestModel.getDate());
            LocalTime time = LocalTime.parse(examinationRequestModel.getTime());

            //!!!!! Transform two string date and time to LocalDate
            examinationRequest.setDate(date);
            examinationRequest.setTime(time);
            examinationRequest.setPatient(patient);
            examinationRequest.setDoctor(doctor);
            examinationRequest.setStatus(StatusType.PENDING);
            this.examinationRequestRepository.save(examinationRequest);
        }

        private Patient createPatient(ExaminationRequestModel examinationRequestModel) {
            Patient patient = new Patient();
            Address address = getAddressByLocation(
                    examinationRequestModel.getCity(),
                    examinationRequestModel.getStreet(),
                    examinationRequestModel.getStreetNum()
            );
            patient.setPhone(examinationRequestModel.getPhone());
            patient.setName(examinationRequestModel.getName());
            patient.setAddress(address);
            patient.setEmail(examinationRequestModel.getEmail());

            return patient;
        }

        private Doctor getDoctorById(long id) {
            Doctor doctor = doctorRepository.getDoctorById(id);
            return doctor;
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
