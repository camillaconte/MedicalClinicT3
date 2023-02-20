package team3.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseTools {

    //ma non sono sicura che sia utile!
    //perché comunque quando devi fare qualcosa col DB è meglio sempre connettersi
    //"direttamente", cioè subito prima di inserire la query
    //(vedi PatientDAO method: addPatient()

    //piuttosto serve un metodo generico!!! modificare i singoli metodi!

    public static void connectionDatabase() {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/MedicalClinic";
            String user      = "root";
            String password  = "password";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null){
                    conn.close();}
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }

    }

    public static void createTableDatabase() {

        Connection conn;
        PreparedStatement ps;

        String url = "jdbc:mysql://localhost:3306/medicalClinic";
        String user = "root";
        String password = "password";

        try {
            conn = DriverManager.getConnection(url, user, password);
            String createTable = "CREATE TABLE IF NOT EXISTS medicalClinic.patients(\n" +
                    "patient_id INT(10) NOT NULL AUTO_INCREMENT,\n" +
                    "first_name VARCHAR(30),\n" +
                    "last_name VARCHAR(30),\n" +
                    "constraint patient_pk PRIMARY KEY (patient_id));";

            ps = conn.prepareStatement(createTable);
            ps.execute();
            conn.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

