/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author satya
 */
public class DeleteData {
    static public void deleteIntoDatabase(Connection conn) {
//          Step 3: writing sql query : deletion 
        int id = 102;
        String sql = "delete from students where sid='" + id + "'";
//            Step 4 : executing sql query and creating object of statement
        try {
            Statement stmt = conn.createStatement();
            int r = stmt.executeUpdate(sql);
            if (r > 0) {
                System.out.println("data deleted successfully..................");
            } else {
                System.out.println("data deletion failed..................");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
