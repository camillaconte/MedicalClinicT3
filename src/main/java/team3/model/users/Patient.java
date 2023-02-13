package team3.model.users;

import team3.model.serviceHandling.Exemption;
import team3.model.records.MedicalRecord;
import team3.model.serviceHandling.Appointment;

import java.io.File;
import java.util.List;

public class Patient extends User {


    public Patient (){}

    public Patient(String id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }


    /*
    PER ORA CONSIDERIAMO SOLO I DATI BASE (ID, NOME, COGNOME, INDIRIZZO, NUM TEL)
     */
    /* UTILI MA IN UN SECONDO MOMENTO
     String healthInsuranceCard; //NUMERO TESSERA SANITARIA
     String generalDoctorName;
     String generalDoctorSurname;
     boolean hasPrivateInsurance;
     String privateInsurance;
     String referenceFamilyMember; //famigliare di riferimento
     String referenceFamilyMemberNumber;
     */

    /* NON NELLA CLASSE PATIENT
    List<Appointment> appointments;
    List<MedicalRecord> clinicalRecords;
    List<Exemption> exemptions;
    */

    /*  QUI ENTRANO IN GIOCO LE KEYS DEI DATABASE E LE JOIN
    File medicalHistory;
     */
}
