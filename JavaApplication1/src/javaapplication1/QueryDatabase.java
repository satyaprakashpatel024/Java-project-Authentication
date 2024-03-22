/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author satya
 */
public class QueryDatabase {
    static public void findAll(Connection conn) {
//          Step 3: writing sql query : updation
        String sql = "select * from students";
//            Step 4 : executing sql query and creating object of statement
        try {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while(result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getFloat(3)+" "+result.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
