package team3.business;

import team3.database.ContractDB;
import team3.database.DoctorDB;
import team3.database.NurseDB;
import team3.database.PatientDB;
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


    public void saveContract(String name, String surname, Date birthDate, String fiscalCode,
                             String e_mail, String telephoneNumber, Address address, String contractID,
                             String specialization, Date startContract, Date endContract, String typeOfContract){

        /*EVENTUALE VALIDAZIONE DEI CAMPI VUOTI O NULL*/
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

        /*PERSISTENZA SUL DB*/
        ContractDB contractDB = new ContractDB();
        contractDB.save(contract);
    }





    public void savePatient(String name, String surname, Date birthDate,
                            String fiscalCode, String e_mail, String telephoneNumber,
                            Address address, String doctorID, String patientInsurance,
                            boolean hasExemption){
        /*EVENTUALE VALIDAZIONE DEI CAMPI VUOTI O NULL*/
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

        /*PERSISTENZA SUL DB*/
        PatientDB patientDB = new PatientDB();
        patientDB.save(patient);
    }

    public void saveDoctor(String name, String surname, Date birthDate,
                          String fiscalCode, String e_mail, String telephoneNumber,
                          Address address, EmployeeBadge employeeBadge, Contract contract,
                          String medicalAssociation, String medicalAssociationId, String specialization){
        /*EVENTUALE VALIDAZIONE DEI CAMPI VUOTI O NULL*/
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

        /*PERSISTENZA SUL DB*/
        DoctorDB doctorDB = new DoctorDB();
        doctorDB.save(doctor);
    }

    public void saveNurse(String name, String surname, Date birthDate,
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

        /*PERSISTENZA SUL DB*/
        NurseDB nurseDB = new NurseDB();
        nurseDB.save(nurse);
    }

    public void viewEmployee(String fiscalCode){
        //Ricerca nel db
    }

    public void createAppointment(){
        //Fissare un appuntamento nel calendario
    }



}
