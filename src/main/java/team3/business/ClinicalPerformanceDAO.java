package team3.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClinicalPerformanceDAO {

    public static void addClinicalPerformanceTable() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String url       = "jdbc:mysql://localhost:3306/MedicalClinic";
            String user      = "root";
            String password  = "password";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);

            String createTable = "CREATE TABLE IF NOT EXISTS clinicalPerformance(\n" +
                    "performance_id INT(10) NOT NULL AUTO_INCREMENT,\n" +
                    "performance_name VARCHAR(30),\n" +
                    "constraint performance_pk PRIMARY KEY (performance_id));";

            ps = conn.prepareStatement(createTable);
            ps.execute();


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
}