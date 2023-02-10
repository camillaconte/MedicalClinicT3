package team3.users;

import team3.Appointment;
import team3.Exemption;
import team3.MedicalRecord;

import java.io.File;
import java.util.List;

public class Patient extends User {

    List<Appointment> appointments;
    File medicalHistory;
    String healthInsuranceCard;
    List<MedicalRecord> clinicalRecords;
    String generalDoctorName;
    String generalDoctorSurname;
    List<Exemption> exemptions;
    boolean hasPrivateInsurance;
    String privateInsurance;
    String referenceFamilyMember; //famigliare di riferimento
    String referenceFamilyMemberNumber;

}
