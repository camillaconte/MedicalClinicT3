package team3;


public class Doctor extends Employee {
    String medicalAssociation;
    String medicalAssociationId;
    String specialization;
    String doctorId;

    public Doctor(String name, String surname, String fiscalCode, Address address, String phoneNumber, int age) {
        super(name, surname, fiscalCode, address, phoneNumber, age);
    }

    public void Doctor(String medicalAssociation, String medicalAssociationId,String specialization, String doctorId){
        this.medicalAssociationId=medicalAssociationId;
        this.medicalAssociation=medicalAssociation;
        this.specialization=specialization;
        this.doctorId=doctorId;
    }
}
