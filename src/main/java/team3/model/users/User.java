package team3.model.users;

import team3.model.serviceHandling.Address;

import java.util.Date;

public abstract class User {

    String id;
    String name;
    String surname;

    String userName;
    String passWord;
    Date birthDate;
    String fiscalCode;
    String email;
    String mainTelephoneNumber;
    Address address;


    /*
    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMainTelephoneNumber(String mainTelephoneNumber) {
        this.mainTelephoneNumber = mainTelephoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public String getEmail() {
        return email;
    }

    public String getMainTelephoneNumber() {
        return mainTelephoneNumber;
    }

    public Address getAddress() {
        return address;
    }
     */

}
