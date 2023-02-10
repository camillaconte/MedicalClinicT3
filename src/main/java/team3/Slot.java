package team3;
import team3.users.Doctor;

import java.time.LocalDateTime;
import java.util.Date;

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
