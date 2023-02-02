package team3;

public class Doctor extends PersonalData {
      PersonalData personalData;
    String typology;
    int numberPatients;
    public Doctor (String name, String surname, int dateOfBirth, String fiscalCode, int numberPhone,
                   String nationality,String typology,int numberPatients){
        super(name,surname,dateOfBirth,fiscalCode,numberPhone,nationality);
        this.typology=typology;
        this.numberPatients=numberPatients;


    }
    public static void  RecipeAcceptance(){
    }
}

