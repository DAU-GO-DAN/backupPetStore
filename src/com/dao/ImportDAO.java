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
public class ImportDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ImportDAO() {
        conn = MyConnection.getConnection();
    }
    
    public ArrayList readImpList(){
        ArrayList list = new ArrayList<ImportDTO>();
        try{
            String qry = "Select * from Import";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while (rs.next())
            {
                ImportDTO impDTO = new ImportDTO();
                impDTO.setImportID(rs.getString("id"));
                impDTO.setCreatedDate(rs.getString("createdDate"));
                impDTO.setAmount(rs.getInt("amount"));
                impDTO.setEmployeeID(rs.getString("employeeID"));
                list.add(impDTO);
            }
        }
        catch (SQLException ex){
            
        }
        return list;
    }
    
    public ImportDTO findById(String id){
        ImportDTO impDTO = new ImportDTO();
        try{
            String qry = "select * from Import " + "where id = '"+id+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){

                impDTO.setImportID(rs.getString("id"));
                impDTO.setCreatedDate(rs.getString("createdDate"));
                impDTO.setAmount(rs.getInt("amount"));
                impDTO.setEmployeeID(rs.getString("employeeID"));
            }
        }
        catch(SQLException e){
            
        }
        return impDTO;
    }
    
    public void add(ImportDTO imp) {
        try{
            String qry = "insert into Import value ("
                    + "'" + imp.getImportID() + "'" 
                    + ", " + "'" + imp.getCreatedDate() + "'"  
                    + ", " + imp.getTotalAmount()
                    + ", " + "'" + imp.getEmployeeID()+ "'"
                    + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Thêm phiếu nhập thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm phiếu nhập thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public boolean checkExistById(String id) throws SQLException {
        boolean isExist = false;
        String qry = "select * from Import " + "where id = '"+id+"'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(qry);
        if (rs.next()) {
              isExist = true;
	}
        return isExist;
    }
    
}
