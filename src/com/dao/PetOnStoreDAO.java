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
public class PetOnStoreDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public PetOnStoreDAO() {
        conn = MyConnection.getConnection();
    }
    
    public ArrayList readPOSList()
    {
        ArrayList POSList = new ArrayList<PetOnStoreDTO>();
        try{
            String qry = "Select * from Customer";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                PetOnStoreDTO pet = new PetOnStoreDTO();
                
                
            }
        }
        catch(SQLException ex){
            
        }
        return POSList;
    }
    
    
}
