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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DUC PHU
 */
public class SupplierDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public SupplierDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(SupplierDTO sup){
        try{
            String qry = "insert into Supplier values ('" + sup.getId() + 
                    "', N'" + sup.getName() + 
                    "', '" + sup.getPhone() + 
                    "', N'" + sup.getAddress() + "')";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Thêm không thành công");
        }
    }
    
    public void delete(String id){
        try{
            String qry = "delete from Supplier where id = '" + id + "'";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Xóa không thành công");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Xóa không thành công");
        }
    }
    
    public void edit(SupplierDTO sup ,String id){
        try{
            String qry = "update Supplier set "
                    + "name = '" + sup.getName()+ "', "
                    + "phone = N'" + sup.getPhone()+ "', "
                    + "address = N'" + sup.getAddress()+ "'"
                    + "where id = '" + id + "'";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Sửa không thành công");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sửa không thành công");
        }
    }
    
    public ArrayList readData(){
        ArrayList<SupplierDTO> supList = new ArrayList<>();
        try{
            String qry = "select * from Supplier";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                SupplierDTO supTemp = new SupplierDTO();
                supTemp.setId(rs.getString("id"));
                supTemp.setName(rs.getString("name"));
                supTemp.setPhone(rs.getString("phone"));
                supTemp.setAddress(rs.getString("address"));
                supList.add(supTemp);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tải dữ liệu không thành công");
        }
        return supList;
    }
    
    //Kiểm tra mã duy nhất
    public boolean isUnique(String id){
        try{
            String qry = "select * from Supplier where id = '" + id + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                return false;
            }
        }catch(Exception e){
            
        }
        return true;
    }
}
