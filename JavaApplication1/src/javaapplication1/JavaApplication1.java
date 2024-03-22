package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
//import static javaapplication1.DeleteData.deleteIntoDatabase;
//import static javaapplication1.InsertData.insertIntoDatabase;
import static javaapplication1.QueryDatabase.findAll;
//import static javaapplication1.UpdateData.updateIntoDatabase;

public class JavaApplication1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // TODO code application logic here
//        Step 1: regestring driver
        String url = "jdbc:mysql://localhost:3306/student";
        String userName = "root";
        String password = "PFH#23kgrw9";

        try {
//            Step 2 : creating connection to database
            Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println("database connected......................");

//            Step 3 & 4 
//            insertIntoDatabase(conn);
//            updateIntoDatabase(conn);
//            deleteIntoDatabase(conn);
            findAll(conn);

//            Step 5: close the connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
