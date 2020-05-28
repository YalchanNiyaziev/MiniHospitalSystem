package repository;

import model.entity.Address;

public interface AddressRepository {
    void save(Address address);
    Address findAddressByLocation(String city, String street, int streetNum);
}
