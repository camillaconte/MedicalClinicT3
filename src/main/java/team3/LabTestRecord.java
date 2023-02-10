package team3;

import team3.users.Doctor;
import team3.users.LabTechnician;
import team3.users.Patient;

import java.util.List;

public class LabTestRecord {

    String labTestRecordId;
    List<LabTest> labTests;
    Patient patient;
    Doctor reportingDoctor; //medico refertante
    LabTechnician responsibleTechnician; //tecnico responsabile
    List<Equipment> labMachines;


}
