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
public class UpdateData {
    static public void updateIntoDatabase(Connection conn) {
//          Step 3: writing sql query : updation
        int id = 101;
        String name = "aman";
        String enroll = "0131CS101";
        float per = 68.55f;
        String sql = "update students set sname ='" + name + "',per='" + per + "',enroll='" + enroll + "' where sid='" + id + "'";
//            Step 4 : executing sql query and creating object of statement
        try {
            Statement stmt = conn.createStatement();
            int r = stmt.executeUpdate(sql);
            if (r > 0) {
                System.out.println("data updated successfully..................");
            } else {
                System.out.println("data updation failed..................");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
