package team3;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {

    String specialty; //e.g. Cardiologist, Gynecologist...
    File curriculum;
    String medicalAssociation; //"Ordine dei medici di Bologna"
    List<ClinicalPerformance> doctorPerformances;
    String clinicOfPractice; //in quale delle cliniche lavora?

    //DISPONIBILITà, e.g. Monday (any) at 9, 10:30, 12:00..
    List<Appointment> availabilities;

    String professionalInsuranceCompany; //compagnia assicurazione professionale
    boolean hasProvidedProfessionalInsurance;









}
