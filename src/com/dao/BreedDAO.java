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
public class BreedDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public BreedDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(BreedDTO breed)
    {
        try{
            String qry = "insert into Breed value ("
                    + "'" + breed.getId() + "'" 
                    + ", "+ "N'" + breed.getName() + "'"  
                    + ", "+ "N'" + breed.getRegion() + "'"
                    + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm breed thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm breed thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from Breed "
                    + " where breedID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch(SQLException ex){
            
        }
    }
    
    public void edit(BreedDTO breed)
    {
        try{
            String qry = " Update Breed "
                    + " set "
                    + " breedName = N'" +breed.getName()+ "', "
                    + " region = N'" + breed.getRegion()+ "', "
                    + " where breedID = '" +breed.getId()+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch(SQLException ex){
            
        }
    }
    
    public ArrayList readBreedList()
    {
        ArrayList list = new ArrayList<BreedDTO>();
        try{
            String qry = "select * from Breed";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                BreedDTO breed = new BreedDTO();
                breed.setId(rs.getString("breedID"));
                breed.setName(rs.getString("breedName"));
                breed.setRegion(rs.getString("region"));
                list.add(breed);
            }
        }
        catch(SQLException ex)
        {
            
        }
        return list;
    }
}
