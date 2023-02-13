package team3.model.records;

import team3.model.users.Doctor;
import team3.model.users.LabTechnician;
import team3.model.users.Patient;

import java.util.List;

public class LabTestRecord {

    String labTestRecordId;
    List<LabTest> labTests;
    Patient patient;
    Doctor reportingDoctor; //medico refertante
    LabTechnician responsibleTechnician; //tecnico responsabile
    List<Equipment> labMachines;


}
