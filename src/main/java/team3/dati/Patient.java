package team3.dati;

/**
 * @author LucaGiorgi
 */
public class Patient extends User {
    //Attributi
    private String doctorID;
    private String patientInsurance; //Assicurazione sanitaria (il numero dell'assicurazione)
    private boolean hasExemption; //Esenzioni

    //Costruttore
    public Patient(){}

    //Get e Set
    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPatientInsurance() {
        return patientInsurance;
    }

    public void setPatientInsurance(String patientInsurance) {
        this.patientInsurance = patientInsurance;
    }

    public boolean isHasExemption() {
        return hasExemption;
    }

    public void setHasExemption(boolean hasExemption) {
        this.hasExemption = hasExemption;
    }
}

