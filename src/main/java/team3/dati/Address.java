package team3.dati;

/**
 * @author LucaGiorgi
 */
public class Address {
    private String street;
    private int number;
    private String city;
    private String country;
    private String zipCode;

    public Address(String street, int number, String city, String country, String zipCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
