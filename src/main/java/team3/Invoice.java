package team3;

import team3.users.Patient;

import java.time.LocalDate;

public class Invoice {

    String id;
    LocalDate invoiceDate;
    Patient patient;
    ClinicalPerformance clinicalPerformance;
    float amount;
    float stamp; //bollo!
    boolean isPaid;

}
