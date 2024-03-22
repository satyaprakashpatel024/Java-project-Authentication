package authentication;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author satya Prakash Patel
 */
public class Authentication {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //        Step 1: regestring driver
        String url = "jdbc:mysql://localhost:3306/tnpdb";
        String userName = "root";
        String password = "PFH#23kgrw9";
        try {
//            Step 2 : creating connection to database
            Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println("database connected successfully ......................");

//            Step 3: close the connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
