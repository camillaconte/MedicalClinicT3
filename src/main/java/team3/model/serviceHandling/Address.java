package team3.model.serviceHandling;

public class Address {
    String street;
    String houseNumber;
    String city;
    String zipCode;
    String province;
    String state;

    public Address(String street, String houseNumber, String city, String zipCode, String province, String state) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.province = province;
        this.state = state;
    }
}
