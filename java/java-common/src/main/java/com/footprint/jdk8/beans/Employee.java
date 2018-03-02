package com.footprint.jdk8.beans;

import java.io.Serializable;
import java.util.Map;

public class Employee implements Serializable{
    private AddressBean address;
    private AddressBean[] addresses;
    private String firstName;
    private String lastName;
    private Map<Integer, Integer> map;

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressBean[] getAddresses() {
        return addresses;
    }

    public void setAddresses(AddressBean[] addresses) {
        this.addresses = addresses;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }
}
 