package team3.business;


import team3.database.ContractDB;
import team3.dati.Contract;

import java.util.List;


public class ContractBusiness {

    public List<Contract> getAllContract(){
        ContractDB contractDB = new ContractDB();
        return contractDB.readAll();
    }
}
