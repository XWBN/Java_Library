package com.xwb.Library.entity;

/**
 * @author xwb
 */
public class Reader {
    private Integer ReaderID;
    private String FirstName;
    private String LastName;
    private String Address;
    private String PhoneNumber;
    private Integer Limits;

    public Reader() {
    }

    public Reader(Integer readerID, String firstName, String lastName, String address, String phoneNumber, Integer limits) {
        ReaderID = readerID;
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        PhoneNumber = phoneNumber;
        Limits = limits;
    }

    public int getReaderID() {
        return ReaderID;
    }

    public void setReaderID(int readerID) {
        ReaderID = readerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Integer getLimits() {
        return Limits;
    }

    public void setLimits(Integer limits) {
        Limits = limits;
    }
}
