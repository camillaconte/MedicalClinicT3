package team3;

public class Address {
    private String street;
    private int streetNumber;
    private String town;
    private String country;
    private String zipCode;

    public Address(String street,int streetNumber,String town,String country,String zipCode) {
        this.street = street;
        this.streetNumber=streetNumber;
        this.town=town;
        this.country=country;
        this.zipCode=zipCode;
    }
    public String getStreet() {
        return street;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public String getTown() {
        return town;
    }
    public String getCountry() {
        return country;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", town='" + town + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
