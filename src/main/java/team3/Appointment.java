package team3;

import java.time.LocalDateTime;

/**
 * Per una specifica Clinical Performance possono essere disponibili
 * un tot di appuntamenti...in base a quali medici la effettuano
 * Quindi potrebbe avere senso che sia ogni appuntamento ad avere
 * un medico?
 * Poi bisogna anche fare in modo che il medico sappia quali appuntamenti ha...
 */
public class Appointment {

    LocalDateTime dateTime;

    /**
     * Se un appuntamento è di durata < rispetto al tempo previsto per una
     * determinata ClinicalPerformance, allora non si può assegnare alla
     * ClinicalPerformance quella data e ora, quell'appuntamento
     */
    int minutes;

    String clinicCity;

    Room room; //in which room of the clinic will take place the visit?

    Patient patient;

    Doctor doctor;

    public Appointment(LocalDateTime dateTime, int minutes, String clinicCity, Room room, Doctor doctor) {
        this.dateTime = dateTime;
        this.minutes = minutes;
        this.clinicCity = clinicCity;
        this.room = room;
        this.doctor = doctor;
    }

    /**
     * A possibility to organize appointments in the clinic would be:
     * 1) set all the possible availability for each doctor:
     * e.g. Doctor Luca is in clinic 01/03/23 at 10:00 and 03/03/23 at 12:00
     * 2) setting the room
     * 3) NOT SETTING the Patient yet, we need to create appointments
     * with empty patient space!
     * THIS IS THE REASON WHY THE CONSTRUCTOR TAKES NO PATIENT PARAMETERS
     * IT IS NOT POSSIBLE TO CREATE AN APPOINTMENT without:
     * - a doctor available
     * - a room available
     */

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public void deletePatientFromAppointment() {
        this.patient = null;
    }

    public void getFreeAppointmentByDoctor (Doctor preferredDoctor, Patient newPatient) {
        if (this.doctor == preferredDoctor && this.patient == null) {
            this.patient = newPatient;
        }
        else {
            System.out.println("In this Date Doctor " + doctor + " is not available");
        }
    }
}
