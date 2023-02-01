package team3.dati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LucaGiorgi
 */
public class ExamEmocromo {
    private double globuliRossi;
    private double emoglobina;
    private double ematocrito;
    private double mcv;
    private double mch;
    private double mchc;
    private double piastrine;

    private double neutX100;
    private double lymphX100;
    private double monoX100;
    private double eoX100;
    private double basoX100;

    private double neutValue;
    private double lymphValue;
    private double monoValue;
    private double eoValue;
    private double basoValue;


    private List<Double> exams_Emocromo = new ArrayList<>(Arrays.asList(globuliRossi,emoglobina,ematocrito,mcv,mch,mchc,piastrine));
    private List<Double> formulaLeucocitaria = new ArrayList<>(Arrays.asList(neutX100,lymphX100,monoX100,eoX100,basoX100,neutValue,lymphValue,monoValue,eoValue,basoValue));

    public ExamEmocromo(){}

    public double getGlobuliRossi() {
        return globuliRossi;
    }

    public void setGlobuliRossi(double globuliRossi) {
        this.globuliRossi = globuliRossi;
    }

    public double getEmoglobina() {
        return emoglobina;
    }

    public void setEmoglobina(double emoglobina) {
        this.emoglobina = emoglobina;
    }

    public double getEmatocrito() {
        return ematocrito;
    }

    public void setEmatocrito(double ematocrito) {
        this.ematocrito = ematocrito;
    }

    public double getMcv() {
        return mcv;
    }

    public void setMcv(double mcv) {
        this.mcv = mcv;
    }

    public double getMch() {
        return mch;
    }

    public void setMch(double mch) {
        this.mch = mch;
    }

    public double getMchc() {
        return mchc;
    }

    public void setMchc(double mchc) {
        this.mchc = mchc;
    }

    public double getPiastrine() {
        return piastrine;
    }

    public void setPiastrine(double piastrine) {
        this.piastrine = piastrine;
    }

    public double getNeutX100() {
        return neutX100;
    }

    public void setNeutX100(double neutX100) {
        this.neutX100 = neutX100;
    }

    public double getLymphX100() {
        return lymphX100;
    }

    public void setLymphX100(double lymphX100) {
        this.lymphX100 = lymphX100;
    }

    public double getMonoX100() {
        return monoX100;
    }

    public void setMonoX100(double monoX100) {
        this.monoX100 = monoX100;
    }

    public double getEoX100() {
        return eoX100;
    }

    public void setEoX100(double eoX100) {
        this.eoX100 = eoX100;
    }

    public double getBasoX100() {
        return basoX100;
    }

    public void setBasoX100(double basoX100) {
        this.basoX100 = basoX100;
    }

    public double getNeutValue() {
        return neutValue;
    }

    public void setNeutValue(double neutValue) {
        this.neutValue = neutValue;
    }

    public double getLymphValue() {
        return lymphValue;
    }

    public void setLymphValue(double lymphValue) {
        this.lymphValue = lymphValue;
    }

    public double getMonoValue() {
        return monoValue;
    }

    public void setMonoValue(double monoValue) {
        this.monoValue = monoValue;
    }

    public double getEoValue() {
        return eoValue;
    }

    public void setEoValue(double eoValue) {
        this.eoValue = eoValue;
    }

    public double getBasoValue() {
        return basoValue;
    }

    public void setBasoValue(double basoValue) {
        this.basoValue = basoValue;
    }

    public List<Double> getExams_Emocromo() {
        return exams_Emocromo;
    }

    public void setExams_Emocromo(List<Double> exams_Emocromo) {
        this.exams_Emocromo = exams_Emocromo;
    }

    public List<Double> getFormulaLeucocitaria() {
        return formulaLeucocitaria;
    }

    public void setFormulaLeucocitaria(List<Double> formulaLeucocitaria) {
        this.formulaLeucocitaria = formulaLeucocitaria;
    }
}
