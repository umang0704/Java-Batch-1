package jdbcEx;

import java.sql.*;

public class Ex1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "Umang@123");
            if (conn != null) {
                System.out.println("Connection Created..!");
                
            } else {
                System.out.println("Connection not Created..!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
