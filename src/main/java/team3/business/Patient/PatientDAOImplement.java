package team3.business.Patient;

import team3.model.serviceHandling.Address;
import team3.model.users.Patient;
import team3.utils.FindProperty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImplement implements PatientDAO {

    //List: in questo caso simula il DB
    List<Patient> patientsList;

    public PatientDAOImplement(List<Patient> patientsList){
        this.patientsList = patientsList;
        patientsList = new ArrayList<>();
    }

    @Override
    public void addPatient (String name, String surname, String fiscalCode){
        Patient patientToAdd = new Patient();
        patientToAdd.setName(name);
        patientToAdd.setSurname(surname);
        patientToAdd.setFiscalCode(fiscalCode);
        patientsList.add(patientToAdd);
        patientToAdd.setId(patientsList.indexOf(patientToAdd));
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientsList;
    }

    @Override
    public String getPatient(int id) {
        return (patientsList.get(id).getName() + " " + patientsList.get(id).getSurname());
    }

    @Override
    public void setPatientAddress(int id, Address address) {
        patientsList.get(id).setAddress(address);
    }

    @Override
    public void deletePatient(int id) {

    }

    @Override
    public Patient findByFiscalCode (List<Patient> listPatients, String fiscalCode) {
        return FindProperty.findByProperty(listPatients, patient -> fiscalCode.equals(patient.getFiscalCode()));
    }

    @Override
    public Patient findPatient(List<Patient> list, String fiscalCode) {
        for (Patient patient : list) {
            if (patient.getFiscalCode().equals(fiscalCode)) {
                return patient;
            }
        } return null; //???????
    }

    @Override
    public int getPatientId(List<Patient> list, String fiscalCode){
        int id = list.indexOf(findPatient(list, fiscalCode));
        return id;
    }
            /*public void getPatientId(List<Patient> listWhereSearch, String fiscalCode){
        //cerco l'elemento nella lista listPatients che contiene quel codice fiscale
        findByFiscalCode(listWhereSearch,fiscalCode);
    }*/

    /*
    public static void addPatientToDB () {
            Connection conn = null;
            PreparedStatement ps = null;

            String url = "jdbc:mysql://localhost:3306/medicalClinic";
            String user = "root";
            String password = "password";

            try {
                conn = DriverManager.getConnection(url, user, password);

            //String newRowInPatients = "INSERT INTO medicalClinic.patients DEFAULT VALUES;";
            //ps = conn.prepareStatement(newRowInPatients);
            //ps.execute();

                Patient patientToInsert = new Patient();
                // e qui dovrei avere impostato il metodo setName sempre con una connessione al database!
                patientToInsert.setName("Chiara");
                String patientFirstName = patientToInsert.getName();
                String setNameInTable = "INSERT INTO medicalClinic.patients (`first_name`) VALUES (\'" + patientFirstName + "\');";
                ps = conn.prepareStatement(setNameInTable);
                ps.execute();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }*/
}
