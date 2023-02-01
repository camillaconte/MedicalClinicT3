package team3.dati;

import java.util.Date;

/**
 * @author LucaGiorgi
 */
public class Contract extends Doctor{
    //Attributi
    private String tipeOfContract;
    private String contractID;
    private Date startContract;
    private Date endContract;

    //Costruttore
    public Contract(){}

    //Get e Set
    public String getTipeOfContract() {
        return tipeOfContract;
    }

    public void setTipeOfContract(String tipeOfContract) {
        this.tipeOfContract = tipeOfContract;
    }

    public Date getStartContract() {
        return startContract;
    }

    public void setStartContract(Date startContract) {
        this.startContract = startContract;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }
}
