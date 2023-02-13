package team3.model.serviceHandling;
import team3.model.clinicFeatures.Clinic;
import team3.model.users.Doctor;

import java.time.LocalDateTime;

public class Slot {

    LocalDateTime dateAndTime;
    Clinic clinic;
    Room assignedRoom;
    Doctor doctor;
    int minutesAvailable;

    /** RIFLESSIONE per assegnazione slot-clinicalPerf
     * N.B. Se una slot è di durata < rispetto al tempo previsto per una
     * determinata ClinicalPerformance, allora non si può assegnare alla
     * ClinicalPerformance quella slot!
     */

    /*public void getFreeSlotByDoctor (Doctor preferredDoctor, Patient newPatient) {
        if (this.doctor == preferredDoctor && this.patient == null) {
            this.patient = newPatient;
        }
        else {
            System.out.println("In this Date Doctor " + " is not available");
        }*/

}
