package team3;

public  class Employee extends User {


    public Employee(String name, String surname, String fiscalCode, Address address, String phoneNumber, int age) {


        super(name, surname, fiscalCode, address, phoneNumber, age);
    }

    @Override
    public void getUserDetails() {

    }
}