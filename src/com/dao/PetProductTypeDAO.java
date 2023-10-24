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
public class PetProductTypeDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public PetProductTypeDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(PetProductTypeDTO type)
    {
        try{
            String qry = "insert into ProductType value ("
                    + "'" + type.getCategoryId() + "'"
                    + ", " + "N'" + type.getName() + "'"
                    + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm type thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm type thất bại!");
            }
        }
        catch (SQLException ex)
        {
            
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from ProductType "
                    + " where typeID ='" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex)
        {
            
        }
    }
    
    public void edit(PetProductTypeDTO type)
    {
        try{
            String qry = "Update ProductType "
                    + " set "
                    + " typeName = N'" +type.getName() + "'"
                    + " where typeID = '" +type.getCategoryId()+ "'";;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public ArrayList readTypeList()
    {
        ArrayList list = new ArrayList<PetProductTypeDTO>();
        try{
            String qry = "Select * from ProductType";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                PetProductTypeDTO type = new PetProductTypeDTO();
                type.setCategoryId(rs.getString("typeID"));
                type.setName(rs.getString("typeName"));
                list.add(type);
            }
           
        }
        catch(SQLException ex)
        {
            
        }
        return list;
    }
    
}
