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
public class ImportDetailDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ImportDetailDAO() {
        conn = MyConnection.getConnection();
    }
    
    public ArrayList readImpDetList(){
        ArrayList list = new ArrayList<ImportDetailDTO>();
        try{
            String qry = "Select * from ImportDetail";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                ImportDetailDTO impDetDTO = new ImportDetailDTO();
                impDetDTO.setImportID(rs.getString("id"));
                impDetDTO.setProductID(rs.getString("productID"));
                impDetDTO.setProductName(rs.getString("productName"));
                impDetDTO.setQuantity(rs.getInt("quantity"));
                impDetDTO.setImportPrice(rs.getLong("importPrice"));
                impDetDTO.setSoldPrice(rs.getLong("soldPrice"));
                impDetDTO.setAmount(rs.getLong("amount"));                
                list.add(impDetDTO);
            }
        }
        catch (SQLException ex){
            
        }
        return list;
    }
    
    public void add(ImportDetailDTO impDet) {
        try{
            String qry = "insert into ImportDetail value ("
                    + "'" + impDet.getImportID() + "'" 
                    + ", " + "'" + impDet.getProductID()+ "'"  
                    + ", " + "'" + impDet.getProductName()+ "'"  
                    + ", "  + impDet.getQuantity()
                    + ", "  + impDet.getImportPrice()
                    + ", " + impDet.getSoldPrice()
                    + ", " + impDet.getAmount() 
                    + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu nhập thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu nhập thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public ImportDetailDTO findById(String id){
        ImportDetailDTO impDetDTO = new ImportDetailDTO();
        try{
            String qry = "select * from ImportDetail " + "where id = '"+id+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                impDetDTO.setImportID(rs.getString("id"));
                impDetDTO.setProductID(rs.getString("productID"));
                impDetDTO.setProductName(rs.getString("productName"));
                impDetDTO.setQuantity(rs.getInt("quantity"));
                impDetDTO.setImportPrice(rs.getLong("importPrice"));
                impDetDTO.setSoldPrice(rs.getLong("soldPrice"));
                impDetDTO.setAmount(rs.getLong("amount"));      
            }
        }
        catch(SQLException e){
            
        }
        return impDetDTO;
    }
    
    public boolean checkExistById(String id) throws SQLException {
        boolean isExist = false;
        String qry = "select * from ImportDetail  " + "where id = '"+id+ "'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(qry);
        if (rs.next()) {
              isExist = true;
	}
        return isExist;
    }
    
    public void edit(ImportDetailDTO impDet){
        try {
            String qry = "update ImportDetail set " 
                    +"productID='" +impDet.getProductID() + "'"
                    + ", " + "productName='" +impDet.getProductName() + "'"
                    + ", " + "quantity=" + impDet.getQuantity()
                    + ", " + "importPrice=" + impDet.getImportPrice()
                    + ", " + "soldPrice=" + impDet.getSoldPrice()
                    + ", " + "amount=" + impDet.getAmount()
                    + "where id = '"+impDet.getImportID()+"'";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public void deteleById(String id){
        try{
            String qry="delete from ImportDetail where id='" + id +"'";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }   
    }
}
