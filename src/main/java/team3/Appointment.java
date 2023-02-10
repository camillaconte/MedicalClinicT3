package team3;

import team3.users.Doctor;
import team3.users.Patient;

import java.time.LocalDateTime;

/**
 * Per una specifica Clinical Performance possono essere disponibili
 * un tot di appuntamenti...in base a quali medici la effettuano
 * Quindi potrebbe avere senso che sia ogni appuntamento ad avere
 * un medico?
 * Poi bisogna anche fare in modo che il medico sappia quali appuntamenti ha...
 */
public class Appointment {

    Slot slot;
    //Doctor doctor; è già nella slot!
    Patient patient;

    public Appointment(Slot slot, Patient patient) {
        this.slot = slot;
        this.patient = patient;
    }

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public void deletePatientFromAppointment() {
        this.patient = null;
    }

    }

