package team3.model.serviceHandling;

import team3.model.serviceHandling.ClinicalPerformance;
import team3.model.users.Patient;

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
