package team3;

import team3.business.Patient.PatientDAOImplement;
import team3.model.users.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Tools.createTableDatabase();
        //PatientDAOImplement.addPatient();

        List<Patient> myPatients = new ArrayList<>();
        PatientDAOImplement listOfPatients = new PatientDAOImplement(myPatients);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert patient's name, please");
        String patientName = scanner.nextLine();
        System.out.println("Insert patient's surname, please");
        String patientSurname = scanner.nextLine();
        System.out.println("Insert patient's fiscal code, please");
        String patientFiscalCode = scanner.nextLine();
        listOfPatients.addPatient(patientName, patientSurname, patientFiscalCode);
        for (Patient patient: myPatients){
            System.out.println(patient.getName() + " " + patient.getSurname());
        }

        System.out.println("Insert patient's fiscal code to find patient's ID");
        String fiscalCode = scanner.nextLine();
        System.out.println("Patient id is: " + listOfPatients.getPatientId(myPatients, fiscalCode));

    }
}
