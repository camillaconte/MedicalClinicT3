package team3.business.Patient;

import team3.model.serviceHandling.Address;
import team3.model.users.Patient;

import java.util.List;

public interface PatientDAO {

    public List<Patient> getAllPatients();

    public String getPatient(int id);

    public void addPatient(String name, String surname, String fiscalCode);

    public Patient findByFiscalCode(List<Patient> listPatients, String fiscalCode);

    public Patient findPatient(List<Patient> list, String fiscalCode);

    void setPatientAddress(int id, Address address);

    public void deletePatient(int id);

    public int getPatientId(List<Patient> list, String fiscalCode);

}
