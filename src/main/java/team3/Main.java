package team3;

import team3.business.SecretaryBusiness;
import team3.dati.Address;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SecretaryBusiness se = new SecretaryBusiness();


        String name = null, surname = null, fiscalCode = null, e_mail = null, telephoneNumber = null, contractID = null, specialization = null,typeOfContract = null;
        Date birthDate = null, startContract = null, endContract = null;
        Address address = null;
        se.saveContract(name,  surname,  birthDate,  fiscalCode,
                e_mail,  telephoneNumber,  address,  contractID,
                specialization,  startContract,  endContract,  typeOfContract);
    }



}
