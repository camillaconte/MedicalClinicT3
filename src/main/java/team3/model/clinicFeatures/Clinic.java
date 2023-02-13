package team3.model.clinicFeatures;

import team3.model.serviceHandling.Address;
import team3.model.users.*;

import java.io.File;
import java.util.List;

public class Clinic {

    String name;
    Address address;
    File addressBook; // numero del Direttore Sanitario
    List<Doctor> clinicDoctors;
    List<Patient> clinicPatients;
    List<Secretary> clinicSecretary;
    List<LabTechnician> labTechnicians;
    List<Nurse> nurses;





}
