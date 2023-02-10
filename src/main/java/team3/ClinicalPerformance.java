package team3;

import team3.users.Doctor;

import java.util.ArrayList;
import java.util.List;

/**
 * Ogni “Clinical Performance” ha fondamentalmente
 * —> una Clinic dove viene eseguita (la Clinic poi avrà tutte le sue caratteristiche: …)
 * -> una lista di appuntamenti in cui è possibile effettuarla
 *       —> gli appuntamenti poi avranno: un dottore (devono averlo fin dall'inizio)
 *                                        un paziente (lo acquisiscono al momento della prenotazione)
 */
public class ClinicalPerformance {

    String name; //e.g. "Elettrocardiogramma", "Visita Nefrologica"
    List<Doctor> doctorsAbleToPerform; //Which doctors can provide this kind of clinical performance?
    int price;
    int priceWithNationalHealthService;
    boolean isPaidByNationalHealthService;
    double amountPaidByNationalHealthService;
    boolean isMedicalPrescriptionRequired;
    int durationInMinutes;
    String specialWarnings;

}
