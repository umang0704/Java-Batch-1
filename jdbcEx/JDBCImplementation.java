package jdbcEx;

import java.sql.*;
import java.util.*;
import utilities.GetValue;
class DatabaseConnectivity {

    public static Connection conn;
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "Umang@123");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        
   
    public static boolean enterRecord(String name, String address) {
        try {
            Statement st = conn.createStatement();
            boolean c = st.execute("insert into `student`.`student`(name,address) values ('" + name + "','" + address + "');");
            st.close();
            return c;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public static ArrayList<String> getDetails(String name){
        ArrayList<String> str = null;
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from `student`.`student` where name like '%"+name+"%' ;");
            int i =0;
            str = new ArrayList<>();
            while(rs.next()){
                str.add(rs.getInt("sid")+"\t"+rs.getString("name")+"\t"+rs.getString("address"));
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        } 
        return str;
    }
    
    public static ArrayList<String> getAllRecords(){
        ArrayList<String> str = null;
        try{
            str = new ArrayList<>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from `student`.`student`;");
            while(rs.next()){
                Integer sid = rs.getInt("sid");
                String name = rs.getString("name");
                String address = rs.getString("address");
                str.add(sid+"\t"+name+"\t"+address);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return str;
    } 
    
    public static boolean editRecord(Integer sid ,String name, String address){
       try{
            
            Statement st = conn.createStatement();
            int effectedLines = st.executeUpdate("update `student`.`student`set name = '"+name+"', address='"+address+"'where sid = "+sid+";");
            if(effectedLines == 1)
                return true;
            return false;
       }catch(Exception ex){
            ex.printStackTrace();
           return false;
        } 
    }
}

public class JDBCImplementation {

    private static Scanner sc = new Scanner(System.in);

    public static void showWelcomeMenu() {
        System.out.println("------------------------------");
        System.out.println("SCHOOL Records:");
        System.out.println("******Select your choice******");
        System.out.println("1- Enter Record");
        System.out.println("2- View Record");
        System.out.println("3- Update Records");
        System.out.println("------------------------------");
        System.out.println("4- Exit");
        System.out.println("------------------------------");
    }

    public static void enterRecordsM1() {
        System.out.println("------------------------------");
        System.out.println("SCHOOL Records:");
        System.out.println("******Select your choice******");
        System.out.println("Enter name:");
        String name = GetValue.scanString();
        System.out.println("Enter Address:");
        String address = GetValue.scanString();
        DatabaseConnectivity.enterRecord(name, address);
        System.out.println("------------------------------");
    }

    public static void viewRecordsM1() {
        System.out.println("------------------------------");
        System.out.println("SCHOOL Records:");
        System.out.println("******Select your choice******"); 
        String name = GetValue.scanString("Enter name:");
        System.out.println("Sid\tName\tAddress");
      ArrayList<String> result = DatabaseConnectivity.getDetails(name);
        for(String i : result)
            System.out.println(i);
        System.out.println("------------------------------");
        
        
    }

    public static void updateRecordsM1() {
        System.out.println("------------------------------");
        System.out.println("SCHOOL Records:");
        System.out.println("Sid\tName\tAddress");
        for(String o : DatabaseConnectivity.getAllRecords()){ 
            System.out.println(o);
        } 
        Integer sid = GetValue.scanInt("Enter sid for the record that has to be edited:");
        String name = GetValue.scanString("Enter name:");
        String address = GetValue.scanString("Ener=ter Address:");
        DatabaseConnectivity.editRecord(sid, name, address); 
        System.out.println("-----Updated records----------"); 
        System.out.println("Sid\tName\tAddress");
        for(String o : DatabaseConnectivity.getAllRecords()){ 
            System.out.println(o);
        }
        System.out.println("------------------------------");
    }
    
    public static void main(String[] args)  {
        char ch = 'n';
        do {   
            showWelcomeMenu();
        int c = sc.nextInt();
            switch(c){
                case 1:
                    enterRecordsM1();
                    break;
                case 2:
                    viewRecordsM1();
                    break;
                case 3:
                    updateRecordsM1();
                    break;
                case 4:
                    System.out.println("Exited Succefully..!");
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
               
                    System.out.println("Do you want to continue(Yes->'y' | No->'n')");
                    ch = sc.next().charAt(0);
                
        } while (ch=='y');
       
    }

}
