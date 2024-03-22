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
public class InsertData {
    static public void insertIntoDatabase(Connection conn) {
//          Step 3: writing sql query : insertion 
        int id = 103;
        String name = "Ashu";
        String enroll = "0131CS103";
        float per = 68.55f;
        String sql = "insert into students values('" + id + "','" + name + "','" + per + "','" + enroll + "')";
//            Step 4 : executing sql query and creating object of statement
        try {
            Statement stmt = conn.createStatement();
            int r = stmt.executeUpdate(sql);
            if (r > 0) {
                System.out.println("data inserted successfully..................");
            } else {
                System.out.println("data insertion failed..................");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
