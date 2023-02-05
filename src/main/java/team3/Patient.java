package team3;

public class Patient extends User {
    MedicalRecords medicalRecords;
    Doctor doctorId;
    boolean hasExemption;

    @Override
    public void getUserDetails() {
        System.out.println(name+ " " + surname +" "+fiscalCode+ " " + address +
                   " "+ phoneNumber+ " "+ age);

        System.out.println(medicalRecords);
    }
    public Patient(String name, String surname, String fiscalCode,
                   Address address, String phoneNumber, int age, MedicalRecords medicalRecords,
                   boolean hasExemption) {
        super(name,surname,fiscalCode,address,phoneNumber,age);

        this.medicalRecords=medicalRecords;
        this.hasExemption=hasExemption;

    }



    //public void getMedicalRecord(Patient patient, MedicalRecords medicalRecords){
      //  System.out.printf("Patient:%s%n%s" ,patient,medicalRecords);
    //}
    public void patientHasExemption() {
        if (hasExemption == true) {
            System.out.println("The patient has exemption, he's excluded from payment");
        } else {
            System.out.println("The patient has not exemption, he has to pay");
        }
    }


}





