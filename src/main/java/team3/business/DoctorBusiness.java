package team3.business;

import team3.database.DoctorDB;
import team3.database.PatientDB;
import team3.dati.Doctor;
import team3.dati.MedicalRecords;
import team3.dati.Patient;

import java.util.List;

/**
 * @author Lucagiorgi
 * Compiti di Doctor:
 * - Deve creare la cartella clinica del paziente
 * -
 */
public class DoctorBusiness implements ITaskEmployee{

    public List<Doctor> getAllDoctor(){
        DoctorDB doctorDB = new DoctorDB();
        return doctorDB.readAll();
    }

    public void createMedicalRecords(
            Patient patient, String allergies, String anamnesiPatologicaRecente, String motivoDelRicovero,
            String anamnesiFisiologica, String terapiaInCorso, String esameObiettivo, String diarioClinico, String letteraDiDimissioni)
    {
        MedicalRecords records = new MedicalRecords();
        records.setPatient(patient);
        records.setAllergies(allergies);
        records.setAnamnesiPatologicaRecente(anamnesiPatologicaRecente);
        records.setMotivoDelRicovero(motivoDelRicovero);
        records.setAnamnesiFisiologica(anamnesiFisiologica);
        records.setTerapiaInCorso(terapiaInCorso);
        records.setEsameObiettivo(esameObiettivo);
        records.setDiarioClinico(diarioClinico);
        records.setLetteraDiDimissioni(letteraDiDimissioni);

        //Salva dati su db patient
        try {
            //Apri connessione
            //Fai cose
        } catch (Exception e) {
            //logg dell'eccezione
        } finally {
            //Termina la connessione
        }
    }


    @Override
    public void viewMedicalRecords(String fiscalCode) {
        //Ricerca nel db
    }

    @Override
    public void modifyMedicalRecords() {

    }

    @Override
    public void deleteMedicalRecords(String fiscalCode) {
        //ricerca con eliminazione
    }

    @Override
    public void viewMyCalendar() {
        //Ti mostra i tuoi impegni
    }
}
