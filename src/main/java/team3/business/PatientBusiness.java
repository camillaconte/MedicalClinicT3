package team3.business;

import team3.database.PatientDB;
import team3.dati.Patient;

import java.util.List;

public class PatientBusiness {

    public List<Patient> getAllPatient(){
        PatientDB patientDB = new PatientDB();
        return patientDB.readAll();
    }
}
