package com.tnp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author satya Prakash Patel
 */
public class ConnectionPool {
    static Connection conn;
    public static Connection connectDb() {
        try {
            //        Step 1: regester driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //            Step 2 : creating connection to database
        String url = "jdbc:mysql://localhost:3306/tnpdb";
        String userName = "root";
        String password = "PFH#23kgrw9";
        
        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("database connected successfully ......................");
        //        return the connection
        return conn;
    }
}
