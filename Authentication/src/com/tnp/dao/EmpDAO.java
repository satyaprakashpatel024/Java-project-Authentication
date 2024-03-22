package com.tnp.dao;

import com.tnp.bean.EmpBean;
import com.tnp.utility.ConnectionPool;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EmpDAO {
    static Connection conn;
    public int saveEmployee(EmpBean eb){
        conn = ConnectionPool.connectDb();
        int r = 0;
        String sql = "insert into emp(name,sal,deptno,gender,comm) values ('"+eb.getName()+"','"+eb.getSal()+"','"+eb.getDeptno()+"','"+eb.getGender()+"','"+eb.getComm()+"')";
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public static void main(String[] args) {
        EmpBean eb = new EmpBean();
        eb.setName("dummy");
        eb.setComm(19400.24f);
        eb.setGender("female");
        eb.setDeptno(2);
        eb.setSal(500000);
        EmpDAO obj = new EmpDAO();
        int r = obj.saveEmployee(eb);
        if(r>0){
            System.out.println("data inserted successfully...........");
            return ;
        }
        System.out.println("data insertion failed .................");
    }
}
