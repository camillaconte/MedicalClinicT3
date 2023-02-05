package team3;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Luca","Rossi","rsslca2373h501d",
                new Address("via Roma",3,"Milano","Italia","00019"),
                "3497282988",39,new MedicalRecords("8888"),false);
        patient.getUserDetails();
        patient.patientHasExemption();

       //patient.getMedicalRecord(patient,new MedicalRecords("id32222",patient));
       // MedicalRecords medicalRecord=new MedicalRecords("id33333",patient);



    }
}