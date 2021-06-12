package jdbcEx;

import java.sql.*; 

public class Ex2_GetData {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root", "Umang@123");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from `student`.`student` where address='Kanpur';"); 
            System.out.println("sid\tname\tadderess");
            while(rs.next()){
                System.out.println(rs.getInt("sid")+"\t"+rs.getString("name")+"\t"+rs.getString("address"));
            } 
            st.close();
            conn.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
