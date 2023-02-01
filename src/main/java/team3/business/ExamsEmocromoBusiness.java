package team3.business;

import team3.dati.ExamEmocromo;

import java.util.Scanner;

public class ExamsEmocromoBusiness {

    public ExamEmocromo InsertValueExams (){
        ExamEmocromo examEmocromo = new ExamEmocromo();
        Scanner scanner = new Scanner(System.in);
        for(Double x: examEmocromo.getExams_Emocromo()){
            System.out.println("Insert value: ");
            double a = scanner.nextDouble();
            x = a;
        }
        for(Double x: examEmocromo.getFormulaLeucocitaria()){
            System.out.println("Insert value: ");
            double a = scanner.nextDouble();
            x = a;
        }
        return examEmocromo;
    }
    


}
