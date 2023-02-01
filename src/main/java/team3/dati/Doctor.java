package team3.dati;

/**
 * @author LucaGiorgi
 */
public class Doctor extends Employee {
    //Attributi
    private String medicalAssociation;
    private String medicalAssociationId;
    private String specialization;

    //Costruttore
    public Doctor(){}

    //Get e Set
    public String getMedicalAssociation() {
        return medicalAssociation;
    }

    public void setMedicalAssociation(String medicalAssociation) {
        this.medicalAssociation = medicalAssociation;
    }

    public String getMedicalAssociationId() {
        return medicalAssociationId;
    }

    public void setMedicalAssociationId(String medicalAssociationId) {
        this.medicalAssociationId = medicalAssociationId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}