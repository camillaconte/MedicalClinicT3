package team3.dati;

/**
 * @author LucaGiorgi
 */
public class MedicalRecords {

    Patient patient;
    String allergies;
    String anamnesiPatologicaRecente; //Cosa è successo negli ultimi mesi/settimane
    String motivoDelRicovero;
    String anamnesiFisiologica; // fuma, beve, come dorme, come mangia
    String terapiaInCorso;
    String esameObiettivo;
    String diarioClinico;
    String letteraDiDimissioni;


    //Costruttore
    public MedicalRecords(){}

    //Get e Set
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getAnamnesiPatologicaRecente() {
        return anamnesiPatologicaRecente;
    }

    public void setAnamnesiPatologicaRecente(String anamnesiPatologicaRecente) {
        this.anamnesiPatologicaRecente = anamnesiPatologicaRecente;
    }

    public String getMotivoDelRicovero() {
        return motivoDelRicovero;
    }

    public void setMotivoDelRicovero(String motivoDelRicovero) {
        this.motivoDelRicovero = motivoDelRicovero;
    }

    public String getAnamnesiFisiologica() {
        return anamnesiFisiologica;
    }

    public void setAnamnesiFisiologica(String anamnesiFisiologica) {
        this.anamnesiFisiologica = anamnesiFisiologica;
    }

    public String getTerapiaInCorso() {
        return terapiaInCorso;
    }

    public void setTerapiaInCorso(String terapiaInCorso) {
        this.terapiaInCorso = terapiaInCorso;
    }

    public String getEsameObiettivo() {
        return esameObiettivo;
    }

    public void setEsameObiettivo(String esameObiettivo) {
        this.esameObiettivo = esameObiettivo;
    }

    public String getDiarioClinico() {
        return diarioClinico;
    }

    public void setDiarioClinico(String diarioClinico) {
        this.diarioClinico = diarioClinico;
    }

    public String getLetteraDiDimissioni() {
        return letteraDiDimissioni;
    }

    public void setLetteraDiDimissioni(String letteraDiDimissioni) {
        this.letteraDiDimissioni = letteraDiDimissioni;
    }
}
