package team3.business;

/**
 * @author LucaGiorgi
 * Deve contenere tutti i metodi comuni di Dosctor e Nurse
 */
public interface ITaskEmployee {

    void viewMedicalRecords(String fiscalCode);

    void modifyMedicalRecords();

    void deleteMedicalRecords(String fiscalCode);

    void viewMyCalendar();


}
