package team3.business;

import team3.model.users.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDAO {

    public static void addPatient () {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String url = "jdbc:mysql://localhost:3306/medicalClinic";
            String user = "root";
            String password = "password";
            conn = DriverManager.getConnection(url, user, password);
            String newRowInPatients = "INSERT INTO medicalClinic.patients DEFAULT VALUES;";
            ps = conn.prepareStatement(newRowInPatients);
            ps.execute();

            Patient patientToInsert = new Patient();
            // e qui dovrei avere impostato il metodo setName sempre con una connessione al database!
            patientToInsert.setName("........");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }



    }


}
