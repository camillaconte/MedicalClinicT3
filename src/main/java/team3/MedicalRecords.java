package team3;

public class MedicalRecords  {
    String numberId;

    public MedicalRecords(String numberId) {
        this.numberId = numberId;

    }

    public void createClinicalRecord(){
        System.out.println("aa");
    }
    public void deleteClinicalRecord(){
        System.out.println("bb");

    }

    @Override
    public String toString() {
        return "MedicalRecords{" +
                "numberId='" + numberId + '\'' +
                '}';
    }
}
