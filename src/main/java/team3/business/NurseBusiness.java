package team3.business;

import team3.database.PatientDB;
import team3.dati.Patient;

import java.util.List;

/**
 * @author LucaGiorgi
 * Compiti di Nurse:
 * - Metodi implemetati con ITaskBusiness
 * - Vedere la giacenza dei farmaci
 */
public class NurseBusiness implements ITaskEmployee{

    public List<Patient> getAllPatient(){
        PatientDB patientDB = new PatientDB();
        return patientDB.readAll();
    }

    public void viewDrugs(String nameDrugs){
        //Vede la disponibilità dei farmaci
    }

    @Override
    public void viewMedicalRecords(String fiscalCode) {

    }

    @Override
    public void modifyMedicalRecords() {

    }

    @Override
    public void deleteMedicalRecords(String fiscalCode) {

    }

    @Override
    public void viewMyCalendar() {

    }
}
