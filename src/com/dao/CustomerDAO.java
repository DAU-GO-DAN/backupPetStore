/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;
import java.sql.ResultSet;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.security.Security;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DUC PHU
 */
public class CustomerDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public CustomerDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(CustomerDTO cus){
        try{
            String qry = "insert into Customer values ('" 
                    + cus.getCusID() + 
                    "', N'" + cus.getCusName() + 
                    "', '" + cus.getPhone() + 
                    "', N'" + cus.getAddress() + 
                    "', '" + cus.getCreatedDate() +"')";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }
        }catch(SQLException e){
//            e.printStackTrace();
        }
    }
    
    public void edit(CustomerDTO cus ,String id){
        try{
            String qry = "update Customer set "
                    + "cusName = N'" + cus.getCusName()+ "', "
                    + "phone = '" + cus.getPhone()+ "', "
                    + "address = N'" + cus.getAddress()+ "', "
                    + "createdDate = '" + cus.getCreatedDate() + "' "
                    + "where cusID = '" + id + "'";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Sửa không thành công");
            }
        }catch(SQLException e){
//            e.printStackTrace();
        }
    }
    
    public ArrayList readData(){
        ArrayList<CustomerDTO> cusList = new ArrayList<>();
        try{
            String qry = "select * from Customer";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                CustomerDTO cusTemp = new CustomerDTO();
                cusTemp.setCusID(rs.getString("cusID"));
                cusTemp.setCusName(rs.getString("cusName"));
                cusTemp.setPhone(rs.getString("phone"));
                cusTemp.setAddress(rs.getString("address"));
                cusTemp.setCreatedDate(rs.getDate("createdDate").toLocalDate());
                cusList.add(cusTemp);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tải dữ liệu không thành công");
        }
        return cusList;
    }
    
    //Kiểm tra mã duy nhất
    public boolean isUnique(String id){
        try{
            String qry = "select * from Customer where cusID = '" + id + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return true;
    }
}
