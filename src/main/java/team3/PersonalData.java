package team3;

public abstract class PersonalData {
    String name;
    String surname;
    int dateOfBirth;
    String fiscalCode;
    int numberPhone;
    String nationality;

    public PersonalData(String name, String surname, int dateOfBirth, String fiscalCode, int numberPhone, String nationality) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.fiscalCode = fiscalCode;
        this.numberPhone = numberPhone;
        this.nationality = nationality;
    }


}
