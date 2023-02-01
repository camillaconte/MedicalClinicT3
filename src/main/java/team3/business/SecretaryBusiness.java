package team3.business;

import team3.dati.*;

import java.util.Date;

/**
 * @author LucaGiorgi
 * Compiti della secretaria:
 * - Crea e salva tutte le figure della clinica (patient, doctor, nurse)   °°°
 * - Visualizazione dipendente
 * - Gestisce gli orari dei dipendenti
 * - Prende gli appuntamenti
 * - Crea il contratto al dipendente
 */
public class SecretaryBusiness {

    public void newPatient(String name, String surname, Date birthDate,
                            String fiscalCode, String e_mail, String telephoneNumber,
                            Address address, String doctorID, String patientInsurance,
                            boolean hasExemption){
        Patient patient = new Patient();
        patient.setName(name);
        patient.setSurname(surname);
        patient.setBirthDate(birthDate);
        patient.setFiscalCode(fiscalCode);
        patient.setE_mail(e_mail);
        patient.setTelephoneNumber(telephoneNumber);
        patient.setAddress(address);
        patient.setDoctorID(doctorID);
        patient.setPatientInsurance(patientInsurance);
        patient.setHasExemption(hasExemption);


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

    public void newDoctor(String name, String surname, Date birthDate,
                          String fiscalCode, String e_mail, String telephoneNumber,
                          Address address, EmployeeBadge employeeBadge, Contract contract,
                          String medicalAssociation, String medicalAssociationId, String specialization){
        Doctor doctor = new Doctor();
        doctor.setName(name);
        doctor.setSurname(surname);
        doctor.setBirthDate(birthDate);
        doctor.setFiscalCode(fiscalCode);
        doctor.setE_mail(e_mail);
        doctor.setTelephoneNumber(telephoneNumber);
        doctor.setAddress(address);
        doctor.setBadge(employeeBadge);
        doctor.setContract(contract);
        doctor.setMedicalAssociation(medicalAssociation);
        doctor.setMedicalAssociationId(medicalAssociationId);
        doctor.setSpecialization(specialization);

        try {
            //Apri connessione
            //Fai cose
        } catch (Exception e) {
            //logg dell'eccezione
        } finally {
            //Termina la connessione
        }
    }

    public void newNurse(String name, String surname, Date birthDate,
                         String fiscalCode, String e_mail, String telephoneNumber,
                         Address address, EmployeeBadge employeeBadge, Contract contract
    ){
        Nurse nurse = new Nurse();
        nurse.setName(name);
        nurse.setSurname(surname);
        nurse.setBirthDate(birthDate);
        nurse.setFiscalCode(fiscalCode);
        nurse.setE_mail(e_mail);
        nurse.setTelephoneNumber(telephoneNumber);
        nurse.setAddress(address);
        nurse.setBadge(employeeBadge);
        nurse.setContract(contract);

        //Salva nel db
        try {
            //Apri connessione
            //Fai cose
        } catch (Exception e) {
            //logg dell'eccezione
        } finally {
            //Termina la connessione
        }
    }

    public void viewEmployee(String fiscalCode){
        //Ricerca nel db
    }

    public void createAppointment(){
        //Fissare un appuntamento nel calendario
    }

    public void newContract(String name, String surname, Date birthDate, String fiscalCode,
                            String e_mail, String telephoneNumber, Address address, String contractID,
                            String specialization, Date startContract, Date endContract, String typeOfContract){
        Contract contract = new Contract();
        contract.setName(name);
        contract.setSurname(surname);
        contract.setBirthDate(birthDate);
        contract.setFiscalCode(fiscalCode);
        contract.setE_mail(e_mail);
        contract.setTelephoneNumber(telephoneNumber);
        contract.setAddress(address);
        contract.setContractID(contractID);
        contract.setSpecialization(specialization);
        contract.setStartContract(startContract);
        contract.setEndContract(endContract);
        contract.setTipeOfContract(typeOfContract);

        //Salva su db
        try {
            //Apri connessione
            //Fai cose
        } catch (Exception e) {
            //logg dell'eccezione
        } finally {
            //Termina la connessione
        }

    }

}
